package exercise;
import java.util.*;

public class FindAverage {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the total numbers");
		int num=input.nextInt();
		float arr[]=new float[num];
		float sum=0;
		for(int itr=0;itr<num;itr++)
		{
			System.out.println("Enter the next number");
			arr[itr]=input.nextInt();
			sum+=arr[itr];
		}
		float avg=sum/num;
		System.out.println("The average of the numbers is "+avg); 		
	}

}
