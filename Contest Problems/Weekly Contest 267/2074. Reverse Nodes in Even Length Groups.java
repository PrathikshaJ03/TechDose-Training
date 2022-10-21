class Solution {
    public ListNode reverseEvenLengthGroups(ListNode head) {
        int group=1;
        Stack<Integer> stack=new Stack<>();
        ListNode temp=head;
        while(temp!=null){
            int count=0;
            ListNode start=temp;
            while(count<group && temp!=null){
                count++;
                stack.push(temp.val);
                temp=temp.next;
            }
            if(count%2==0){
                while(start!=temp){
                    start.val=stack.pop();
                    start=start.next;
                }
            }
            group++;
        }
        return head;
    }
}
