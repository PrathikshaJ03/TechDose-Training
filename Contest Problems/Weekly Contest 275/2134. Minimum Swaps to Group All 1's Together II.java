class Solution {
    public int minSwaps(int[] nums) {
        int ones=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                ones++;
            }
        }
        if(ones==0 || ones==nums.length){
            return 0;
        }
        int count=0,min=Integer.MAX_VALUE;
        for(int i=0;i<ones;i++){
            if(nums[i]==0){
                count++;
            }
        }
        min=Math.min(count,min);
        for(int i=1;i<nums.length;i++){
            int j=(i+ones-1)%nums.length;
            if(nums[i-1]==0 && nums[j]==1){
                count--;
            }
            else if(nums[i-1]==1 && nums[j]==0){
                count++;
            }
            min=Math.min(min,count);
        }
        return min;
    }
}
