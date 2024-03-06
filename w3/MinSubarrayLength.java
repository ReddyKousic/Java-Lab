// MUNI KOUSIC KUMAR REDDY T 23MIS7091

public class MinSubarrayLength {

    public static int minSubArrayLen(int target, int[] nums) {
        int minLength = nums.length + 1; // Initializing minLength with a sentinel value
        int sum = 0;
        int left = 0;
        boolean found = false; // flag to check if any subarray satisfying the condition is found

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= target) {
                found = true;
                minLength = Math.min(minLength, right - left + 1);
                sum -= nums[left++];
            }
        }

        return found ? minLength : 0; // returning 0 if no subarray satisfying the condition is found
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3, 5, 6, 8};
        int target = 7;
        int minLen = minSubArrayLen(target, nums);
        System.out.println("Minimal length of subarray: " + minLen);
    }
}
 