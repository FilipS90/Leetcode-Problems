class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 1)
            return nums[0];

        int currentSum = 0, max = nums[0];

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > currentSum + nums[i]) {
                currentSum = nums[i];
            } else {
                currentSum += nums[i];
            }

            if(currentSum > max){
                max = currentSum;
            }
        }
        return max;
    }
}