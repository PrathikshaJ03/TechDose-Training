class Solution {
    List<String> res=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        generate(n,n,"");
        return res;
    }
    void generate(int left,int right,String s){
        if(left==0 && right==0){
            res.add(s);
            return;
        }
        if(left>0){
            generate(left-1,right,s+'(');
        }
        if(left<right){
            generate(left,right-1,s+')');
        }
    }
}
