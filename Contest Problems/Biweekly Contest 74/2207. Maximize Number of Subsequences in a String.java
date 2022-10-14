class Solution {
    public long maximumSubsequenceCount(String text, String pattern) {
        long result=0,p1=0,p2=0;
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)==pattern.charAt(1)){
                result+=p1;
                p2++;
            }
            if(text.charAt(i)==pattern.charAt(0)){
                p1++;
            }
        }
        return result+Math.max(p1,p2);
    }
}
