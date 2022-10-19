class Solution {
    public int calculate(String s) {
        int len=s.length();
        Stack<Integer> stack=new Stack<>();
        stack.push(0);
        int sign=1;
        for(int i=0;i<len;i++){
            if(Character.isDigit(s.charAt(i))){
                int num=s.charAt(i)-'0';
                while(i+1<len && Character.isDigit(s.charAt(i+1))){
                    num=num*10+(s.charAt(i+1)-'0');
                    i++;
                }
                stack.push(stack.pop()+num*sign);
            }
            else if(s.charAt(i)=='+'){
                sign=1;
            }
            else if(s.charAt(i)=='-'){
                sign=-1;
            }
            else if(s.charAt(i)=='('){
                stack.push(sign);
                stack.push(0);
                sign=1;
            }
            else if(s.charAt(i)==')'){
                stack.push(stack.pop()*stack.pop()+stack.pop());
            }
        }
        return stack.pop();
    }
}
