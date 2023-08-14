class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}


// another method

class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for(int i : nums){
            queue.offer(i);

            if(queue.size() > k){
                queue.poll();
            }
        }

        return queue.peek();

    }
}
