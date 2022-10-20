class Solution {
    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        List<Integer> list=new ArrayList<>();
        int left[]=new int[security.length];
        int right[]=new int[security.length];
        left[0]=0;
        right[security.length-1]=0;
        for(int i=1;i<security.length;i++){
            if(security[i-1]>=security[i]){
                left[i]=left[i-1]+1;
            }
            else{
                left[i]=0;
            }
        }
        for(int i=security.length-2;i>=0;i--){
            if(security[i]<=security[i+1]){
                right[i]=right[i+1]+1;
            }
            else{
                right[i]=0;
            }
        }
        for(int i=time;i<security.length-time;i++){
            if(right[i]>=time && left[i]>=time){
                list.add(i);
            }
        }
        return list;
    }
}
