//Method 1
class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set=new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char ch=board[i][j];
                if(ch!='.'){
                if(set.contains(ch+"r"+i) || set.contains(ch+"c"+j) || set.contains(ch+"b"+i/3+j/3)){
                    return false;
                }
                set.add(ch+"r"+i);
                set.add(ch+"c"+j);
                set.add(ch+"b"+i/3+j/3);
                }
            }
        }
        return true;
    }
}

//Method 2
class Solution {
    public boolean isValidSudoku(char[][] board) {       
        for(int i=0;i<9;i++){
            int freq[]=new int[10];
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                   freq[board[i][j]-'0']++;
                   if(freq[board[i][j]-'0']>1){
                       return false;
                   }
                }
            }
        }
        for(int j=0;j<9;j++){
            int freq[]=new int[10];
            for(int i=0;i<9;i++){
                if(board[i][j]!='.'){
                    freq[board[i][j]-'0']++;
                    if(freq[board[i][j]-'0']>1){
                        return false;
                    }
                }
            }
        }
        for(int i=0;i<=6;i+=3){
            for(int j=0;j<=6;j+=3){
                int freq[]=new int[10];
                for(int m=i;m<i+3;m++){
                    for(int n=j;n<j+3;n++){
                        if(board[m][n]!='.'){
                            freq[board[m][n]-'0']++;
                            if(freq[board[m][n]-'0']>1){
                                 return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
