class Solution {
    public boolean checkDistances(String s, int[] distance) {
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            for(int j=i+1;j<s.length();j++){
                if(ch==s.charAt(j)){
                    if(j-i-1!=distance[(int)ch-'a'])
                        return false;
                }
            }
        }
        return true;
    }
}
