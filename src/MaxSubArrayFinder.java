/**
 * Created by Daniel Killen on 16/06/2024
 * Given an integer array nums, find the subarray with the largest sum, and return its sum.
 **/
public class MaxSubArrayFinder
{

   public static void main(String[] args) {
      System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
      System.out.println(maxSubArray(new int[]{5,4,-1,7,8}));
   }

   public static int maxSubArray(int[] nums) {
      if (nums.length == 1)
      {
         return nums[0];
      }
      int maxAnswer = nums[0];
      int currentCount = 0;
      for (int i = 0; i < nums.length; i++) {
         currentCount += nums[i];
         maxAnswer = Math.max(currentCount, maxAnswer);
         if (currentCount < 1)
         {
            currentCount = 0;
         }
      }
      return maxAnswer;
   }
}
