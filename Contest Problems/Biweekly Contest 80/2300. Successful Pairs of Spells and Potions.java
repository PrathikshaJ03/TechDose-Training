class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int plen=potions.length;
        int slen=spells.length;
        int result[]=new int[slen];
        long prod;
        int index;
        for(int i=0;i<spells.length;i++){
            int right=plen-1,left=0;
            index=-1;
            while(left<=right){
                int mid=left+(right-left)/2;
                prod=(long)potions[mid]*(long)spells[i];
                if(prod>=success){
                    index=mid;
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }
            result[i]=(index==-1)?0:plen-index;
        }
        return result;
    }
}
