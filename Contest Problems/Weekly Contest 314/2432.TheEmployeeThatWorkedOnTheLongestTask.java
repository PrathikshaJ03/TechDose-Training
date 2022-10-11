class Solution {
    public int hardestWorker(int n, int[][] logs) {
        int max=logs[0][1];
        int minId=logs[0][0];
        for(int i=1;i<logs.length;i++){
            if(logs[i][1]-logs[i-1][1]==max){
                if(logs[i][0]<minId){
                    minId=logs[i][0];
                    max=logs[i][1]-logs[i-1][1];
                }
            }
            else if(logs[i][1]-logs[i-1][1]>max){
                max=logs[i][1]-logs[i-1][1];
                minId=logs[i][0];
            }
        }
        return minId;
    }
}
