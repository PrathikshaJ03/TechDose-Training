class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int res[]=new int[s.length()];
        for(int i=0;i<s.length();i++){
            int r=startPos[0];
            int c=startPos[1];
            int j=i,count=0;
            while(j<s.length()){
                if(s.charAt(j)=='L'){
                    c--;
                }
                else if(s.charAt(j)=='R'){
                    c++;
                }
                else if(s.charAt(j)=='U'){
                    r--;
                }
                else if(s.charAt(j)=='D'){
                    r++;
                }
                if(r<n && c<n && r>=0 && c>=0){
                    count++;
                }
                else{
                    break;
                }
                j++;
            }
            res[i]=count;
        }
        return res;
    }
}
