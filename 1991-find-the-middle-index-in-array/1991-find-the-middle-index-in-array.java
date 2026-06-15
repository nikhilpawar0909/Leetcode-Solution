class Solution {
    public int findMiddleIndex(int[] nums) {

        for (int middleIndex = 0; middleIndex < nums.length; middleIndex++) {

            int leftSum = 0;
            int rightSum = 0;

            for (int i = 0; i < middleIndex; i++) {
                leftSum += nums[i];
            }

            for (int i = middleIndex + 1; i < nums.length; i++) {
                rightSum += nums[i];
            }

            if (leftSum == rightSum) {
                return middleIndex;
            }
        }

        return -1;
    }
}