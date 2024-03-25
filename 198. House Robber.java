class Solution {
    public int rob(int[] nums) {
        
        if(nums.length==0)
            return 0;

        int pre1=0, pre2=0;

        for(int n : nums){
            int temp = pre1;
            pre1 = Math.max(pre2+n, pre1);
            pre2 = temp;
        }    


        return pre1;
    }
}
