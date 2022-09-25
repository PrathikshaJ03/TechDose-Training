import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr1[]=new int[N];
		for(int i=0;i<N;i++){
		    arr1[i]=sc.nextInt();
		}
		int M=sc.nextInt();
		int arr2[]=new int[M];
		for(int i=0;i<M;i++){
		    arr2[i]=sc.nextInt();
		}
		int p1=0,p2=0;
		while(p1<N && p2<M){
		    if(arr1[p1]<=arr2[p2]){
		        p1++;
		    }
		    else{
		        System.out.print(p1+" ");
		        p2++;
		    }
		}
		while(p2<M){
		    System.out.print(p1+" ");
		    p2++;
		}
	}
}
