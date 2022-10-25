class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
class Queue{
    Node rear=null,front=null;
    void enQueue(int data){
        Node newNode=new Node(data);
        newNode.next=null;
        if(rear==null && front==null){
            rear=newNode;
            front=newNode;
            return;
        }
        rear.next=newNode;
        rear=newNode;
    }
    void deQueue(){
        if(front!=null){
            front=front.next;
        }
        if(front==null){
            rear=null;
        }
    }
    void print(){
        Node temp=front;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
class Main{
    public static void main(String args[]){
        Queue queue=new Queue();
        queue.enQueue(70);
        queue.enQueue(80);
        queue.enQueue(90);
        queue.enQueue(100);
        queue.print();
        queue.deQueue();
        queue.print();
        queue.deQueue();
        queue.print();
    }
}
