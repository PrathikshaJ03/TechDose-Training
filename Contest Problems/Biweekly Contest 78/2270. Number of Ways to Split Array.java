class Solution {
    public int waysToSplitArray(int[] nums) {
        long sum[]=new long[nums.length];
        sum[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            sum[i]=sum[i-1]+nums[i];
        }
        int count=0;
        long s1=sum[nums.length-1],s2=0;
        for(int i=0;i<nums.length-1;i++){
            s2=s2+nums[i];
            s1=s1-nums[i];
            if(s2>=s1){
                count++;
            }
        }
        return count;
    }
}
