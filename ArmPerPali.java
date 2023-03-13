import java.util.Scanner;
import java.lang.Math;

public class ArmPerPali {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		System.out.print("Enter a number : ");
		n = sc.nextInt();
		if(armstrong(n))
			System.out.println("It is an armstrong number.");
		if(perfectNo(n))
			System.out.println("It is a perfect number.");
		if(palindrome(n))
			System.out.println("It is a palindrome.");
	}
	
	public static boolean armstrong(int n) {
		int d, t = n, count = 0, sum = 0;
		
		while(t!=0) {
			t /= 10;
			count++;
		}
		
		t = n;
		
		while(t!=0) {
			d = t % 10;
			sum += (Math.pow(d, count));
			t /= 10;
		}
		
		if(sum == n)
			return true;
		else
			return false;
	}
	
	public static boolean perfectNo(int n) {
		int sum = 0;
		for(int i=1; i<n; i++) {
			if(n%i == 0)
				sum += i;
		}
		if(sum == n)
			return true;
		else
			return false;
	}

	public static boolean palindrome(int n) {
		int pal = 0, d, t = n;
		while(t!=0) {
			d = t % 10;
			pal = (pal * 10) + d;
			t /= 10;
		}
		if(pal == n)
			return true;
		else
			return false;
	}
}

