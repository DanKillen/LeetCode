/**
 * Created by Daniel Killen on 27/05/2024
 * You are given a list of strings operations, where operations[i] is the ith operation you must apply to the record and is one of the following:
 * An integer x.
 * Record a new score of x.
 * '+'.
 * Record a new score that is the sum of the previous two scores.
 * 'D'.
 * Record a new score that is the double of the previous score.
 * 'C'.
 * Invalidate the previous score, removing it from the record.
 **/

import java.util.Stack;

public class StackOperations
{
   static String[] operations1 = {"5","-2","4","C","D","9","+","+"};

   public static void main(String[] args)
   {
      System.out.println(calPoints(operations1));
   }

   public static int calPoints(String[] operations) {
      Stack<Integer> scoresStack = new Stack<>();
      for (int i = 0, size = 0; i< operations.length; i++)
      {
         if (operations[i].equals("+"))
         {
            scoresStack.push(scoresStack.get(size - 1) + scoresStack.get(size - 2));
            size++;
         }
         else if (operations[i].equals("D"))
         {
            scoresStack.push((scoresStack.peek()) * 2);
            size++;
         }
         else if (operations[i].equals("C"))
         {
            scoresStack.pop();
            size--;
         }
         else
         {
            scoresStack.push(Integer.valueOf(operations[i]));
            size++;
         }
      }
      int total = 0;
      for (Integer integer : scoresStack)
      {
         total += integer;
      }
      return total;
   }
}
