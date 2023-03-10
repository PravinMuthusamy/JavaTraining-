package exercise.Ex7;

import java.io.File;

public class AllFilesAndDirectories {
	public static void main(String[] args) {
		File dirname = new File("/Users/pravinm/Documents/exercise/exercise/Ex7");
		if (dirname.isDirectory()) {
			String string[] = dirname.list();
			for (int i = 0; i < string.length; i++) {
				System.out.println(string[i]);
			}
		}

	}

}