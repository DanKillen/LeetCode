/**
 * Created by Daniel Killen on 23/06/2024
 * UPDATE COMMENTS ABOUT PROGRAM HERE
 **/
public class FactorialGenerator
{

   public static void main (String[] args) {
      System.out.println(factorial(5));
   }

   static int factorial(int n) {
      if (n > 1)
      {
         n *= factorial(n - 1);
      }
      return n;
   }

}
