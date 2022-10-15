class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        long max=0,min=0,val=0;
        for(int x:differences){
            val+=x;
            max=Math.max(max,val);
            min=Math.min(min,val);
        }
        return (int)Math.max(0,(upper-lower)-(max-min)+1);
    }
}
