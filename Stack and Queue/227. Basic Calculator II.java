class Solution {
    public int calculate(String s) {
        if(s.isEmpty()){
            return 0;
        }
        Stack<Integer> stack=new Stack<>();
        int curr=0;
        char op='+';
        char ch;
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            if(Character.isDigit(s.charAt(i))){
                curr=curr*10+(ch-'0');
            }
            if(!Character.isDigit(ch) && !Character.isWhitespace(ch) || i+1==s.length()){
                if(op=='+'){
                    stack.push(curr);
                }
                else if(op=='-'){
                    stack.push(-curr);
                }
                else if(op=='*'){
                    stack.push(stack.pop()*curr);
                }
                else if(op=='/'){
                    stack.push(stack.pop()/curr);
                }
                op=ch;
                curr=0;
            }
        }
        int result=0;
        while(!stack.isEmpty()){
            result+=stack.pop();
        }
        return result;
    }
}
