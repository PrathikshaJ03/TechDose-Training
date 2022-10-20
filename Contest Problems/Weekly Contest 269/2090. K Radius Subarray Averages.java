class Solution {
    public int[] getAverages(int[] nums, int k) {
        int N=nums.length;
        int res[]=new int[N];
        Arrays.fill(res,-1);
        if(N<=k){
            return res;
        }
        int right=0,left=0;
        long sum=0;
        while(right<N){
            if(right<2*k){
                sum+=nums[right];
            }
            else{
                sum+=nums[right];
                res[right-k]=(int)(sum/(2*k+1));
                sum-=nums[left];
                left++;
            }
            right++;
        }
        return res;
    }
}
