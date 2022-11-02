import java.util.*;

public class Main{
    static Map<Integer,Integer> map=new HashMap<>();
    
    public static int fib(int N){
        if(N==0 || N==1){
            return N;
        }
        if(map.containsKey(N)){
            return map.get(N);
        }
        int sum=fib(N-1)+fib(N-2);
        map.put(N,sum);
        return sum;
    }
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		System.out.print(fib(N));
	}
}
