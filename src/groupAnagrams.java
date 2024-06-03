//import java.lang.reflect.Array;
//import java.util.*;
//
///**
// * Created by Daniel Killen on 12/05/2024
// * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
// * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
// * typically using all the original letters exactly once.
// *
// **/
//public class groupAnagrams
//{
//
//   public static void main(String args[])
//   {
//      System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
//      System.out.println(groupAnagrams(new String[]{""}));
//      System.out.println(groupAnagrams(new String[]{"a"}));
//   }
//
//   public static List<List<String>> groupAnagrams(String[] strs)
//   {
//      if (strs.length < 1)
//      {
//         List<String> stringList= new ArrayList<>();
//         stringList.add("");
//         List<List<String>> emptyStringList = new ArrayList<>();
//         emptyStringList.add(stringList);
//      }
//
//      //TO DO- use a dictionary, so you can pair the original value with char[]
//      List<char[]> charArrayList = new ArrayList<>();
//      Map<String, char[]> originalAndSorts = new HashMap<>();
//      for (int i = 0; i < strs.length; i++)
//      {
//         char[] chars = strs[i].toCharArray();
//         Arrays.sort(chars);
//         originalAndSorts.put(strs[i], chars);
//      }
//      List<List<String>> sortedStrings = new ArrayList<>();
//
//      ArrayList<List<Dictionary<String, char[]>>> charAnagramList = new ArrayList<>();
//      List<Dictionary<String, char[]>>charAnagram = new ArrayList<>();
//      charAnagram.add(charArrayList.get(0));
//      charAnagramList.add(charAnagram);
//      charArrayList.remove(0);
//      while (!originalAndSorts.isEmpty())
//      {
//         for (int i = 0; i < sortedStrings.size(); i++)
//         {
//            if (originalAndSorts.containsValue(sortedStrings.get(i).get(0)))
//            {
//               charAnagramList.get(i).add(charArrayList.get(0));
//               charArrayList.remove(0);
//            }
//            else
//            {
//               charAnagramList.add(new ArrayList<char[]>(Collections.singleton(charArrayList.get(0))));
//               charArrayList.remove(0);
//            }
//            break;
//         }
//      }
//      List<List<String>> stringAnagramList = new ArrayList<>();
//      for (int i = 0; i <  charAnagramList.size(); i++)
//      {
//         stringAnagramList.add(new ArrayList<>());
//         for (int k = 0; k < charAnagramList.get(i).size(); k++)
//         {
//            stringAnagramList.get(i).add(Arrays.toString(charAnagramList.get(i).get(k)));
//         }
//      }
//      return stringAnagramList;
//   }
//}
//
//
////   public static boolean isAnagram(String s, String t) {
////      if (s.length() != t.length())
////      {
////         return false;
////      }
////      char[] charS = s.toCharArray();
////      char[] charT = t.toCharArray();
////
////      for(int i = 0; i < charS.length; i++)
////      {
////         for (int k = 0; k < charT.length; k++)
////         {
////            if (charS[i] == charT[k])
////            {
////               charT[k] = '0';
////               break;
////            }
////         }
////      }
////      for (int j = 0; j < charT.length; j++)
////      {
////         if(charT[j] != '0')
////         {
////            return false;
////         }
////      }
////      return true;
////   }
//
