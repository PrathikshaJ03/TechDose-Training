class Solution {
    public int minimumRounds(int[] tasks) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<tasks.length;i++){
            map.put(tasks[i],map.getOrDefault(tasks[i],0)+1);
        }
        int count=0;
        for(Integer x:map.keySet()){
            if(map.get(x)==1){
                return -1;
            }
            if(map.get(x)<=3){
                count++;
            }
            else{
                if(map.get(x)%3==0){
                    count+=map.get(x)/3;
                }
                else{
                    count+=map.get(x)/3+1;
                }
            }
            
        }
        return count;
    }
}
