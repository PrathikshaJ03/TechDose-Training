import java.util.*;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}

class Stack{
    Node top=null;
    
    public void push(int val){
        Node newNode=new Node(val);
        if(top==null){
            top=newNode;
            newNode.next=null;
        }
        else{
            newNode.next=top;
            top=newNode;
        }
    }
    
    public void pop(){
        top=top.next;
    }
    
    public void print(){
        Node temp=top;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    
    public void reverse(){
        Node curr=top,prev=null,next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        top=prev;
    }
}

public class Main{
	public static void main(String[] args) {
	    Stack stack=new Stack();
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		for(int i=0;i<N;i++){
		    int val=sc.nextInt();
		    stack.push(val);
		}
		stack.print();
		stack.pop();
		stack.print();
		stack.reverse();
		stack.print();
	}
}
