class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        
        int len = triangle.size();

        int[] arr = new int[len+1];

        for(int i=len-1; i>=0; i--){
            for(int j=0; j<triangle.get(i).size(); j++){
                arr[j] = Math.min(arr[j], arr[j+1]) + triangle.get(i).get(j);
            }
        }
    
        return arr[0];

    }
}
