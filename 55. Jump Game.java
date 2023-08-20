class Solution {
    public boolean canJump(int[] nums) {
        
        int n = nums.length;

        if(n == 1)
            return true;

        int max=nums[0];

        for(int i=0; i<n; i++){
            if(max <= i && nums[i]==0)
                return false;

            if(i + nums[i] > max)
                max = i + nums[i];  

            if(max >= n-1)
                return true;    
        }  

        return false;
    }
}
