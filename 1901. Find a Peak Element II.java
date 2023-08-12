class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int max = 0;
        int[] arr = new int[2];

        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                if(mat[i][j] > max){
                    max = mat[i][j];
                    arr[0]=i;
                    arr[1]=j;
                }
            }
        }

        return arr;

    }
}
