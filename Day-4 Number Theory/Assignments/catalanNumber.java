import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int N=sc.nextInt();
	    int arr[]=new int[N+1];
	    arr[0]=1;
	    arr[1]=1;
	    for(int i=2;i<=N;i++){
	        int res=0;
	        for(int j=1;j<=i;j++){
	            res+=arr[j-1] * arr[i-j];
	        }
	        arr[i]=res;
	    }
	    System.out.print(arr[N]);
	}
}
