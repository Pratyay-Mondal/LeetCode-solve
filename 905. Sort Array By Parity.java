
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] res = new int[nums.length];
        int j=0;

        for(int i : nums){
            if(i%2 == 0){
                res[j]=i;
                j++;
            }
        }

        for(int i : nums){
            if(i%2 != 0){
                res[j]=i;
                j++;
            }
        }
    return res;
    }
}
