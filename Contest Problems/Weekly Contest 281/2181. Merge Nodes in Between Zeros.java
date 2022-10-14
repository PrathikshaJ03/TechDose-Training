class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode h=null;
        while(head!=null && head.val!=0){
            head=head.next;
        }
        ListNode temp=head;
        while(temp!=null && temp.next!=null){
            if(temp.val==0){
                temp.val=temp.next.val;
                temp.next=temp.next.next;
            }
            else{
                while(temp.next!=null && temp.next.val!=0){
                    temp.val=temp.val+temp.next.val;
                    temp.next=temp.next.next;
                }
                if(temp.next.val==0 && temp.next.next==null){
                    temp.next=null;
                    break;
                }
                temp=temp.next;
            }           
        }
        return head;
    }
}
