import java.util.Arrays;

/**
 * Created by Daniel Killen on 31/05/2024
 * Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
 *
 * Return the array in the form [x1,y1,x2,y2,...,xn,yn].
 **/
public class ArrayShuffler
{
   static int[] nums = {1, 1, 2, 2};
   static int n = 2;


   public static void main(String args[])
   {
         System.out.println(Arrays.toString(shuffleTheArray(nums, n)));
   }

   public static int[] shuffleTheArray(int[] nums, int n) {
      int[] sortedNums = new int[nums.length];
      for (int i = 0, l = 0; l < nums.length; i++)
      {
         for (int k = i; k < nums.length; k += n, l++)
         {
            sortedNums[l] = nums[k];
         }
      }
      return sortedNums;
   }
}
