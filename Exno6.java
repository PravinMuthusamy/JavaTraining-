package day5;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exno6 {

	public static void main(String[] args) {
	    ExecutorService es=Executors.newFixedThreadPool(1);
		CharacterCount cc=new CharacterCount();
		es.execute(()->{
			while(true)
			cc.getChar();
		});
		es.shutdown();
	}

}
class CharacterCount{
	char c;
	int count=0;
	void getChar() {
		System.out.println("Enter a Character: ");
		Scanner scan=new Scanner(System.in);
		c=scan.next().charAt(0);
		try {
		if(!((c>='a'&&c<='z')||(c>='A'&&c<='Z'))) {
			throw new NonAlphabeticChar("Enter Only Alphabets");
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
class NonAlphabeticChar extends Exception{
	public NonAlphabeticChar(String s) {
		System.out.println(s);	
		}
	
}
