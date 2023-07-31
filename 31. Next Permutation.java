class Solution {
    public void nextPermutation(int[] nums) {
        
        int l = nums.length-1;

        while(l>0 && nums[l] <= nums[l-1]){
            l--;
        }
        
        if(l==0){
            Arrays.sort(nums);
            return;
        }

        int k=l;
        while(k<nums.length && nums[k] > nums[l-1]){
            k++;
        }
        k--;

        int temp = nums[l-1];
        nums[l-1]=nums[k];
        nums[k]=temp;

        Arrays.sort(nums, l, nums.length);


    }
}
