class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max=weights[0],sum=0;
        for(int i=0;i<weights.length;i++){
            if(weights[i]>max){
                max=weights[i];
            }
            sum+=weights[i];
        }
        if(days>=weights.length){
            return max;
        }
        else if(days==1){
            return sum;
        }
        int high=sum,low=max;
        int result=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(func(weights,days,mid)){
                result=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return result;
    }
    
    public static boolean func(int arr[],int D,int mid){
        int sum=0,days=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]+sum<=mid){
                sum+=arr[i];
            }
            else{
                sum=arr[i];
                days++;
            }
        }
        if(days<=D){
            return true;
        }
        else{
            return false;
        }
    }
}
