import java.util.*;
class fibonacci {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int num = sc.nextInt ();
    int  firstTerm = 0, secondTerm = 1;
    System.out.println("Fibonacci Series till " + num + " is: ");

    for (int i = 1; i <= num; ++i) {
      System.out.print(firstTerm + ", ");

      
      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;
    }
  }
}