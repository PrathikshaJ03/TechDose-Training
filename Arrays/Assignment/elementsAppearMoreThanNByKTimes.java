import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++){
		    arr[i]=sc.nextInt();
		}
		int K=sc.nextInt();
		Map<Integer,Integer> map=new HashMap<>();
	    for(int i=0;i<N;i++){
	        map.put(arr[i],map.getOrDefault(arr[i],0)+1);
	    }
	    for(int i:map.keySet()){
	        if(map.get(i)>N/K){
	            System.out.print(i+" ");
	        }
	    }
	}
}
