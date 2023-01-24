import java.util.*;
public class primeNumber
{

  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);	//System.in is a standard input stream  
    int num = sc.nextInt ();
    boolean flag = false;
    for (int i = 2; i <= num / 2; ++i)
      {
	if (num % i == 0)
	  {
	    flag = true;
	    break;
	  }
      }

    if (!flag)
        System.out.println (num + " is a prime number.");
    else
      System.out.println (num + " is not a prime number.");
  }
}
