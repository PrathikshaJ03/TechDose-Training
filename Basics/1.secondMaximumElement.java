import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int max=(arr[0]>arr[1])?arr[0]:arr[1];
        int secondMax=(arr[0]<arr[1])?arr[1]:arr[0];
        for(int i=2;i<N;i++){
            if(arr[i]>max){
                secondMax=max;
                max=arr[i];
            }
            else if(arr[i]>secondMax){
                secondMax=arr[i];
            }
        }
        System.out.print(secondMax);
    }
}
