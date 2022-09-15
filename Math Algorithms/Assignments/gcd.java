import java.util.*;
class Main
{
    
    public static int gcd(int A,int B){
        if(A==0){
            return B;
        }
        else{
            return gcd(B%A,A);
        }
    }
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int X=sc.nextInt(),Y=sc.nextInt();
        System.out.print(gcd(X,Y));
	}
}
