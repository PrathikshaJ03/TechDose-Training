import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int numOfSubsets=1<<arr.length;
        for(int i=0;i<numOfSubsets;i++) {
            int pos=arr.length-1;
            int mask=i;
            while(mask > 0) {
                if((mask & 1)==1){
                    System.out.print(arr[pos]+" ");
                }
                mask>>=1;
                pos--;
            }
            System.out.println();
        }
	}
}
