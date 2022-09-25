import java.util.*;
public class Main{
    public static int kthLargest(int arr[],int N,int K){
        quickSelect(arr,0,N-1,K);
        return arr[K-1];
    }
    
    public static void quickSelect(int arr[],int low,int high,int K){
        if(low<high){
            int partitionIndex=partition(arr,low,high);
            if(partitionIndex+1==K){
                return;
            }
            else if(partitionIndex>=K){
                quickSelect(arr,low,partitionIndex-1,K);
            }
            else{
                quickSelect(arr,partitionIndex+1,high,K);
            }
        }
    }
    
    public static int partition(int arr[],int low,int high){
        int i=low-1;
        int pivot=arr[high];
        for(int j=low;j<high;j++){
            if(arr[j]>pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return i+1;
    }
    
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++){
		    arr[i]=sc.nextInt();
		}
		int K=sc.nextInt();
		int result=kthLargest(arr,N,K);
		System.out.print(result);
	}
}
