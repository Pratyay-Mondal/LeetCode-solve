class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        List<Integer> res = new ArrayList<>();

        for(int num : nums){
            int n = Math.abs(num);
            int index = n - 1;
            if(nums[index] < 0){
                res.add(n);
            }
            nums[index] = -nums[index];
        }

        return res;

    
    }
}
