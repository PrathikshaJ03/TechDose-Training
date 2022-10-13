class Solution {
    public int countHousePlacements(int n) {
        long result;
        int mod=(int)1e9+7;
        if(n==1){
            return 4;
        }
        else if(n==2){
            return 9;
        }
        long arr[]=new long[n+1];
        arr[1]=2;
        arr[2]=3;
        for(int i=3;i<=n;i++){
            arr[i]=arr[i-1]+arr[i-2];
            arr[i]=arr[i]%mod;
        }
        result=(arr[n]*arr[n])%mod;
        return (int)result;
    }
}
