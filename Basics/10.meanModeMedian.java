import java.util.*;
public class Main{
    
    public static double findMean(int arr[]){
        int N=arr.length;
        double sum=0;
        for(int i=0;i<N;i++){
            sum+=arr[i];
        }
        return sum/(double)N;
    }
    
    public static double findMedian(int arr[]){
        int N=arr.length;
        Arrays.sort(arr);
        if(N%2==0){
            return (double)(arr[N/2]+arr[(N-1)/2])/2.0;
        }
        else{
            return (double)arr[N/2];
        }
    }
    
    public static int findMode(int arr[]){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                int count=map.get(arr[i])+1;
                map.put(arr[i],count);
            }
            else{
                map.put(arr[i],1);
            }
        }
        int max=0,result=0;
        for(int val:map.keySet()){
            if(map.get(val)>max){
                max=map.get(val);
                result=val;
            }
        }
        return result;
    }
    
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int N=sc.nextInt();
	    int arr[]=new int[N];
	    for(int i=0;i<N;i++){
	        arr[i]=sc.nextInt();
	    }
	    double mean=findMean(arr);
	    double median=findMedian(arr);
	    int mode=findMode(arr);
	    System.out.print(mean+"\n"+median+"\n"+mode);
	}
}
