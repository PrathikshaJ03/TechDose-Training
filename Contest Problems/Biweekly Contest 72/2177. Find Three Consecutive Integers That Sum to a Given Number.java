class Solution {
    public long[] sumOfThree(long num) {
        if(num%3!=0){
            return new long[0];
        }
        
        long x=num/3;
        long result[]={x-1,x,x+1};
        return result;
    }
}
