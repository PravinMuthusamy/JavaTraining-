import java.util.Scanner;
public class Exno8 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		StringtoInt conv=new StringtoInt();
		String m;
		int mark,sum=0;
    
		float avg;
		System.out.println("Enter marks of 10 students");
		for(int i=0;i<10;i++) {
			System.out.println("Enter mark of student"+(i+1));
			m=scan.next();
			mark=conv.convert(m);
			sum+=mark;
		}
		avg=(float)sum/10;
		System.out.println(avg);

	}

}
class StringtoInt{
	int convert(String m) {
		int mark=0;
		try {
		mark=Integer.parseInt(m);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return mark;
	}
} 

