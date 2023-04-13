class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        int n = nums.length;
        HashSet<Integer> hs = new HashSet<>();

        for(int i=0; i<n; i++){
            int count=1;

            for(int j=i+1; j<n; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
          
            if(count > (n/3)){
                hs.add(nums[i]);
            }
        }

        ArrayList<Integer> list = new ArrayList<>(hs);
        return list;
    }
}
