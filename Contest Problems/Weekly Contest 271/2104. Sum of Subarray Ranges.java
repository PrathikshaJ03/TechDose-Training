class Solution {
    public long subArrayRanges(int[] nums) {
        int max,min;
        long res=0;
        for(int i=0;i<nums.length;i++){
            max=nums[i];
            min=nums[i];
            for(int j=i+1;j<nums.length;j++){
                max=Math.max(max,nums[j]);
                min=Math.min(min,nums[j]);
                res+=(max-min);
            }
        }
        return res;
    }
}
