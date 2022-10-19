class Solution {
    public int orangesRotting(int[][] grid) {
        int res=0,fresh=0;
        int R=grid.length,C=grid[0].length;
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        while(fresh>0){
            int temp=fresh;
            for(int i=0;i<R;i++){
                for(int j=0;j<C;j++){
                    if(grid[i][j]==2){
                        if(i-1>=0 && grid[i-1][j]==1){
                            fresh--;
                            grid[i-1][j]=3;
                        }
                        if(i+1<R && grid[i+1][j]==1){
                            fresh--;
                            grid[i+1][j]=3;
                        }
                        if(j+1<C && grid[i][j+1]==1){
                            fresh--;
                            grid[i][j+1]=3;
                        }
                        if(j-1>=0 && grid[i][j-1]==1){
                            fresh--;
                            grid[i][j-1]=3;
                        }
                    }
                }
            }
            if(fresh==temp){
                return -1;
            }
            for(int i=0;i<R;i++){
                for(int j=0;j<C;j++){
                    if(grid[i][j]==3){
                        grid[i][j]=2;
                    }
                }
            }
            res++;
        }
        return res;
    }
}
