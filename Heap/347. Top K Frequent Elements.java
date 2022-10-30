class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int res[]=new int[k];
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        for(Integer i:map.keySet()){
            maxHeap.add(i);
        }
        for(int i=0;i<k;i++){
            res[i]=maxHeap.poll();
        }
        return res;
    }
}
