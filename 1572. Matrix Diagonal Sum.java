
class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int mid = n/2;
        int sum = 0;


        for(int i=0; i<n; i++){
            sum = sum + mat[i][i];
            sum = sum + mat[n-i-1][i];
        
        }

        if(n % 2 == 1){
            sum = sum - mat[mid][mid];
        }

        return sum;
    }
}
