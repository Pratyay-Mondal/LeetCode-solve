class Solution {
    public int maxProduct(int[] nums) {

        int max=Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            int sum=1;
            for(int j=i; j<nums.length; j++){
                sum = sum * nums[j];
                max = Math.max(sum, max);
            }
        }

        return max;
    }
}
