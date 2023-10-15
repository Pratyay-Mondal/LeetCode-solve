class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();
        if(nums==null || nums.length==0)
            return ans;

        permute(ans, nums, 0);
        return ans;
    }


    void permute(List<List<Integer>> ans, int[] nums, int index){
        if(index==nums.length){
            List<Integer> temp = new ArrayList<>();
            for(int i:nums)
                temp.add(i);
            ans.add(temp);    
            return;
        }

        Set<Integer> appear = new HashSet<>();
        for(int i=index; i<nums.length; i++){
            if(appear.add(nums[i])){
                swap(nums, index, i);
                permute(ans, nums, index+1);
                swap(nums, index, i);
            }
        }
    }

    void swap(int[] nums, int i, int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

}
