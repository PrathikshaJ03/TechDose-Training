import java.util.*;
public class Main{
    public static int onesComplement(int N){
        return ~N;
    }
    
    public static int twosComplement(int N){
        return (~N)+1;
    }
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		System.out.println("1's Complement : "+onesComplement(N));
		System.out.println("2's Complement : "+twosComplement(N));
	}
}
