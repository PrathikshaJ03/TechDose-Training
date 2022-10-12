class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int result[]=new int[nums.length];
        result[0]=(nums[0]==0)?1:0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==0){
                result[i]=result[i-1]+1;
            }
            else{
                result[i]=0;
            }
        }
        long sum=0;
        for(int i=0;i<result.length;i++){
            sum+=result[i];
        }
        return sum;
    }
}
