class Solution {
    public boolean search(int[] nums, int target) {
        
        HashSet <Integer> set = new HashSet<>();

        for(int i : nums)
            set.add(i);

        if(set.contains(target))
            return true;

        return false;

    }
}

//--------------------------------Optimized with Binary Search----------------------------------------

class Solution {
    public boolean search(int[] nums, int target) {
        Arrays.sort(nums);
        int start = 0, end = nums.length-1; 

        while(start <= end){
            int mid = start + (end-start)/2;
            if(target == nums[mid])
                return true;
            else if(target < nums[mid])
                end = mid-1;
            else
                start = start+1;    
        }

        return false;

    }
}
