class Solution {
    
    public static int countOfSetBit(int N){
        int count=0;
        while(N>0){
            if((N&1)==1){
                count++;
            }
            N=N>>1;
        }
        return count;
    }
    
    public int[] countBits(int n) {
        int res[]=new int[n+1];
        res[0]=0;
        for(int i=1;i<=n;i++){
            res[i]=countOfSetBit(i);
        }
        return res;
    }
}
