class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                if(map.containsKey(nums[i])){
                    int count=map.get(nums[i])+1;
                    map.put(nums[i],count);
                }
                else{
                    map.put(nums[i],1);
                }
            }
        }
        int max=0,result=-1;
        for(int n:map.keySet()){
            if(map.get(n)==max){
                result=(result<n)?result:n;
            }
            else if(map.get(n)>max){
                max=map.get(n);
                result=n;
            }
        }
        return result;
    }
}
