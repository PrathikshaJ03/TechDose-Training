class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> list=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(!list.isEmpty() && Arrays.equals(freq(list.get(list.size()-1)),freq(words[i]))){
                continue;
            }
            list.add(words[i]);
        }
        return list;
    }
    public static int[] freq(String str){
        int count[]=new int[26];
        for(int i=0;i<str.length();i++){
            count[str.charAt(i)-'a']++;
        }
        return count;
    }
}
