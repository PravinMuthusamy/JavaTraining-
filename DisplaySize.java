package exercise.Ex7;
import java.io.File;

public class DisplaySize {
	public static void main(String[] args) {
		try {
			File file = new File("/Users/pravinm/Documents/exercise/exercise/Ex7/rename.txt");
			System.out.println(file.length());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}