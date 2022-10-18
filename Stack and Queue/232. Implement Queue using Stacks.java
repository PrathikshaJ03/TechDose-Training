class MyQueue {
    
    Stack<Integer> s1=new Stack<>();
    Stack<Integer> s2=new Stack<>();
    int front;
       
    public void push(int x) {
        if(s1.isEmpty()){
            front=x;
        }
        s1.push(x);
    }
    
    public int pop() {
        while(s1.size()>1){
            front=s1.pop();
            s2.push(front);
        }
        int deleted=s1.pop();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return deleted;
    }
    
    public int peek() {
        return front;
    }
    
    public boolean empty() {
        return s1.isEmpty();
    }
}
