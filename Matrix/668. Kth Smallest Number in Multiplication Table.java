class Solution {
    public int findKthNumber(int m, int n, int k) {
        int low=1,high=m*n;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isLessThanK(m,n,k,mid)){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
    public static boolean isLessThanK(int m,int n,int k,int mid){
        int count=0;
        for(int i=1;i<=m;i++){
            count+=Math.min(mid/i,n);
        }
        return count<k;
    }
}
