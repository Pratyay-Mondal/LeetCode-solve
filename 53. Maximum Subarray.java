class Solution {
    public int maxSubArray(int[] nums) {
        
        int max_sum = nums[0], temp_sum = nums[0];

        for(int i=1; i<nums.length; i++){
            temp_sum = Math.max(nums[i], (temp_sum+nums[i]));
            max_sum = Math.max(max_sum, temp_sum);
        }

        return max_sum;

    }
}
