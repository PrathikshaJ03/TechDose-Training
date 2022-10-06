import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++){
		    arr[i]=sc.nextInt();
		}
		int K=sc.nextInt();
		int result[]=firstNegative(arr,K);
		for(int i=0;i<result.length;i++){
		    System.out.print(result[i]+" ");
		}
	}
	
	public static int[] firstNegative(int arr[],int k){
	    int result[]=new int[arr.length-k+1];
	    int index=0;
	    Deque<Integer> deque=new ArrayDeque<>();
	    int right=0;
	    while(right<arr.length){
	        if(!deque.isEmpty() && right-k==deque.getFirst()){
	            deque.removeFirst();
	        }
	        if(arr[right]<0)
	        deque.add(right);
	        if(right>=k-1){
	            result[index++]=arr[deque.getFirst()];
	        }
	        right++;
	    }
	    return result;
	}
}
