import java.util.Scanner;
public class Exno9alt {
    public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int mark=0,sum=0;
		float avg;
		System.out.println("Enter marks of 10 students");
        int itr=0;
		while(itr<10) {
			System.out.println("Enter mark of student"+(itr+1));
			mark=scan.nextInt();
            
                try {
                    if(mark<0){
                    throw new NegativeException("Number is a Negative number");
                    }
                } 
                catch (Exception e) {
                    System.out.println(e);;
                    continue;
                }
            
            
                try {
                    if(mark>100){
                    throw new OutOfRangeException("Number is out of range");
                    }
                } catch (Exception e) {
                    System.out.println(e);
                    continue;
                }
                
            
            sum+=mark;
            itr++;
        }

            avg=(float)sum/10;
            System.out.println(avg);
	
	}

}
abstract class UserMadeException extends Exception{
    public abstract void except(); 
}
class NegativeException extends UserMadeException{
    String msg;
	NegativeException(String msg){
		this.msg=msg;    
}
public void except(){
    System.out.println(msg);
}
}
class OutOfRangeException extends UserMadeException{
    String msg;
	OutOfRangeException(String msg){
		this.msg=msg;
}
public void except(){
    System.out.println(msg);
}
}
