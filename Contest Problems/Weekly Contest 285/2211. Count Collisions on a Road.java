class Solution {
    public int countCollisions(String directions) {
        Stack<Character> list=new Stack<Character>();
        int count=0;
        list.push(directions.charAt(0));
        for(int i=1;i<directions.length();i++){
            char ch=directions.charAt(i);
            if(!list.isEmpty() && list.peek()=='R' && ch=='L'){
                count+=2;
                list.pop();
                ch='S';
            }
            
            else if(!list.isEmpty() && list.peek()=='S' && directions.charAt(i)=='L'){
                count++;
                ch='S';
            }
            while(!list.isEmpty() && list.peek()=='R' && ch=='S'){
                count++;
                list.pop();
            }
            list.push(ch);         
        }
        return count;
    }
}
