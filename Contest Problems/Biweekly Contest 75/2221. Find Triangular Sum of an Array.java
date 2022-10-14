class Solution {
    public int triangularSum(int[] nums) {
        int result[][]=new int[nums.length][nums.length];
        for(int i=0;i<nums.length;i++){
            result[0][i]=nums[i];
        }
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<nums.length-i;j++){
                result[i][j]=(result[i-1][j]+result[i-1][j+1])%10;
            }
        }
        return result[nums.length-1][0];
    }
}
