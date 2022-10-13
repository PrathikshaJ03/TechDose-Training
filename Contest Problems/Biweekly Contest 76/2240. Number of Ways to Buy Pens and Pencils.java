class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        if(total<cost1 && total<cost2){
            return 1;
        }
        int max=Math.max(cost1,cost2);
        int min=Math.min(cost1,cost2);
        long result=0;
        for(int i=total;i>=0;i=i-max){
            int k=i/min;
            result+=k+1;
        }
        return result;
    }
}
