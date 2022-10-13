class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        Map<String,Integer> map=new TreeMap<>();
        int wordCount;
        for(int i=0;i<messages.length;i++){
            String temp[]=messages[i].split(" ");
            wordCount=temp.length;
            map.put(senders[i],map.getOrDefault(senders[i],0)+wordCount);
        }
        int max=Integer.MIN_VALUE;
        String result="";
        for(String s:map.keySet()){
            if(map.get(s)>=max){
                max=map.get(s);
                result=s;
            }
        }
        return result;
    }
}
