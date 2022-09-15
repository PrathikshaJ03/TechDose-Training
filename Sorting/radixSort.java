import java.util.*;
public class Main
{
    public static int maximum(int arr[]){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    
    public static void countingSort(int arr[],int exp,int N){
        int count[]=new int[10];
        for(int i=0;i<N;i++){
            count[(arr[i]/exp)%10]++;
        }
        for(int i=1;i<10;i++){
            count[i]+=count[i-1];
        }
        int result[]=new int[N];
        for(int i=N-1;i>=0;i--){
            result[count[arr[i]/exp%10]-1]=arr[i];
            count[arr[i]/exp%10]--;
        }
        for(int i=0;i<N;i++){
            arr[i]=result[i];
        }
    }
    
    public static void radixSort(int arr[],int N){
        int max=maximum(arr);
        for(int exp=1;max/exp>0;exp*=10){
            countingSort(arr,exp,N);
        }
    }
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++){
		    arr[i]=sc.nextInt();
		}
		radixSort(arr,N);
		for(int i=0;i<N;i++){
		    System.out.print(arr[i]+" ");
		}
	}
}
