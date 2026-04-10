class RemoveDuplicates{
    public int removeDuplicates(int[] nums) {
        // Edge case: if array is empty, return 0
        if (nums.length == 0) return 0;
        
        // Use 'i' as the slow pointer to track the position of unique elements
        int i = 0;
        
        // Use 'j' as the fast pointer to scan through the array
        for (int j = 1; j < nums.length; j++) {
            // If we find a value different from the last unique element
            if (nums[j] != nums[i]) {
                // Move the unique element pointer forward
                i++;
                // Update the next unique slot with the newly found unique value
                nums[i] = nums[j];
            }
        }
        
        // Return the number of unique elements (index + 1)
        return i + 1;
    }
}
