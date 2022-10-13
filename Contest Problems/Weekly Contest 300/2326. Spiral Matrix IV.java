class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int result[][]=new int[m][n];
        for(int x[]:result){
            Arrays.fill(x,-1);
        }
        ListNode temp=head;
        int startRow=0,startCol=0,endRow=m-1,endCol=n-1;
        while(temp!=null){
            
            for(int i=startCol;i<=endCol;i++){
                if(temp==null){
                    break;
                }
                result[startRow][i]=temp.val;
                temp=temp.next;
            }
            
            for(int i=startRow+1;i<=endRow;i++){
                if(temp==null){
                    break;
                }
                result[i][endCol]=temp.val;
                temp=temp.next;
            }
            
            for(int i=endCol-1;i>=startCol;i--){
                if(temp==null){
                    break;
                }
                result[endRow][i]=temp.val;
                temp=temp.next;
            }
            
            for(int i=endRow-1;i>startRow;i--){
                if(temp==null){
                    break;
                }
                result[i][startCol]=temp.val;
                temp=temp.next;
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        return result;
    }
}
