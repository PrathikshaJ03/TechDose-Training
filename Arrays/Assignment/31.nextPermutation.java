class Solution {
    public void nextPermutation(int[] nums) {
        int len=nums.length;
        if(len<=1){
            return;
        }
        int lastInc=-1;
        for(int i=1;i<len;i++){
            if(nums[i]>nums[i-1]){
                lastInc=i;
            }
        }
        if(lastInc==-1){
            for(int i=0;i<len/2;i++){
                int temp=nums[i];
                nums[i]=nums[len-i-1];
                nums[len-i-1]=temp;
            }
            return;
        }
        int index=lastInc;
        for(int i=lastInc;i<len;i++){
            if(nums[i]<nums[index] && nums[i]>nums[lastInc-1]){
                index=i;
            }
        }
        int temp=nums[lastInc-1];
        nums[lastInc-1]=nums[index];
        nums[index]=temp;
        Arrays.sort(nums,lastInc,len);
    }
}
