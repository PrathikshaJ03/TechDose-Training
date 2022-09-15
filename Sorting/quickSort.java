
import java.util.*;
public class Main
{
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
    public static int partition(int arr[],int low,int high){
        int pivot=arr[high];
        int i=low-1,j;
        for(j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return (i+1);
    }
    
    public static void quickSort(int arr[],int low,int high){
        if(low<high){
            int pivotIndex=partition(arr,low,high);
            quickSort(arr,low,pivotIndex-1);
            quickSort(arr,pivotIndex+1,high);
        }
    }
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++){
		    arr[i]=sc.nextInt();
		}
		quickSort(arr,0,N-1);
		for(int i=0;i<N;i++){
		    System.out.print(arr[i]+" ");
		}
	}
}
