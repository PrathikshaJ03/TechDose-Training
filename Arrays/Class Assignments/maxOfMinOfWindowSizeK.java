import java.util.*;
public class Main{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int N=sc.nextInt();
	    int arr[]=new int[N];
	    for(int i=0;i<N;i++){
	        arr[i]=sc.nextInt();
	    }
	    int k=sc.nextInt();
	    int result=findMaxOfMin(arr,k);
	    System.out.print(result);
	}
	
	public static int findMaxOfMin(int arr[],int k){
	    Deque<Integer> deque = new ArrayDeque<>();
	    int right=0,index=0;
	    int result[]=new int[arr.length-k+1];
	    while(right<arr.length){
	        if(!deque.isEmpty() && right-k==deque.getFirst()){
	            deque.removeFirst();
	        }
	        while(!deque.isEmpty() && arr[right]<arr[deque.getLast()]){
	            deque.removeLast();
	        }
	        deque.add(right);
	        if(right>=k-1){
	            result[index++]=arr[deque.getFirst()];
	        }
	        right++;
	    }
	    int max=Integer.MIN_VALUE;
	    for(int i=0;i<result.length;i++){
	        if(result[i]>max){
	            max=result[i];
	        }
	    }
	    return max;
	}
}
