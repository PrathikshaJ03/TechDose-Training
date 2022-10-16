class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode res=new ListNode(0);
        res.next=head;
        ListNode pointer=res;
        while(pointer!=null){
            ListNode temp=pointer;
            for(int i=0;i<k && temp!=null;i++){
                temp=temp.next;
            }
            if(temp==null){
                break;
            }
            ListNode curr=pointer.next,prev=null,next=null;
            for(int i=0;i<k;i++){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            ListNode tail=pointer.next;
            tail.next=curr;
            pointer.next=prev;
            pointer=tail;
        }
        return res.next;
    }
}
