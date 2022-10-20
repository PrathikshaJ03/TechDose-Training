class Solution {
    public int numberOfBeams(String[] bank) {
        int res=0,val=-1;
        for(int i=0;i<bank.length;i++){
            int count=0;
            for(int j=0;j<bank[i].length();j++){
                if(bank[i].charAt(j)=='1'){
                    count++;
                }
            }
            if(val==-1 && count>0){
                val=count;
            }
            else if(count>0){
                res=res+count*val;
                val=count;
            }
        }
        return res;
    }
}
