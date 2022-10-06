class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list=new ArrayList<>();
        int hash[]=new int[26];
        int temp[]=new int[26];
        if(s.length()<p.length()){
            return list;
        }
        for(int i=0;i<p.length();i++){
            hash[p.charAt(i)-'a']++;
        }
        for(int i=0;i<p.length();i++){
            temp[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(temp,hash)){
            list.add(0);
        }
        int right=p.length(),left=0;
        while(right<s.length()){
            temp[s.charAt(right)-'a']++;
            temp[s.charAt(left)-'a']--;
            if(Arrays.equals(temp,hash)){
                list.add(left+1);
            }
            left++;
            right++;
        }
        return list;
    }
}
