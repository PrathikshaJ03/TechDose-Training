class Solution {
    
    public static int findMax(int[][] matrix,int row,int col){
        int max=matrix[row][col];
        for(int i=row;i<row+3;i++){
            for(int j=col;j<col+3;j++){
                if(max<matrix[i][j]){
                    max=matrix[i][j];
                }
            }
        }
        return max;
    }
    
    public int[][] largestLocal(int[][] grid) {
        int N=grid.length;
        int maxLocal[][]=new int[N-2][N-2];
        int max=0,row=0,col=0;
        for(int i=0;i<N-2;i++){
            for(int j=0;j<N-2;j++){
                max=findMax(grid,i,j);
                maxLocal[row][col]=max;
                col++;
            }
            row++;
            col=0;
        }
        return maxLocal;
    }
}
