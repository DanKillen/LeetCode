import java.util.Arrays;

/**
 * Created by Daniel Killen on 04/05/2024
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
 *
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 *
 * Write the code that will take a string and make this conversion given a number of rows:
 *
 * string convert(string s, int numRows);
 **/
public class ConversionZigzag
{

   public static void main(String args[])
   {
      System.out.println(convert("PAYPALISHIRING",3));
      System.out.println(convert("PAYPALISHIRING",4));
      System.out.println(convert("A",1));

   }
   public static String convert(String s, int numRows) {
      if (numRows == 1)
      {
         return s;
      }
      String[] answerArray = new String[numRows];
      Arrays.fill(answerArray, "");
      String answer = "";
      int index = 0;
      int currentLine = 0;
      boolean zig = true;
      while (index < s.length())
      {
         if (zig)
         {
            if (currentLine + 1 < numRows)
            {
               answerArray[currentLine++] += s.charAt(index++);
            }
            else
            {
               zig = false;
            }
         }
         else
         {
            if (currentLine > 0)
            {
               answerArray[currentLine--] += s.charAt(index++);
            }
            else
            {
               zig = true;
            }
         }
      }
      for (int i = 0; i < numRows; i++)
      {
         answer += answerArray[i];
      }

      return answer;
   }
}
