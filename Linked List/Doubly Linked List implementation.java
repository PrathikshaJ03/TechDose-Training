class Node{
    int data;
    Node next,prev;
    Node(int data){
        this.data=data;
    }
}

class DoublyLinkedList{
    Node head=null;
    void append(int data){
        Node newNode=new Node(data);
        newNode.next=null;
        if(head==null){
            head=newNode;
            newNode.prev=null;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        newNode.prev=temp;
        temp.next=newNode;
    }
    void insertAtBegin(int data){
        Node newNode=new Node(data);
        newNode.prev=null;
        if(head==null){
            newNode.next=null;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    void insertAtMiddle(int pos,int data){
        Node newNode=new Node(data);
        Node temp=head;
        for(int i=0;i<pos-1;i++){
            temp=temp.next;
        }
        temp.prev.next=newNode;
        temp.prev=newNode;
        newNode.next=temp;
    }
    void deleteAtFirst(){
        head=head.next;
        head.prev=null;
    }
    void deleteAtLast(){
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    void deleteAtMiddle(int pos){
        Node temp=head;
        for(int i=0;i<pos-1;i++){
            temp=temp.next;
        }
        temp.prev.next=temp.next;
        temp.next.prev=temp.prev;
    }
    void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}

public class Main{
	public static void main(String[] args) {
		DoublyLinkedList list=new DoublyLinkedList();
		list.append(30);
		list.append(70);
		list.append(10);
		list.print();
		list.insertAtBegin(50);
		list.insertAtBegin(100);
		list.print();
		list.insertAtMiddle(2,80);
		list.print();
		list.deleteAtFirst();
		list.print();
		list.deleteAtLast();
		list.print();
		list.deleteAtMiddle(3);
		list.print();
	}
}
