class Solution {
    public int maximumGap(int[] nums) {
        
        Arrays.sort(nums);

        int ans=0;

        for(int i=1; i<nums.length; i++){
            ans = Math.max(ans, (nums[i] - nums[i-1]));
        }


        return ans;

    }
}
