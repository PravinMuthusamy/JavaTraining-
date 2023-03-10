package exercise.Ex7;
import java.io.File;
import java.io.IOException;

public class FileRename {
	public static void main(String[] args) throws IOException {
		File oldfile = new File("/Users/pravinm/Documents/exercise/exercise/Ex7/source.txt");
		File newfile = new File("/Users/pravinm/Documents/exercise/exercise/Ex7/rename.txt");
		oldfile.createNewFile();
		if (oldfile.renameTo(newfile)) {
			System.out.println("File name succesfully changed");
		} else {
			System.out.println("Rename failed");
		}
	}
}