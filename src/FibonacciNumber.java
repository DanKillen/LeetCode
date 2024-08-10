/**
 * Created by Daniel Killen on 15/06/2024
 * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence,
 * such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
 *
 * F(0) = 0, F(1) = 1
 * F(n) = F(n - 1) + F(n - 2), for n > 1.
 * Given n, calculate F(n).
 **/
public class FibonacciNumber
{

   public static void main(String[] args)
   {
      System.out.println(fib(2));
      System.out.println(fib(3));
      System.out.println(fib(4));
      System.out.println(fib(10));
      System.out.println(recursiveFib(2));
      System.out.println(recursiveFib(3));
      System.out.println(recursiveFib(4));
      System.out.println(recursiveFib(10));
   }
   public static int fib(int n) {
      if (n == 0 || n == 1)
      {
         return n;
      }
      int prev = 0;
      int current = 1;
      int fib = current + prev;
      for (int i = 1; i < n; i++)
      {
         fib = current + prev;
         prev = current;
         current = fib;
      }
      return fib;
   }

   public static int recursiveFib(int n) {
      if (n <= 1)
      {
         return n;
      }
      return recursiveFib(n-1) + recursiveFib(n-2);
   }
}
