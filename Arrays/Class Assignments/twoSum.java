import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++){
		    arr[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		Arrays.sort(arr);
		int left=0,right=N-1;
		while(left<right){
		    if(arr[left]+arr[right]==target){
		        System.out.print(arr[left]+" "+arr[right]);
		        break;
		    }
		    else if(arr[left]+arr[right]<target){
		        left++;
		    }
		    else{
		        right--;
		    }
		}
	}
}
