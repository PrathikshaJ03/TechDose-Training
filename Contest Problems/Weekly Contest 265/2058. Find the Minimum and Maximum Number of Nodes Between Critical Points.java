class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode curr=head.next,prev=head,next=curr.next;
        int min=Integer.MAX_VALUE,max=-1,temp=-1,index=2,n=-1;
        int res[]=new int[2];
        while(next!=null){
            if((prev.val<curr.val && next.val<curr.val) || (prev.val>curr.val && next.val>curr.val)){
                if(temp==-1){
                    temp=index;
                    n=index;
                }
                else{
                    if(min>(index-temp)){
                        min=index-temp;                      
                    }
                    temp=index;
                }
                max=index-n;
            }
            
            prev=curr;
            curr=next;
            next=next.next;
            index++;
        }
        if(max==-1 || min==Integer.MAX_VALUE){
            res[0]=-1;
            res[1]=-1;
        }
        else{
            res[0]=min;
            res[1]=max;
        }
        return res;
    }
}
