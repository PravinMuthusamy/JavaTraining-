package exercise.Ex7;

import java.io.BufferedReader;
import java.io.FileReader;

public class PrintContent {
	public static void main(String[] args) {
		try(BufferedReader reader=new BufferedReader(new FileReader("/Users/pravinm/Documents/exercise/exercise/Ex7/source.txt"))){
			
			String line;
			while((line=reader.readLine())!=null) {
				System.out.println(line);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
