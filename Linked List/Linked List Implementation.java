import java.util.*;
class Node{
    int data;
    Node next;
}
class Main{    
    public static Node append(Node head,int data){
        Node newNode=new Node();
        newNode.data=data;
        newNode.next=null;
        if(head==null){
            return newNode;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        return head;
    }
    
    public static void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.print("null");
    }
    
    
	public static void main(String[] args) {
	    Node head=null;
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int val;
		for(int i=0;i<N;i++){
		    val=sc.nextInt();
		    head=append(head,val);
		}
		print(head);
	}
}
