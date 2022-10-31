class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> minHeap=new PriorityQueue<>((a,b)->a.val-b.val);
        for(int i=0;i<lists.length;i++){
            ListNode head=lists[i];
            while(head!=null){
                minHeap.add(head);
                head=head.next;
            }
        }
        ListNode res=new ListNode(0);
        ListNode temp=res;
        while(!minHeap.isEmpty()){
            ListNode ptr=minHeap.poll();
            temp.next=ptr;
            temp=ptr;
        }
        temp.next=null;
        return res.next;
    }
}
