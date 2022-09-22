class Solution {
    public static void swap(int nums[],int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    
    public void sortColors(int[] nums) {
        int minIndex;
        for(int i=0;i<nums.length-1;i++){
            minIndex=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[minIndex]>nums[j]){
                    minIndex=j;
                }
            }
            swap(nums,minIndex,i);
        }
    }
}
