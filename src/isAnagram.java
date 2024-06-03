import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Daniel Killen on 12/05/2024
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 **/
public class isAnagram
{

   public static void main(String args[])
   {
      System.out.println(isAnagram("anagram", "nagaram"));
      System.out.println(isAnagram("rat", "car"));
      System.out.println(isAnagram("aacc", "ccac"));
   }

   public static boolean isAnagram(String s, String t)
   {
      char[] charS = s.toCharArray();
      char[] charT = t.toCharArray();

      Arrays.sort(charS);
      Arrays.sort(charT);

      return Arrays.equals(charS, charT);
   }
}


//   public static boolean isAnagram(String s, String t) {
//      if (s.length() != t.length())
//      {
//         return false;
//      }
//      char[] charS = s.toCharArray();
//      char[] charT = t.toCharArray();
//
//      for(int i = 0; i < charS.length; i++)
//      {
//         for (int k = 0; k < charT.length; k++)
//         {
//            if (charS[i] == charT[k])
//            {
//               charT[k] = '0';
//               break;
//            }
//         }
//      }
//      for (int j = 0; j < charT.length; j++)
//      {
//         if(charT[j] != '0')
//         {
//            return false;
//         }
//      }
//      return true;
//   }

