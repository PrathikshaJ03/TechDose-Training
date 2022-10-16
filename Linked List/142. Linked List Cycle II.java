public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fastPtr=head,slowPtr=head;
        while(fastPtr!=null && fastPtr.next!=null){
            slowPtr=slowPtr.next;
            fastPtr=fastPtr.next.next;
            if(slowPtr==fastPtr){
                slowPtr=head;
                while(slowPtr!=fastPtr){
                    slowPtr=slowPtr.next;
                    fastPtr=fastPtr.next;
                }
                return slowPtr;
            }
        }
        return null;
    }
}
