class RemoveElement {
    public int removeElement(int[] nums, int val) {
        // Pointer for the position of the next valid element
        int k = 0;
        
        // Iterate through each element in the array
        for (int i = 0; i < nums.length; i++) {
            // If current element is not equal to val, keep it
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        
        // k is the number of elements not equal to val
        return k;
    }
}
