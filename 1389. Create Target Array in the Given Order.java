class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> li = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            li.add(index[i], nums[i]); 
        }

        int[] res = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            res[i] = li.get(i); 
        }

        return res;

    }
}
