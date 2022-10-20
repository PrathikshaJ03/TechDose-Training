class Solution {
    public int minimumBuckets(String street) {
        int count=0;
        for(int i=0;i<street.length();i++){
            if(street.charAt(i)=='H'){
                if(i+1<street.length() && street.charAt(i+1)=='.'){
                    count++;
                    i+=2;
                }
                else if(i-1>=0 && street.charAt(i-1)=='.'){
                    count++;
                }
                else{
                    return -1;
                }
            }
        }
        return count;
    }
}
