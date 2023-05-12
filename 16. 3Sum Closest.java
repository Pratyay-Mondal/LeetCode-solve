
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int res = nums[0]+nums[1]+nums[2];
        int mainDiff = Math.abs(res-target);

        for(int i=0; i<n-2; i++){
             for(int j=i+1; j<n-1; j++){
                  for(int k=j+1; k<n; k++){
                    int temp = nums[i]+nums[j]+nums[k];
                    int diff = Math.abs(temp-target);
                    if(diff < mainDiff){
                        mainDiff = diff;
                        res = temp;
                    }
                  }
             }
        }

        return res;
    }
}
