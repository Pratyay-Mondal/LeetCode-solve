class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int sum=0, start=0, ans=Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];

            while(sum >= target){
                ans = Math.min(ans, i-start+1);
                sum = sum - nums[start];
                start++;
            }
        }

        return ans==Integer.MAX_VALUE ? 0 : ans;

    }
}
