import java.util.Arrays;

/**
 * Created by Daniel Killen on 23/06/2024
 * Given an integer array nums, return an array answer such that answer[i]
 * is equal to the product of all the elements of nums except nums[i].
 **/
public class ProductExceptSelfGenerator
{

   public static void main (String[] args) {

      int[] nums = {-1,1,0,-3,3};

      System.out.println(Arrays.toString(productExceptSelf(nums)));
   }

   static int[] productExceptSelf(int[] nums) {
      int n = nums.length;
      int[] pre = new int[n];
      int[] suff = new int[n];
      pre[0] = 1;
      suff[n - 1] = 1;

      for(int i = 1; i < n; i++) {
         pre[i] = pre[i - 1] * nums[i - 1];
      }
      for(int i = n - 2; i >= 0; i--) {
         suff[i] = suff[i + 1] * nums[i + 1];
      }

      int[] ans = new int[n];
      for(int i = 0; i < n; i++) {
         ans[i] = pre[i] * suff[i];
      }
      return ans;
   }

}
