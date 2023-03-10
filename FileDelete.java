package exercise.Ex7;
    
import java.io.File;
import java.io.IOException;

public class FileDelete {
	public static void main(String[] args) throws IOException {
		File f = new File("exercise/Ex7/delete.txt");
		try {
			while (true) // 
				if (f.delete()) 
				{
					System.out.println(f.getName() + " deleted");
					return;
				} else {
					f.createNewFile();
				}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
