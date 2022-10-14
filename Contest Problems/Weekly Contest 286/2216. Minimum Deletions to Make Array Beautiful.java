class Solution {
    public int minDeletion(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            if((list.size()-1)%2==0){
                if(list.get(list.size()-1)==nums[i]){
                    count++;
                    continue;
                }
            }
            list.add(nums[i]);
        }
        if(list.size()%2!=0){
            count++;
        }
        return count;
    }
}
