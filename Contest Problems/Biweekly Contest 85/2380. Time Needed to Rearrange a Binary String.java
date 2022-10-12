class Solution {
    public int secondsToRemoveOccurrences(String s) {
        int result=0;
        while(s.indexOf("01")>=0){
            s=s.replace("01","10");
            result++;
        }
        return result;
    }   
}
