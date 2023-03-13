package exercise;
import java.util.Scanner;

public class PatternPrinting {
	public static void main(String args[]) {
	int inner;
	int outer;
	int k=1;
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the number of rows and coloums");
	int num=input.nextInt();
	int arr[][]=new int[num][num];
	for(outer=0;outer<num;outer++)
	{
		for(inner=0;inner<=outer;inner++)
		{
			arr[outer][inner]=k;
			k++;
		}
	}
		for(outer=0;outer<num;outer++)
		{
			for(inner=0;inner<=outer;inner++)
			{
				System.out.print(arr[outer][inner]+"\t");
			}
			System.out.println("\t");
		}
	
	}
}
