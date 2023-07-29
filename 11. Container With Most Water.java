class Solution {
    public int maxArea(int[] height) {
      
        int i =0, j=height.length-1;
        int maxWater=0;

        while(i < j){
            int tempMin = Math.min(height[i], height[j]);
            int water = tempMin * (j-i);
            maxWater= Math.max(maxWater, water);
          
            if(height[i] < height[j])
                i++;
            else
                j--;    
        }

        
    return maxWater;

    }
}
