class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int result[]=new int[queries.length];
        Arrays.sort(nums);
        for(int i=0;i<queries.length;i++){
            int right=0,sum=0;
            int max=0;
            while(right<nums.length && sum+nums[right]<=queries[i]){
                sum+=nums[right];
                max=right+1;
                right++;
            }
            result[i]=max;
        }
        return result;
    }
}
