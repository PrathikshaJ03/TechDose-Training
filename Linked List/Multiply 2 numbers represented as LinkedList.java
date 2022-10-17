import java.util.*;

class ListNode{
    int data;
    ListNode next;
}

public class Main{
    
    public static ListNode append(ListNode head,int data){
        ListNode newNode=new ListNode();
        newNode.data=data;
        newNode.next=null;
        
        if(head==null){
            return newNode;
        }
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        return head;
    }
    
    public static void print(ListNode head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
    
    public static ListNode multiply(ListNode l1,ListNode l2){
        int n1=0,n2=0;
        while(l1!=null){
            n1=n1*10+l1.data;
            l1=l1.next;
        }
        while(l2!=null){
            n2=n2*10+l2.data;
            l2=l2.next;
        }
        long mul=n1*n2;
        ListNode res=new ListNode();
        while(mul>0){
            ListNode temp=new ListNode();
            temp.data=(int)mul%10;
            temp.next=res.next;
            res.next=temp;
            mul/=10;
        }
        return res.next;
    }
    
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		ListNode l1=null,l2=null;
		int N1=sc.nextInt();
		for(int i=0;i<N1;i++){
		    l1=append(l1,sc.nextInt());
		}
		int N2=sc.nextInt();
		for(int i=0;i<N2;i++){
		    l2=append(l2,sc.nextInt());
		}
		ListNode l3=multiply(l1,l2);
		print(l3);
	}
}
