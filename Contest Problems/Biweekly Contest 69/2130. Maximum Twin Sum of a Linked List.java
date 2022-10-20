class Solution {
    public int pairSum(ListNode head) {
        int count=0;
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            count++;
        }
        int index=0,c=0;
        int arr[]=new int[count];
        ListNode ptr=head;
        while(ptr!=null){
            if(c<count){
                arr[index++]=ptr.val;
            }
            else{
                arr[--index]=arr[index]+ptr.val;
            }
            ptr=ptr.next;
            c++;
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<count;i++){
            max=Math.max(max,arr[i]);
        }
        return max;
    }
}
