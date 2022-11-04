class Solution {
    List<List<String>> res=new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char ch[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ch[i][j]='.';
            }
        }
        queenTry(ch,n,0);
        return res;
    }
    void queenTry(char ch[][],int n,int row){
        if(row==n){
            res.add(build(ch));
            return;
        }
        for(int col=0;col<n;col++){
            if(validate(ch,row,col)){
                ch[row][col]='Q';
                queenTry(ch,n,row+1);
                ch[row][col]='.';
            }
        }
    }
    boolean validate(char ch[][],int row,int col){
        for(int i=0;i<row;i++){
            if(ch[i][col]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(ch[i][j]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col+1;i>=0 && j<ch.length;i--,j++){
            if(ch[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    List<String> build(char ch[][]){
        List<String> l=new ArrayList<>();
        for(int i=0;i<ch.length;i++){
            l.add(new String(ch[i]));
        }
        return l;
    }
}
