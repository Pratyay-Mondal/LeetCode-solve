class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
        int[][] arr = new int[image.length][image[0].length];

        for(int i=0; i<image.length; i++){
            int k=0;
            for(int j=image[i].length-1; j>=0; j--){
                arr[i][k] = image[i][j];
                k++;
            }
        }

        for(int i=0; i<image.length; i++){
            for(int j=0; j<image[i].length; j++){
                if(arr[i][j] == 1){
                    arr[i][j] = 0;
                }
                else{
                    arr[i][j] = 1;
                }
            }
        }

        return arr;

    }
}
