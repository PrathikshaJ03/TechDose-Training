
public class Main{
	public static void main(String[] args) {
		int N=5;
		int arr[]=new int[N];
		add(arr,N,0,3,10);
		add(arr,N,2,4,10);
		add(arr,N,1,3,10);
		print(arr);
	}
	public static void add(int arr[],int N,int low,int high,int val){
	    arr[low]+=val;
	    if(high!=N-1){
	        arr[high+1]-=val;
	    }
	}
	public static void update(int arr[]){
	    for(int i=1;i<arr.length;i++){
	        arr[i]+=arr[i-1];
	    }
	}
	public static void print(int arr[]){
	    update(arr);
	    for(int i=0;i<arr.length;i++){
	        System.out.print(arr[i]+" ");
	    }
	}
}
