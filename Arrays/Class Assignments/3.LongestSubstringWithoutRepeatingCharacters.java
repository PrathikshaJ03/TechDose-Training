class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0,right=0,result=0;
        Set<Character> set=new LinkedHashSet<>();
        while(right<s.length()){
            if(set.contains(s.charAt(right))){
                while(s.charAt(left)!=s.charAt(right)){
                    set.remove(s.charAt(left));
                    left++;
                }
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            result=(result>(right-left+1))?result:(right-left+1);
            right++;
        }
        return result;
    }
}
