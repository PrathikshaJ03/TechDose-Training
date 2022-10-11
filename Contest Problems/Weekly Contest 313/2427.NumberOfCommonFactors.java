class Solution {
    public int commonFactors(int a, int b) {
        int result=0;
        int min=(a<b)?a:b;
        for(int i=1;i<=min;i++){
            if(a%i==0 && b%i==0){
                result++;
            }
        }
        return result;
    }
}
