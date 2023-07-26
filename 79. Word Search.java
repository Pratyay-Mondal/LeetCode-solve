class Solution {
    public boolean exist(char[][] board, String word) {

        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(board[i][j] == word.charAt(0) && helper(board, word, 0, i, j)){
                    return true;
                }
            }
        }

        return false;
    }


    boolean helper(char[][] board, String word, int start, int i, int j){
        if(word.length() <= start){
            return true;
        }

        if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j]=='0' || board[i][j] != word.charAt(start)){
            return false;
        }


        char tmp = board[i][j];
        board[i][j] = '0';

        if(helper(board, word, start+1, i+1, j) || helper(board, word, start+1, i-1, j) || helper(board, word, start+1, i, j+1) || helper(board, word, start+1, i, j-1)){
            return true;
        }

        board[i][j] = tmp;


        return false;

    }
    
}
