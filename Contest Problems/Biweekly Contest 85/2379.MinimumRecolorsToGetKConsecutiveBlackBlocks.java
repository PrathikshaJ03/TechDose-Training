class Solution {
    public int minimumRecolors(String blocks, int k) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<=blocks.length()-k;i++){
            min=Math.min(min,countWhite(blocks,i,k));
        }
        return min;
    }
    public static int countWhite(String blocks,int index,int k){
        int count=0;
        for(int i=index;i<index+k;i++){
            if(blocks.charAt(i)=='W'){
                count++;
            }
        }
        return count;
    }
}
