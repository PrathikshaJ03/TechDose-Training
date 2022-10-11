class Solution {
    public boolean equalFrequency(String word) {
        int count[]=new int[26];
        int maxFreq=0,charCount=0;
        for(int i=0;i<word.length();i++){
            if(count[(int)word.charAt(i)-'a']==0){
                charCount++;
            }
            count[(int)word.charAt(i)-'a']++;
            maxFreq=Math.max(maxFreq,count[(int)word.charAt(i)-'a']);
        }
        if((maxFreq-1)*charCount==word.length()-1 || maxFreq*(charCount-1)==word.length()-1){
            return true;
        }
        else{
            return false;
        }
    }
}
