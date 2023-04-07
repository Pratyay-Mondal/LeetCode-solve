class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();
        int n = nums.length;
        if(n<3)
            return list;            
        Arrays.sort(nums);

        int i=0, j;
        while(i < n){
            j=i+1;
            while(j<n){
                int target = -1 *(nums[i] + nums[j]);
                int start=j+1;
                int end=n-1;
                while(start <= end){
                    int mid = start + (end-start)/2;

                    if(target == nums[mid]){
                        List<Integer> li = new ArrayList<>();
                        li.add(nums[i]);
                        li.add(nums[j]);
                        li.add(nums[mid]);
                        list.add(li);
                        break;
                }
                    else if (target < nums[mid]){
                        end = mid-1;
                    } 
                    else {
                        start = mid+1;
                    }  
            }
            int jEle = nums[j];
            while(j<n && nums[j]==jEle)  
                j++;              
            
        }
        int iEle = nums[i];
            while(i<n && nums[i]==iEle)  
                i++;                
    }
        return list;
    }
}
