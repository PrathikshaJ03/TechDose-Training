class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> pos=new ArrayList<>();
        List<Integer> neg=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                neg.add(i);
            }
            else{
                pos.add(i);
            }
        }
        int result[]=new int[nums.length];
        int index=0;
        for(int i=0;i<pos.size();i++){
            result[index++]=nums[pos.get(i)];
            result[index++]=nums[neg.get(i)];
        }
        return result;
    }
}
