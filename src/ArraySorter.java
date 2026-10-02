import java.util.Arrays;

/**
 * Created by Daniel Killen on 25/06/2024
 * Given an array of integers nums, sort the array in ascending order and return it.
 * You must solve the problem without using any built-in functions in O(nlog(n)) time complexity and with the smallest space complexity possible.
 **/

public class ArraySorter
{
   public static void main(String[] args)
   {
      int[] nums = {5, 2, 3, 1};
      System.out.println(Arrays.toString(sortArray(nums)));
   }

   public static int[] sortArray(int[] nums)
   {
      if (nums.length < 2)
      {
         return nums;
      }

      int[] work = new int[nums.length];
      mergeSort(nums, work, 0, nums.length - 1);
      return nums;
   }

   private static void mergeSort(int[] nums, int[] work, int start, int end)
   {
      if (start >= end)
      {
         return;
      }

      int middle = start + (end - start) / 2;
      mergeSort(nums, work, start, middle);
      mergeSort(nums, work, middle + 1, end);
      merge(nums, work, start, middle, end);
   }

   private static void merge(int[] nums, int[] work, int start, int middle, int end)
   {
      int left = start;
      int right = middle + 1;
      int writePos = start;

      while (left <= middle && right <= end)
      {
         if (nums[left] <= nums[right])
         {
            work[writePos] = nums[left];
            left++;
         }
         else
         {
            work[writePos] = nums[right];
            right++;
         }
         writePos++;
      }

      while (left <= middle)
      {
         work[writePos] = nums[left];
         left++;
         writePos++;
      }

      while (right <= end)
      {
         work[writePos] = nums[right];
         right++;
         writePos++;
      }

      for (int i = start; i <= end; i++)
      {
         nums[i] = work[i];
      }
   }
}
