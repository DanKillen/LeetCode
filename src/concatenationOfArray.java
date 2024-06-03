/**
 * Created by Daniel Killen on 27/05/2024
 * Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i]
 * and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
 * Specifically, ans is the concatenation of two nums arrays.
 * Return the array ans.
 **/

import org.junit.Assert;

import java.util.Arrays;

public class concatenationOfArray
{
   static int[] nums = {1,2,1};

   public static void main(String args[])
   {
      System.out.println(Arrays.toString(concatenationOfArray(nums)));
   }

   public static int[] concatenationOfArray(int[] nums) {
      int[] ans = new int [nums.length * 2];
      for (int i = 0; i < nums.length; i++)
      {
         ans[i] = nums[i];
         ans[i + nums.length] = nums[i];
      }
      return ans;
   }
}
