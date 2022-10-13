class Solution {
    public int minimumAverageDifference(int[] nums) {
        int len=nums.length;
        if(len==1){
            return 0;
        }
        long sum[]=new long[len];
        sum[0]=nums[0];
        for(int i=1;i<len;i++){
            sum[i]=nums[i]+sum[i-1];
        }
        int min=Integer.MAX_VALUE,minInd=-1;
        long avg1,avg2;
        for(int i=0;i<nums.length;i++){
            if(i==nums.length-1){
                if(sum[i]/len<min){
                    minInd=i;
                }
                break;
            }
            avg1=sum[i]/(i+1);
            avg2=(sum[len-1]-sum[i])/(len-1-i);
            if(Math.abs(avg1-avg2)<min){
                min=(int)Math.abs(avg1-avg2);
                minInd=i;
            }
        }
        return minInd;
    }
}
