import java.util.*;
public class Main{
    
    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    
    public static int lcm(int a,int b){
        return (a/gcd(a,b))*b;
    }
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt();
		int result=lcm(a,b);
		System.out.print(result);
	}
}
