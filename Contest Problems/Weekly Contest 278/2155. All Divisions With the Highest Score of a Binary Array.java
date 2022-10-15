class Solution {
    public List<Integer> maxScoreIndices(int[] nums) {
        List<Integer> result=new ArrayList<>();
        int left[]=new int[nums.length];
        int right[]=new int[nums.length];
        left[0]=(nums[0]==0)?1:0;
        right[nums.length-1]=(nums[nums.length-1]==1)?1:0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==0){
                left[i]=left[i-1]+1;
            }
            else{
                left[i]=left[i-1];
            }
            if(nums[nums.length-i-1]==1){
                right[nums.length-i-1]=right[nums.length-i]+1;
            }
            else{
                right[nums.length-i-1]=right[nums.length-i];
            }
        }
        int sum;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<=nums.length;i++){
            if(i==0){
                sum=right[i];
            }
            else if(i==nums.length){
                sum=left[i-1];
            }
            else{
                sum=left[i-1]+right[i];
            }
            map.put(i,sum);
        }
        int max=0;
        for(Integer i:map.keySet()){
            if(map.get(i)>max){
                max=map.get(i);
            }
        }
        for(Integer i:map.keySet()){
            if(map.get(i)==max){
                result.add(i);
            }
        }
        return result;
    }
}
