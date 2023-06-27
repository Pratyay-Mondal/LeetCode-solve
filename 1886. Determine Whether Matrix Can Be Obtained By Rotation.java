class Solution {

    public boolean findRotation(int[][] mat, int[][] target) {
               
        for(int i=0; i<4; i++){
            if(Arrays.deepEquals(mat, target))
                return true;
            rotate(mat);    
        }
        return false;
    }


    public void rotate(int[][] mat){
               
        for(int i=0; i<mat.length; i++){
            for(int j=i; j<mat.length; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat.length/2; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[i][mat.length-1-j];
                mat[i][mat.length-1-j] = temp;
            }
        }   

    }

}
