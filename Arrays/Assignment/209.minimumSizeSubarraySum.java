class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int N=nums.length,sum=0,left=0,right=0;
        int result=Integer.MAX_VALUE;
        while(right<N){
            sum+=nums[right];
            if(sum>=target){
                while(sum>=target){
                    sum-=nums[left];
                    left++;
                }
                result=Math.min(result,right-left+2);
            }
            right++;
        }
        return (result==Integer.MAX_VALUE)?0:result;
    }
}
