class Solution {
    public int smallestEvenMultiple(int n) {
        int i=n;
        while(i<=Integer.MAX_VALUE){
            if(i%2==0 && i%n==0){
                return i;
            }
            i++;
        }
       return 0;
    }
}
