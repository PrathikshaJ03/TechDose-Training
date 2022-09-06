import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        long result=1;
        while(b>0){
            if(b%2==1){
                result*=a;
            }
            a=a*a;
            b/=2;
        }
        System.out.print(result);
	}
}
