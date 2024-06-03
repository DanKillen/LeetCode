import java.util.Stack;

/**
 * Created by Daniel Killen on 02/06/2024
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 **/

public class MinStack
{
   static Stack<Integer> values = new Stack<>();
   public MinStack() {
      values = new Stack<>();
   }

   public void push(int val) {
      values.push(val);
   }

   public void pop() {
      values.pop();
   }

   public int top() {
      return values.peek();
   }

   public int getMin() {
      int minValue = values.get(0);
      for (int i = 1; i < values.size(); i++){
         minValue = java.lang.Math.min(values.get(i), minValue);
      }
      return minValue;
   }
}
