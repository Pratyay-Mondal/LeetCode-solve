










// ---------------------------------------------------------------------------------------------------------------------------------------------


class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        Set<List<Integer>> hs = new HashSet<>();


        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){
                    for(int l=k+1; l<nums.length; l++){
                        if((nums[i] + nums[j] + nums[k] + nums[l]) == target){
                           List<Integer> temp = new ArrayList<>();
 
                            temp.add(nums[i]);
                            temp.add(nums[j]);
                            temp.add(nums[k]);
                            temp.add(nums[l]);
                            Collections.sort(temp);
                            hs.add(temp);    
                        }
                    }
                }
            }
        }

        List<List<Integer>> res = new ArrayList<>(hs);
        return res;

    }
}



