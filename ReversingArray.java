package exercise;
import java.util.*;
public class ReversingArray {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=input.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
		System.out.println("enter the element "+i);
		a[i]=input.nextInt();
		}
		System.out.println("array before reversing : ");
		for(int i=0;i<n;i++) {
		System.out.print(a[i]+" ");

		}
		System.out.println("");
		System.out.println("array after reversing : ");
		for(int i=n-1;i>=0;i--) {
		System.out.print(a[i]+" ");
		}

		}
		}


