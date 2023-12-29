class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums.length==0)
            return 0;

        Arrays.sort(nums);

        int res = 0, count=1;

        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[i-1]){
                if(nums[i] == nums[i-1]+1){
                    count++;
                }
                else{
                    res = Math.max(res, count);
                    count = 1;
                }
            }
                              
        }

        return Math.max(res, count);

    }
}
