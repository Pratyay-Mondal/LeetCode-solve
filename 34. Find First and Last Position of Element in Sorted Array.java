class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        if(nums.length==1){
            if(nums[0] == target)
                return new int[]{0,0};
            else
                return new int[]{-1,-1};             
        }

        int[] ans = new int[2];
        ans[0]=-1;
        ans[1]=-1;
     
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                ans[0] = i; 
                break;
            }
        }

        for(int i=nums.length-1; i>=0; i--){
            if(nums[i] == target){
                ans[1] = i; 
                break;
            }
        }

        return ans;
    }   
}
