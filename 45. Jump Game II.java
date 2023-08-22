class Solution {
    public int jump(int[] nums) {
        
        int len = nums.length;
        int jumps=0, curr=0, further=0;

        for(int i=0; i<len-1; i++){
            further = Math.max(further, i+nums[i]);
            if(i == curr){
                jumps++;
                curr = further;
            }       

        }      

        return jumps;

    }
}
