class Solution {
    public String removeStars(String s) {
        StringBuilder str=new StringBuilder();
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*' && !stack.isEmpty()){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
            
        }
        for(Character c:stack){
            str.append(c);
        }
        return str.toString();
    }
}
