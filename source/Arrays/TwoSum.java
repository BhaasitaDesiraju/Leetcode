class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // One pass -> O(n) - time & O(n) space
        int[] result = new int[2];
        
        // create a hashmap - key -> nums[i], value -> i
        HashMap<Integer, Integer> numsMap = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            if(numsMap.containsKey(target - nums[i])) {
                result[0] = numsMap.get(target-nums[i]);
                result[1] = i;
            } else {
                numsMap.put(nums[i], i);
            }
        }
        return result;
    }
}