import java.util.*;
public class Main{
    public static int sumOfNaturalNos(int N){
        if(N==1){
            return 1;
        }
        return N+sumOfNaturalNos(N-1);
    }
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		System.out.print(sumOfNaturalNos(N));
	}
}

// TC : O(N)
// SC : O(N)
