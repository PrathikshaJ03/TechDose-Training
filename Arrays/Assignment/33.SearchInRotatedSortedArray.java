class Solution {
    public int search(int[] nums, int target) {
        int N=nums.length;
        int low=0,high=N-1,mid;
        while(low<=high){
            mid=(high+low)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>=nums[low]){
                if(target>=nums[low] && target<=nums[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(target>=nums[mid] && target<=nums[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
}
