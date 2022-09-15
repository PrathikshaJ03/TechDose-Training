class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int result=0;
        for (int i=0;i<32;i++){
            int bit=1<<i;
            int count=0;
            for(int x:nums){
                if((x & bit)!=0){
                    count++;
                }
            }
            if(count > n/2) {
                result|=bit;
            }
        }

        return result;
    }
}
