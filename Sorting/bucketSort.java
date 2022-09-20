import java.util.*;
class Main{
    public static void bucketSort(int[] arr)
	{
	    int bucketSize=10;
	    List<Integer>[] list = new List[bucketSize];
	    for(int i=0;i<bucketSize;i++){
	        list[i]=new LinkedList<Integer>();
	    }
	    for(int num:arr){  
	        list[hash(num,bucketSize)].add(num);  
	    }  
	    for(int i=0;i<bucketSize;i++){
	        Collections.sort(list[i]);
	    }
	    int index=0;
	    for(List<Integer> l : list){  
	        for(int num : l){  
	            arr[index++] = num;  
	        }  
	    }  
	}
	
	public static int hash(int num, int bucketSize){  
	    return num/bucketSize;  
	}  
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int N=sc.nextInt();
	    int arr[]=new int[N];
	    for(int i=0;i<N;i++){
	        arr[i]=sc.nextInt();
	    }
	    bucketSort(arr);
	    for(int i=0;i<N;i++){
	        System.out.print(arr[i]+" ");
	    }
	}
}
