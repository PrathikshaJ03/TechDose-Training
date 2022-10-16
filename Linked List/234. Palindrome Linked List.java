class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode curr=head,nxt=null,prev=null;
        int n=0;
        ListNode temp=head;
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        int mid=n/2;
        while(mid!=0){
            nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;
            mid--;
        }
        if(n%2!=0){
            curr=curr.next;
        }
        while(curr!=null){
            if(curr.val!=prev.val){
                return false;
            }
            curr=curr.next;
            prev=prev.next;
        }
        return true;
    }
}
