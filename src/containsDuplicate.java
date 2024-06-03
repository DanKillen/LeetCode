import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Daniel Killen on 12/05/2024
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 **/
public class containsDuplicate
{

   public static void main(String args[])
   {
      int[] nums = {1,2,3,1};
      int[] nums2 = {1,2,3,4};
      int[] nums3 = {1,1,1,3,3,4,3,2,4,2,};
      System.out.println(containsDuplicate(nums));
      System.out.println(containsDuplicate(nums2));
      System.out.println(containsDuplicate(nums3));
   }

   public static boolean containsDuplicate(int[] nums) {
      Set<Integer> numsSet = new HashSet<>();
      for (int i = 0; i < nums.length; i++)
      {
         numsSet.add(nums[i]);
      }
      return !(numsSet.size() == nums.length);
   }
}
