package exercise.Ex7;
import java.util.Scanner;

public class CountCharacters {
	public static void main(String[] args) {
		int count=0;
		try(Scanner scanner=new Scanner(System.in)) {
			
			
			while(scanner.hasNext()) {
				String line=scanner.nextLine();
				count+=line.length();
			}
			
		}
		finally{
			System.out.println("Total Count="+count);
		}

	}

}