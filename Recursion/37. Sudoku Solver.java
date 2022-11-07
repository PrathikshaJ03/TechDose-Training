class Solution {
    char res[][];
    public void solveSudoku(char[][] board) {
        backtrack(board,0,0);
        board=res;
    }
    public boolean backtrack(char board[][],int i,int j){
        if(j==9){
            return backtrack(board,i+1,0);
        }
        if(i==9){
            res=board;
            return true;
        }
        if(board[i][j]!='.'){
            return backtrack(board,i,j+1);
        }
        for(char ch='1';ch<='9';ch++){
            if(!isValid(ch,board,i,j)){
                continue;
            }
            board[i][j]=ch;
            if(backtrack(board,i,j+1)){
                return true;
            }
            board[i][j]='.';
        }
        return false;
    }
    public boolean isValid(char ch,char board[][],int row,int col){
        for(int i=0;i<9;i++){
            if(board[row][i]==ch){
                return false;
            }
            if(board[i][col]==ch){
                return false;
            }
            if(board[(row/3)*3 + i/3][(col/3)*3 + i%3]==ch){
                return false;
            }
        }
        return true;
    }
}
