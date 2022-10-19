class LRUCache {
    
    class Node{
        int key,val;
        Node prev,next;
        Node(int key,int val){
            this.key=key;
            this.val=val;
        }
        Node(){
            this(0,0);
        }
    }
    
    int capacity,count;
    Map<Integer,Node> map;
    Node head,tail;
    
    public LRUCache(int capacity) {
        this.capacity=capacity;
        count=0;
        map=new HashMap<>();
        head=new Node();
        tail=new Node();
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        Node temp=map.get(key);
        if(temp==null){
            return -1;
        }
        else{
            remove(temp);
            add(temp);
            return temp.val;
        }
    }
    
    public void put(int key, int value) {
        Node temp=map.get(key);
        if(temp==null){
            Node newNode=new Node(key,value);
            map.put(key,newNode);
            add(newNode);
            count++;
        }
        else{
            temp.val=value;
            remove(temp);
            add(temp);
        }
        if(count>capacity){
            Node toDel=tail.prev;
            remove(toDel);
            map.remove(toDel.key);
            count--;
        }
    }
  
    public void add(Node newNode){
        newNode.next=head.next;
        newNode.prev=head;
        head.next=newNode;
        newNode.next.prev=newNode;
    }
  
    public void remove(Node newNode){
        newNode.prev.next=newNode.next;
        newNode.next.prev=newNode.prev;
    }
}
