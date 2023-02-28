package day5;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exno6 {

	public static void main(String[] args) {
	    ExecutorService es=Executors.newFixedThreadPool(1);
		CharacterCount countcharacter=new CharacterCount();
		es.execute(()->{
			while(true)
			countcharacter.getChar();
		});
		es.shutdown();
	}

}
class CharacterCount{
	char character;
	int count=0;
	void getChar() {
		System.out.println("Enter a Character: ");
		Scanner scan=new Scanner(System.in);
		character=scan.next().charAt(0);
		try {
		if(!((character>='a'&&character<='z')||(character>='A'&&character<='Z'))) {
			throw new NonAlphabeticCharException("Enter Only Alphabets");
		}else {
			count++;
		}
		
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Total Characters: "+count);
			System.exit(0);
		}
	}
}
class NonAlphabeticCharException extends Exception{
	public NonAlphabeticCharException(String s) {
		System.out.println(s);	
		}
	
}
