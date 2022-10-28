class Solution {
    public String longestDupSubstring(String s) {
        String res="";
        int left=1,right=s.length()-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            String temp=dupString(s,mid);
            if(temp==null){
                right=mid-1;
            }
            else{
                res=temp;
                left=mid+1;
            }
        }
        return res;
    }
    public static String dupString(String s,int len){
        long hash=findHash(s.substring(0,len));
        Set<Long> set=new HashSet<>();
        set.add(hash);
        long pow=1;
        for(int i=1;i<len;i++){
            pow*=31;
        }
        for(int i=1;i<=s.length()-len;i++){
            hash=nextHash(hash,pow,s.charAt(i-1),s.charAt(i+len-1));
            if(!set.add(hash)){
                return s.substring(i,i+len);
            }
        }
        return null;
    }
    public static long findHash(String s){
        long res=0,a=1;
        for(int i=s.length()-1;i>=0;i--){
            res+=(s.charAt(i)-'a'+1)*a;
            a*=31;
        }
        return res;
    }
    public static long nextHash(long hash,long pow,char left,char right){
        return (hash-(left-'a'+1)*pow)*31 + (right-'a'+1);
    }
}
