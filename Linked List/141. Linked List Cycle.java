public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slowPtr=head,fastPtr=head;
        while(fastPtr!=null && fastPtr.next!=null){
            fastPtr=fastPtr.next.next;
            slowPtr=slowPtr.next;
            if(fastPtr==slowPtr){
                return true;
            }
        }
        return false;
    }
}
