class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer> res=new ArrayList<>();
        List<Integer>[] bucket=new List[nums.length+1];
        for(Integer x:map.keySet()){
            if(bucket[map.get(x)]==null){
                bucket[map.get(x)]=new ArrayList<>();
            }
            bucket[map.get(x)].add(x);
        }
        for(int i=bucket.length-1;i>=0 && res.size()<k;i--){
            if(bucket[i]!=null){
                res.addAll(bucket[i]);
            }
        }
        return res.stream().mapToInt(i->i).toArray();
    }
}
