class Solution {
    List<String> res=new ArrayList<>();
    public List<String> wordBreak(String s, List<String> wordDict) {
        breakWord(s,wordDict,0,new ArrayList<String>());
        return res;
    }
    void breakWord(String s,List<String> dict,int start,List<String> curr){
        for(int i=start+1;i<=s.length();i++){
            String temp=s.substring(start,i);
            if(dict.contains(temp)){
                curr.add(temp);
                if(i==s.length()){
                    String str[]=curr.toArray(String[]::new);
                    res.add(String.join(" ",str));
                }
                else{
                    breakWord(s,dict,i,curr);
                }
                curr.remove(curr.size()-1);
            }
        }
    }
}
