class RotateArray {
   
   /*
    Given an integer array nums, rotate func rotates the array k times to the right.
    k is non-negative.
    - If k is positive, rotating the array k times is equivalent to rotating the array k%N times where N is len of array.
    - If k is negative, rotating the array k times is equivalent to k%N + N
    Reverse the first part of the array 0 to N-k-1 first. Then, reverse the second part of the array N-k to N-1
    Finally, reverse the entire array 0 to N-1. 
    This will rotate the array k times.
   */

    public void rotate(int[] nums, int k) {
        int numOfRotations = k%nums.length;
        reverse(nums, 0, nums.length - numOfRotations - 1);
        reverse(nums, nums.length - numOfRotations, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    }
    
    private void reverse(int[] nums, int low, int high) {
        int temp;
        while(low < high) {
            temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;
            low++;
            high--;
        }
    }
}