class Solution {
    public int majorityElement(int[] nums) {
        int ME=nums[0],freq=1;
        for(int i=1;i<nums.length;i++){
            if(ME==nums[i]){
                freq++;
            }
            else{
                freq--;
                if(freq==0){
                    ME=nums[i];
                    freq=1;
                }
            }
        }
        return ME;
    }
}
