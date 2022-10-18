class MinStack {
    
    Stack<Long> stack=new Stack<>();
    long min;
    
    public void push(int val) {
        if(stack.isEmpty()){
            min=val;
            stack.push((long)val);
        }
        else if(val<min){
            stack.push((long)2*val-min);
            min=(long)val;
        }
        else{
            stack.push((long)val);
        }
    }
    
    public void pop() {
        long deleted=stack.pop();
        if(deleted<min){
            min=2*min-deleted;
        }
    }
    
    public int top() {
        long top=stack.peek();
        if(top<min){
            return (int)min;
        }
        else{
            return (int)top;
        }
    }
    
    public int getMin() {
        return (int)min;
    }
}
