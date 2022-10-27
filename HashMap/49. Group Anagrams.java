class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res=new ArrayList<>();
        Map<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            int freq[]=new int[26];
            for(int j=0;j<strs[i].length();j++){
                freq[strs[i].charAt(j)-'a']++;
            }
            if(map.containsKey(Arrays.toString(freq))){
                map.get(Arrays.toString(freq)).add(strs[i]);
            }
            else{
                map.put(Arrays.toString(freq),new ArrayList<>());
                map.get(Arrays.toString(freq)).add(strs[i]);
            }
        }
        for(String x:map.keySet()){
            res.add(map.get(x));
        }
        return res;
    }
}
