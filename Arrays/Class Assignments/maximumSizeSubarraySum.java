import java.util.*; 
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int N=sc.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<N;i++){
	        arr[i]=sc.nextInt();
	    }
	    int target=sc.nextInt();
	    int sum=0,left=0,right=0,max=0;
	    while(right<N){
	        while(right<N && sum<target){
	            sum=sum+arr[right++];
	        }
	        if(max<(right-left)){
	            max=right-left;
	        }
	        while(sum>=target){
	            sum=sum-arr[left++];
	        }
	    }
	    System.out.println(max);
	}
}
