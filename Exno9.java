import java.util.Scanner;

public class Exno9 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Conversion con=new Conversion();
		NumberCheck nc=new NumberCheck();
		String m;
		int mark,sum=0;
		float avg;
		System.out.println("Enter marks of 10 students");
		for(int i=0;i<10;i++) {
			System.out.println("Enter mark of student"+(i+1));
			m=scan.next();
			mark=con.convert(m);
			mark=nc.check(mark);
			sum+=mark;
		}
		avg=(float)sum/10;
		System.out.println(avg);


	}

}
class Conversion{
	int convert(String m) {
		int mark=0;
		try {
			mark=Integer.parseInt(m);
		}catch(NumberFormatException e) {
			System.out.println(e);
		}
		return mark;
	}
}
class NumberCheck{
	public int check(int num){
		try {
		if(num<0)
			throw new NegativeException("Enter positive number");
		else if(num>100)
			{
                throw new OutOfRangeException("Enter mark in range(0-100)");}
            else 
			{return num;
		}
    }
    catch(Exception e) {
			System.out.println(e);
		}
		return 0;
	}
}
abstract class UserException extends Exception{
	public abstract void excep();
}
class NegativeException extends UserException{
	String msg;
	NegativeException(String msg){
		this.msg=msg;
	}

	public void excep() {
		System.out.println(msg);
		
	}
	
}
class OutOfRangeException extends UserException{
	String msg;
	OutOfRangeException(String msg){
		this.msg=msg;
	}

	
	public void excep() {
		System.out.println(msg);
		
	}
	
}