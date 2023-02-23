//q1
import java.io.FileReader;

 class IOException {
    public static void main(String[] args) {
        try{
            FileReader fileReader=new FileReader("test.txt");
        System.out.println(fileReader.read());
        fileReader.close();}
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
