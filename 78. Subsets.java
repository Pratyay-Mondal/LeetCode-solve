class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> ansList = new ArrayList<>();
        Arrays.sort(nums);
        backtracking(ansList, new ArrayList<>(), nums, 0);
        return ansList;

    }


    void backtracking(List<List<Integer>> ansList, List<Integer> tempList, int[] nums, int start){

        ansList.add(new ArrayList<>(tempList));

        for(int i=start; i<nums.length; i++){
            tempList.add(nums[i]);
            backtracking(ansList, tempList, nums, i+1);
            tempList.remove(tempList.size()-1);
        }

    }

}
