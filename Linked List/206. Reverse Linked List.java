class Solution {
    public ListNode reverseList(ListNode head) {
        /* Recursive Method
        if(head==null || head.next==null){
            return head;
        }
        ListNode rest=reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return rest;
        */
        
        //Iterative Method
        ListNode curr=head;
        ListNode prev=null;
        ListNode next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        return head;
    }
}
