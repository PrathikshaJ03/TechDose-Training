class Solution {
    public int minAbsDifference(int[] nums, int goal) {
        int mid=(nums.length%2==0)?nums.length/2-1:nums.length/2;
        List<Integer> l1=findSum(nums,0,mid);
        List<Integer> l2=findSum(nums,mid+1,nums.length-1);
        Collections.sort(l2);
        int result=closestSum(l1,l2,goal);
        return result;
    }
    public static List<Integer> findSum(int nums[],int low,int high){
        int N=high-low+1;
        int arr[]=new int[N];
        int index=0;
        List<Integer> list=new ArrayList<>();
        for(int i=low;i<=high;i++){
            arr[index++]=nums[i];
        }
        for(int i=0;i<(1<<N);i++){
            int sum=0;
            for(int j=0;j<N;j++){
                if((i&(1<<j))>0){
                    sum+=arr[j];
                }
            }
            list.add(sum);
        }
        return list;
    }
    public static int closestSum(List<Integer> l1,List<Integer> l2,int goal){
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int i=0;i<l1.size();i++){
            int val=l1.get(i);
            int low=0,high=l2.size()-1;
            while(low<=high){
                int mid=low+(high-low)/2;
                int sum=val+l2.get(mid);
                if(sum==goal){
                    return 0;
                }
                else if(sum>goal){
                    high=mid-1;
                    min=Math.min(min,sum);
                }
                else{
                    low=mid+1;
                    max=Math.max(max,sum);
                }
            }
        }
        return Math.min(Math.abs(goal-min),Math.abs(goal-max));
    }
}
