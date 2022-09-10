import java.util.*;
class Main {
    
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
    public static void bubbleSort(int arr[]){
        for(int i=arr.length-1;i>0;i--){
            boolean isSwapped=false;
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    isSwapped=true;
                }
            }
            if(isSwapped==false){
                break;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        bubbleSort(arr);
        for(int i=0;i<N;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
