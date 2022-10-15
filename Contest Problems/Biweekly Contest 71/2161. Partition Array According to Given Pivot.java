class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int result[]=new int[nums.length];
        int left=0,right=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                result[left++]=nums[i];
            }
            if(nums[nums.length-i-1]>pivot){
                result[right--]=nums[nums.length-i-1];
            }
        }
        while(left<=right){
            result[left++]=pivot;
        }
        return result;
    }
}
