import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++){
		    arr[i]=sc.nextInt();
		}
		int maxSum=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0;i<N;i++){
		    sum+=arr[i];
		    maxSum=(maxSum>sum)?maxSum:sum;
		    if(sum<0){
		        sum=0;
		    }
		}
		System.out.print(maxSum);
	}
}
