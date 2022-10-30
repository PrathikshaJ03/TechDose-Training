class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        PriorityQueue<Character> maxHeap=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        for(Character ch:map.keySet()){
            maxHeap.add(ch);
        }
        StringBuilder res=new StringBuilder();
        while(!maxHeap.isEmpty()){
            char ch=maxHeap.poll();
            for(int i=1;i<=map.get(ch);i++){
                res.append(ch);
            }
        }
        return res.toString();
    }
}
