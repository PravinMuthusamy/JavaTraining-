package exercise.Ex7;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyImage {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(InputStream in=new FileInputStream("/Users/pravinm/Documents/exercise/exercise/Ex7/ViratKholi.jpg");
			OutputStream out=new FileOutputStream("/Users/pravinm/Documents/exercise/exercise/Ex7/Dhoni.jpg")){
			byte[] buffer=new byte[1024];
			int bytesRead;
			while((bytesRead=in.read(buffer))!=-1) {
				out.write(buffer,0,bytesRead);
				
			}
			for(int i=0;i<buffer.length;i++) {
				System.out.println(buffer[i]+" ");
			}
			System.out.println("Image copied");
		}catch(Exception e) {
			e.printStackTrace();
			
			
			
		}
	}

}
