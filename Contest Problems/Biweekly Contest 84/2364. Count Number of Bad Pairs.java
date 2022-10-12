class Solution {
    public long countBadPairs(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        long count=0;
        int dif;
        for(int i=0;i<nums.length;i++){
            dif=i-nums[i];
            if(map.containsKey(dif)){
                count+=(i-map.get((dif)));
            }
            else{
                count+=i;
            }
            map.put(dif,map.getOrDefault(dif,0)+1);
        }
        return count;
    }
}
