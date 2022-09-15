import java.util.*;
public class Main
{
    public static void countingSort(int arr[]){
        int N=arr.length;
        int count[]=new int[10];
        for(int i=0;i<N;i++){
            count[arr[i]]++;
        }
        for(int i=1;i<10;i++){
            count[i]=count[i-1]+count[i];
        }
        int result[]=new int[N];
        for(int i=N-1;i>=0;i--){
            result[count[arr[i]]-1]=arr[i];
            count[arr[i]]--;
        }
        for(int i=0;i<N;i++){
            arr[i]=result[i];
        }
    }
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++){
		    arr[i]=sc.nextInt();
		}
		countingSort(arr);
		for(int i=0;i<N;i++){
		    System.out.print(arr[i]+" ");
		}
	}
}
