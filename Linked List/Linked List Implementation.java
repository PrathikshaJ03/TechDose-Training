class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}

class LinkedList{
    Node head=null;
    void append(int data){
        Node newNode=new Node(data);
        newNode.next=null;
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    void insertAtBegin(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            newNode.next=null;
            return;
        }
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
    void removeAtFirst(){
        if(head!=null)
        head=head.next;
    }
    void removeAtEnd(){
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    void removeAtMiddle(int pos){
        Node temp=head,prev=head;
        for(int i=0;i<pos-1;i++){
            prev=temp;
            temp=temp.next;
        }
        prev.next=temp.next;
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

class Main{
    public static void main(String args[]){
        LinkedList list=new LinkedList();
        list.append(30);
        list.append(20);
        list.print();
        list.insertAtBegin(60);
        list.insertAtBegin(80);
        list.print();
        list.insertAtMiddle(3,70);
        list.print();
        list.removeAtFirst();
        list.print();
        list.removeAtEnd();
        list.print();
        list.removeAtMiddle(2);
        list.print();
    }
}
