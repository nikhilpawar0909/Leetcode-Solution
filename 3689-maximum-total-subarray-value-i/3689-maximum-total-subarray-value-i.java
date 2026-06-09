class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long min = nums[0];
        long max = nums[0];

        for(int i = 1; i < nums.length; i++){
            min = Math.min(min, nums[i]);
        }
        for(int i = 1; i < nums.length; i++){
            max = Math.max(max, nums[i]);
        }

        return (max - min) * k;
    }
}