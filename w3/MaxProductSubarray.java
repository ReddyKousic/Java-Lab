/* 
Given an integer array number find a sub array that has the largest numbers and return the product.

write a java program with class and control statements to implement above senario 

*/

/*

given an array of positive integer numbers and a positive integer target return the minimal length of sub array whose sum is greater than or equal to the target if there are no sub array return zero
*/

// MUNI KOUSIC KUMAR REDDY T 23MIS7091
public class MaxProductSubarray {

    public static int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int temp = maxProduct;
            maxProduct = Math.max(Math.max(maxProduct * nums[i], minProduct * nums[i]), nums[i]);
            minProduct = Math.min(Math.min(temp * nums[i], minProduct * nums[i]), nums[i]);
            result = Math.max(result, maxProduct);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        int maxProduct = maxProduct(nums);
        System.out.println("Max product of a subarray: " + maxProduct);
    }
}
