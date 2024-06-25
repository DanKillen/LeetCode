import java.util.Arrays;

/**
 * Created by Daniel Killen on 25/06/2024
 * Given an array of integers nums, sort the array in ascending order and return it.
 * You must solve the problem without using any built-in functions in O(nlog(n)) time complexity and with the smallest space complexity possible.
 **/

public class ArraySorter {
    public static void main (String[] args){
        int[] nums = {5,2,3,1};
        System.out.println(Arrays.toString(sortArray(nums)));
    }

    public static int[] sortArray(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int j = i - 1;
            while (j >= 0 && nums[j+1] < nums[j]) {
                int tmp = nums[j + 1];
                nums[j + 1] = nums[j];
                nums[j] = tmp;
                j--;
            }
        }
        return nums;

    }
}
