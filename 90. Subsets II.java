class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> temp = new ArrayList<>();
        generateSubsets(0, nums, temp);
        return ans;
    }

    void generateSubsets(int index, int[] nums, List<Integer> temp){
        ans.add(new ArrayList(temp));
        for(int i=index; i<nums.length; i++){
            if(i != index && nums[i]==nums[i-1]){
                continue;
            }
            temp.add(nums[i]);
            generateSubsets(i+1, nums, temp);
            temp.remove(temp.size()-1);
        }
    }
}
