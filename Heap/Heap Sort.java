import java.util.*;

class MinHeap{
    static int maxSize,size;
    static int heap[];
    MinHeap(int maxSize){
        this.maxSize=maxSize;
        size=0;
        heap=new int[maxSize+1];
    }
    
    static void heapSort(int arr[]){
        for(int i=0;i<maxSize;i++){
            push(arr[i]);
        }
        for(int i=0;i<maxSize;i++){
            System.out.print(pop()+" ");
        }
    }
    
    static int pop(){
        int popped=heap[1];
        heap[1]=heap[size];
        size--;
        heapify(1);
        return popped;
    }
    
    static void heapify(int index){
        int left=2*index;
        int right=2*index+1;
        int smallest=index;
        if(left<=size && heap[left]<heap[smallest]){
            smallest=left;
        }
        if(right<=size && heap[right]<heap[smallest]){
            smallest=right;
        }
        if(smallest!=index){
            swap(index,smallest);
            heapify(smallest);
        }
    }
    
    static void push(int val){
        heap[size+1]=val;
        int i=size+1;
        while(i>1 && heap[i/2]>heap[i]){
            swap(i/2,i);
            i=i/2;
        }
        size++;
    }
    
    static void swap(int i,int j){
        int temp=heap[i];
        heap[i]=heap[j];
        heap[j]=temp;
    }
}

public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++){
		    arr[i]=sc.nextInt();
		}
		System.out.println("Before Sorting");
		for(int i=0;i<N;i++){
		    System.out.print(arr[i]+" ");
		}
		System.out.println();
		MinHeap heap=new MinHeap(N);
		System.out.println("After Sorting");
		heap.heapSort(arr);
	}
}
