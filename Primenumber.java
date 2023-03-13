package exercise;
import java.util.Scanner;

public class Primenumber {
	static void checkPrime(int number){
		  int iterator;
		  int flag=0; 
		  int till=number/2;    
		  if(number==0)
		  {
		   System.out.println(" Not prime number");
		  }
		  else if(number==1)
		  {
			System.out.println(" Neither prime nor composite number");
		  }
		  else{
			   for(iterator=2;iterator<=till;iterator++)
			   {    
			    if(number % iterator==0){    
			     System.out.println("  Not prime number");    
			     flag=1;    
			     break;    
			    }    
			   }    
			   if(flag==0) 
			   { System.out.println("  Prime number");
			   }
			  }//end of else
			}
			 
	public static void main(String args[]){  
			  Scanner sc=new Scanner(System.in);
			 int n= sc.nextInt();
			  checkPrime(n);
			}  
		} 



