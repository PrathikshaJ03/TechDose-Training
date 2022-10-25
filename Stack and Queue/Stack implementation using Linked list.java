class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}

class Stack{
    Node top=null;
    void push(int data){
        Node newNode=new Node(data);
        if(top==null){
            newNode.next=null;
            top=newNode;
            return;
        }
        newNode.next=top;
        top=newNode;
    }
    void pop(){
        top=top.next;
    }
    int peek(){
        return top.data;
    }
    void print(){
        Node temp=top;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    boolean isEmpty(){
        if(top==null){
            return  true;
        }
        return false;
    }
}

class Main{
    public static void main(String args[]){
        Stack stack=new Stack();
        stack.push(30);
        stack.push(40);
        stack.push(20);
        stack.push(90);
        stack.print();
        stack.pop();
        stack.print();
        System.out.print(stack.peek());
    }
}
