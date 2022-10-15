class Solution {
    public int minMoves(int target, int maxDoubles) {
        int count=0;
        while(target!=1){
            if(maxDoubles==0){
                return target-1+count;
            }
            if(maxDoubles!=0 && target%2==0){
                target/=2;
                count++;
                maxDoubles--;
            }
            else{
                target--;
                count++;
            }
        }
        return count;
    }
}
