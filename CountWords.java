package exercise.Ex7;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.Scanner;

public class CountWords {
	public static void main(String[] args) throws IOException {
        Scanner scan=new Scanner(System.in);
		String input;
        System.out.println("Enter the Sentence");
        input=scan.nextLine();
		int count=0;
		try(BufferedReader reader =new BufferedReader(new StringReader(input))){
			String line;
			while((line=reader.readLine())!=null) {
				String[] words=line.split("\\s+");
                for(int i=0; i<words.length; i++){
				    count++;
                }
			}
			
		}catch(IOException e) {
				e.printStackTrace();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		System.out.println("No.of words "+count);
	}

}