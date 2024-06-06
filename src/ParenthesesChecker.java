/**
 * Created by Daniel Killen on 04/05/2024
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 **/
public class ParenthesesChecker
{

   public static void main(String args[])
   {
      System.out.println(isValid("()"));
      System.out.println(isValid("()[]{}"));
      System.out.println(isValid("(]"));
      System.out.println(isValid("{[]}"));
   }
   public static boolean isValid(String s)
   {
      return findBracketPairs(s);
   }

   public static boolean findBracketPairs(String s)
   {
      if (s.equals(""))
      {
         return true;
      }
      for (int index = 0; index < s.length() - 1; index++)
      {
         String twoToCheck = s.substring(index, index + 2);
         if (twoToCheck.equals("{}") || twoToCheck.equals("()") || twoToCheck.equals("[]"))
         {
            return findBracketPairs(s.substring(0, index) + s.substring(index + 2));
         }
      }
      return false;
   }
}
