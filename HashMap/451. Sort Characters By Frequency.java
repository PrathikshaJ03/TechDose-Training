class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        List<Character> bucket[]=new List[s.length()+1];
        for(Character ch:map.keySet()){
            if(bucket[map.get(ch)]==null){
                bucket[map.get(ch)]=new ArrayList<>();
            }
            bucket[map.get(ch)].add(ch);
        }
        StringBuilder str=new StringBuilder();
        for(int i=bucket.length-1;i>=0;i--){
            if(bucket[i]!=null){
                 for(Character ch:bucket[i]){
                     for(int j=0;j<i;j++){
                         str.append(ch);
                     }
                 }
            }
        }
        return str.toString();
    }
}
