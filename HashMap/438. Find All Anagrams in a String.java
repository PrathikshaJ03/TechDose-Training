class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list=new ArrayList<>();
        if(s.length()<p.length()){
            return list;
        }
        int freq[]=new int[26];
        for(int i=0;i<p.length();i++){
            freq[p.charAt(i)-'a']++;
        }
        int temp[]=new int[26];
        for(int i=0;i<p.length();i++){
            temp[s.charAt(i)-'a']++;
        }
        int left=0;
        if(Arrays.equals(freq,temp)){
            list.add(left);
        }
        for(int i=p.length();i<s.length();i++){
            temp[s.charAt(left)-'a']--;
            temp[s.charAt(i)-'a']++;
            left++;
            if(Arrays.equals(temp,freq)){
                list.add(left);
            }
        }
        return list;
    }
}
