class Solution {
    public static int sumOfDigits(int N){
        int sum=0;
        while(N>0){
            sum+=(N%10);
            N/=10;
        }
        return sum;
    }
    
    public int maximumSum(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int flag=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int sum=sumOfDigits(nums[i]);
            if(map.containsKey(sum)){
                max=Math.max(max,nums[map.get(sum)]+nums[i]);
                flag=1;
                if(nums[map.get(sum)]<nums[i]){
                    map.put(sum,i);
                }
            }
            else{
                map.put(sum,i);
            }
        }
        if(flag==0){
            return -1;
        }
        return max;
    }
}
