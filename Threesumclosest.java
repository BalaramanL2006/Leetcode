import java.util.Arrays;

public class Threesumclosest {
    public int threeSumClosest(int[] nums, int target) {
        // Step 1: Sort the array to use two-pointer technique
        Arrays.sort(nums);
        
        // Initialize closestSum with the first possible triplet sum
        int closestSum = nums[0] + nums[1] + nums[2];
        
        // Step 2: Iterate through the array
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            
            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];
                
                // If we find the exact target, return immediately
                if (currentSum == target) {
                    return currentSum;
                }
                
                // Update closestSum if the current triplet is closer to target
                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currentSum;
                }
                
                // Step 3: Move pointers based on comparison with target
                if (currentSum < target) {
                    left++; // Need a larger sum
                } else {
                    right--; // Need a smaller sum
                }
            }
        }
        return closestSum;
    }
}
