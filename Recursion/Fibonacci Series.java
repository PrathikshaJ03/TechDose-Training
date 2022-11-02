import java.util.*;

public class Main{
    
    public static int fib(int N){
        if(N==0 || N==1){
            return N;
        }
        return fib(N-1)+fib(N-2);
    }
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		System.out.print(fib(N));
	}
}

// TC : O(2^N)
// SC : O(N)
