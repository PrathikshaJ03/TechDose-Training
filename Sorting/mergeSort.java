import java.util.*;
class Main {
    
    public static void merge(int arr[],int low,int mid,int high){
        int temp[]=new int[high+1];
        int i=low,k=low,j=mid+1;
        while(i<=mid && j<=high){
            if(arr[i]<arr[j]){
                temp[k++]=arr[i++];
            }
            else{
                temp[k++]=arr[j++];
            }
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=high){
            temp[k++]=arr[j++];
        }
        for(i=low;i<=high;i++){
            arr[i]=temp[i];
        }
    }
    
    public static void mergeSort(int arr[],int low,int high){
        if(low==high){
            return;
        }
        int mid=low + (high-low)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        mergeSort(arr,0,N-1);
        for(int i=0;i<N;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
