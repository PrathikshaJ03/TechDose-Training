class Solution {
    public String minWindow(String s, String t) {
        int hash[]=new int[127];
        int thash[]=new int[127];
        for(int i=0;i<t.length();i++){
            hash[(int)t.charAt(i)]++;
        }
        int right=0,left=0,min=Integer.MAX_VALUE,count=0,start=-1;
        while(right<s.length()){
            thash[(int)s.charAt(right)]++;
            if(thash[(int)s.charAt(right)]<=hash[(int)s.charAt(right)]){
                count++;
            }
            if(count==t.length()){
                while(thash[(int)s.charAt(left)]>hash[(int)s.charAt(left)] || hash[(int)s.charAt(left)]==0){
                    if(thash[(int)s.charAt(left)]>hash[(int)s.charAt(left)]){
                        thash[(int)s.charAt(left)]--;
                    }
                    left++;
                }
                if((right-left+1)<min){
                    min=right-left+1;
                    start=left;
                }                
            }
            right++;
        }
        if(start==-1){
            return "";
        }
        return s.substring(start,start+min);
    }
}
