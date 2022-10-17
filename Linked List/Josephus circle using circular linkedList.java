import java.util.*;

class ListNode{
    int data;
    ListNode next;
    ListNode(int data){
        this.data=data;
    }
}

public class Main{
    public static int getJosephusPosition(int N,int M){
        ListNode head=new ListNode(1);
        ListNode temp=head;
        for(int i=2;i<=N;i++){
            temp.next=new ListNode(i);
            temp=temp.next;
        }
        temp.next=head;
        ListNode curr=head,prev=head;
        while(curr.next!=curr){
            int count=1;
            while(count!=M){
                prev=curr;
                curr=curr.next;
                count++;
            }
            prev.next=curr.next;
            curr=prev.next;
        }
        return curr.data;
    }
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		System.out.print(getJosephusPosition(N,M));
	}
}
