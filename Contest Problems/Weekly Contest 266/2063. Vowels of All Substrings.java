class Solution {
    public long countVowels(String word) {
        long count=0;
        for(int i=0;i<word.length();i++){
            if(isVowel(word.charAt(i))){
                count+=(i+1)*((long)word.length()-i);
            }
        }
        return count;
    }
    public static boolean isVowel(char ch){
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
    }
}
