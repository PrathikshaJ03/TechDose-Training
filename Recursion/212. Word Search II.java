class Solution {
    class Trie{
        Trie next[]=new Trie[26];
        String s;
    }
    List<String> res=new ArrayList<>();
    public List<String> findWords(char[][] board, String[] words) {
        Trie root=build(words);
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                dfs(board,root,i,j);
            }
        }
        return res;
    }
    void dfs(char board[][],Trie p,int row,int col){
        char c=board[row][col];
        if(board[row][col]=='#' || p.next[c-'a']==null){
            return;
        }
        p=p.next[c-'a'];
        if(p.s!=null){
            res.add(p.s);
            p.s=null;
        }
        board[row][col]='#';
        if(row>0){
            dfs(board,p,row-1,col);
        }
        if(col>0){
            dfs(board,p,row,col-1);
        }
        if(row<board.length-1){
            dfs(board,p,row+1,col);
        }
        if(col<board[0].length-1){
            dfs(board,p,row,col+1);
        }
        board[row][col]=c;
    }
    Trie build(String words[]){
        Trie root=new Trie();
        for(String s:words){
            Trie p=root;
            for(char ch:s.toCharArray()){
                int i=ch-'a';
                if(p.next[i]==null){
                    p.next[i]=new Trie();
                }
                p=p.next[i];
            }
            p.s=s;
        }
        return root;
    }
}
