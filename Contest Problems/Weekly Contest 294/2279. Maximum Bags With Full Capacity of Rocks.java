class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int dif[]=new int[rocks.length];
        for(int i=0;i<rocks.length;i++){
            dif[i]=capacity[i]-rocks[i];
        }
        Arrays.sort(dif);
        int count=0;
        for(int i=0;i<dif.length;i++){
            if(dif[i]==0){
                count++;
            }
            else if(additionalRocks-dif[i]>=0){
                additionalRocks=additionalRocks-dif[i];
                count++;
            }
            if(additionalRocks==0){
                break;
            }
        }
        return count;
    }
}
