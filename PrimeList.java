public class PrimeList {
    public static void main (String[]args)
  {

    int lower = 1, upper = 100;


    for (int i = lower; i <= upper; i++)
      if (isPrime (i))
       System.out.print (" "+i);
  }

  static boolean isPrime (int n)
  {
 
    if (n < 2)
      {
		return false;
	  }
    
    for (int i = 2; i < n; i++)
      {
    if (n % i == 0)
       return false;
      }

  
    return true;
  }
}

