class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int startRow=0,startCol=0,endRow=matrix.length-1,endCol=matrix[0].length-1;
        List<Integer> list=new ArrayList<>();
        while(startRow<=endRow && startCol<=endCol){
            for(int i=startCol;i<=endCol;i++){
                list.add(matrix[startRow][i]);
            }
            for(int i=startRow+1;i<=endRow;i++){
                list.add(matrix[i][endCol]);
            }
            if(!(startRow<endRow && startCol<endCol)){
                break;
            }
            for(int i=endCol-1;i>=startCol;i--){
                list.add(matrix[endRow][i]);
            }
            for(int i=endRow-1;i>startRow;i--){
                list.add(matrix[i][startCol]);
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
        return list;
    }
}
