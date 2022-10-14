class Solution {
    public long smallestNumber(long num) {
        int n=1;
        if(num<0){
            n=-1;
            num*=-1;
        }
        int freq[]=new int[10];
        while(num>0){
            freq[(int)(num%10)]++;
            num/=10;
        }
        long val=0;
        if(n==-1){
            for(int i=9;i>=0;i--){
                if(freq[i]>0){
                    for(int j=1;j<=freq[i];j++){
                        val=val*10+i;
                    }
                }
            }
            return val*n;
        }
        else{
            for(int i=1;i<10;i++){
                if(freq[i]>0){
                    for(int j=1;j<=freq[i];j++){
                        val=val*10+i;
                        if(freq[0]>0){                            
                            for(int k=1;k<=freq[0];k++){
                                val=val*10;
                            }
                            freq[0]=0;
                        }
                    }
                    
                }
                
            }
            return val;
        }
    }
}
