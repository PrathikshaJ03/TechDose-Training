class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Map<Integer,Float> map=new TreeMap<Integer,Float>(Collections.reverseOrder());
        for(int i=0;i<position.length;i++){
            float distance=(float)target-position[i];
            map.put(position[i],distance/speed[i]);
        }
        Stack<Integer> stack=new Stack<>();
        for(Integer i:map.keySet()){
            if(stack.isEmpty()){
                stack.push(i);
            }
            else{
                if(map.get(i)<=map.get(stack.peek())){
                    continue;
                }
                else{
                    stack.push(i);
                }
            }
        }
        return stack.size();
    }
}
