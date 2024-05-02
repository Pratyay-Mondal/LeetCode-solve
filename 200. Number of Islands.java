class Solution {

    char[][] gr;
    public int numIslands(char[][] grid) {
        int islands = 0;
        gr = grid;

        for(int i=0; i<gr.length; i++){
            for(int j=0; j<gr[i].length; j++){
                islands = islands + sink(i, j);
            }
        }
        return islands;   
    }

    int sink(int i, int j){
        if(i<0 || j<0 || i==gr.length || j==gr[i].length || gr[i][j]=='0')
            return 0;
        gr[i][j]='0';
        sink(i+1, j);
        sink(i-1, j);
        sink(i, j+1);
        sink(i, j-1);
        return 1;
    }
}
