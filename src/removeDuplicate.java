import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Daniel Killen on 27/05/2024
 Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
 The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
 **/
public class removeDuplicate
{
   static int[] nums = {1,2,3,1};
   static int[] nums2 = {1,2,3,4};
   static int[] nums3 = {1,1,1,3,3,4,3,2,4,2};

   static int[] nums4 = {-3,-1,0,0,0,3,3};

   public static void main(String args[])
   {

//      System.out.println(removeDuplicates(nums));
//      System.out.println(removeDuplicates(nums2));
//      System.out.println(removeDuplicates(nums3));
      System.out.println(removeDuplicates(nums4));
   }

   public static int removeDuplicates(int[] nums) {
      Set<Integer> numsSet = new LinkedHashSet<>();
      for (int i = 0; i < nums.length; i++) {
         numsSet.add(nums[i]);
      }
      int i = 0;
      for (Integer num : numsSet) {
         nums[i++] = num;
      }
      return numsSet.size();
   }
}
