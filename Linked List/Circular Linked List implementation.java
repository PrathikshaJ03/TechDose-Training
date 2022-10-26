class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
class CircularLinkedList{
    Node head=null,tail=null;
    void append(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        if(head==null){
            head=newNode;
            tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    void insertAtBegin(int data){
        Node newNode=new Node(data);
        if(head==null){
            newNode.next=null;
            head=newNode;
            tail=newNode;
            return;
        }
        tail.next=newNode;
        newNode.next=head;
        head=newNode;
    }
    void insertAtMiddle(int pos,int data){
        Node newNode=new Node(data);
        Node temp=head,prev=head;
        for(int i=0;i<pos-1;i++){
            prev=temp;
            temp=temp.next;
        }
        prev.next=newNode;
        newNode.next=temp;
    }
    void deleteAtFirst(){
        head=head.next;
        tail.next=head;
    }
    void deleteAtLast(){
        Node temp=head;
        while(temp.next.next!=head){
            temp=temp.next;
        }
        temp.next=head;
        tail=temp;
    }
    void deleteAtMiddle(int pos){
        Node temp=head,prev=head;
        for(int i=0;i<pos-1;i++){
            prev=temp;
            temp=temp.next;
        }
        prev.next=temp.next;
    }
    void print(){
        Node temp=head.next;
        System.out.print(head.data+" ");
        while(temp!=tail.next){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
class Main{
    public static void main(String args[]){
        CircularLinkedList list=new CircularLinkedList();
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
