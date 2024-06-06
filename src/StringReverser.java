/**
 * Created by Daniel Killen on 12/05/2024
 * A simple function to reverse a string
 **/
public class StringReverser
{

   public static void main(String args[])
   {
      builderVbuffer();
   }

   public static void builderVbuffer()
   {
      long startTime = System.currentTimeMillis();

      StringBuffer buffer = new StringBuffer("Hello ");
      System.out.println(buffer.capacity());
      for (int i = 0; i < 10000; i++)
      {
         buffer.append("World");
      }
      System.out.println(buffer.capacity());

      System.out.println("Time Taken By StringBuffer: " + (System.currentTimeMillis()-startTime));

      long secondStartTime = System.currentTimeMillis();

      StringBuilder builder = new StringBuilder("Hello ");
      System.out.println(builder.capacity());
      for (int i = 0; i < 10000; i++)
      {
         builder.append("World");
      }
      System.out.println(builder.capacity());

      System.out.println("Time Taken By StringBuilder: " + (System.currentTimeMillis()-startTime));

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

