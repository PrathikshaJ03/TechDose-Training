import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int gardens[]=new int[N];
		for(int i=0;i<N;i++){
		    gardens[i]=sc.nextInt();
		}
		int noOfWorkers=sc.nextInt();
		int result=minTime(gardens,N,noOfWorkers);
		System.out.print("Minimum number of hours required "+result);
	}
	public static int minTime(int arr[],int N,int K){
	    int sum=arr[0],max=arr[0];
	    for(int i=0;i<N;i++){
	        if(arr[i]>max){
	            max=arr[i];
	        }
	        sum+=arr[i];
	    }
	    if(K==N){
	        return sum;
	    }
	    else if(K==1){
	        return max;
	    }
	    int low=max,high=sum,mid,result=0;
	    while(low<=high){
	        mid=low+(high-low)/2;
	        if(func(arr,K,mid)){
	            result=mid;
	            high=mid-1;
	        }
	        else{
	            low=mid+1;
	        }
	    }
	    return result;
	}
	
	public static boolean func(int arr[],int K,int mid){
	    int sum=0,workers=1;
	    for(int i=0;i<arr.length;i++){
	        if(arr[i]+sum<=mid){
	            sum+=arr[i];
	        }
	        else{
	            sum=arr[i];
	            workers++;
	        }
	    }
	    if(workers<=K){
	        return true;
	    }
	    else{
	        return false;
	    }
	}
}
