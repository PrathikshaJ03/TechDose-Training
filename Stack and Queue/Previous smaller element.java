import java.util.*;
class Main{
    public static int[] prevSmaller(int arr1[],int arr2[]){
        int N=arr1.length;
        int M=arr2.length;
        Map<Integer,Integer> map=new HashMap<>();
        Stack<Integer> stack=new Stack<>();
        for(int i=M-1;i>=0;i--){
            while(!stack.isEmpty() && arr2[i]<stack.peek()){
                map.put(stack.pop(),arr2[i]);
            }
            stack.push(arr2[i]);
        }
        int res[]=new int[N];
        for(int i=0;i<N;i++){
            res[i]=map.getOrDefault(arr1[i],-1);
        }
        return res;
    }
    
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
		int res[]=prevSmaller(arr1,arr2);
		for(int i=0;i<N;i++){
		    System.out.print(res[i]+" ");
		}
	}
}
