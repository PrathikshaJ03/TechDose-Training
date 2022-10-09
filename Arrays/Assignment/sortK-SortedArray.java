//Insertion sort
import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++){
		    arr[i]=sc.nextInt();
		}
		for(int i=1;i<N;i++){
		    int j=i;
		    while(j>=1 && arr[j]<arr[j-1]){
		        swap(arr,j-1,j);
		        j--;
		    }
		}
		for(int i=0;i<N;i++){
		    System.out.print(arr[i]+" ");
		}
	}
	public static void swap(int arr[],int i,int j){
		    int temp=arr[i];
		    arr[i]=arr[j];
		    arr[j]=temp;
		}
}
