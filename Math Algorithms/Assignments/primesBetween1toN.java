import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        boolean prime[]=new boolean[N+1];
        for(int i=2;i*i<=N;i++){
            if(prime[i]==false){
                for(int j=2;i*j<=N;j++){
                    prime[i*j]=true;
                }
            }
        }
        for(int i=2;i<=N;i++){
            if(prime[i]==false){
                System.out.print(i+" ");
            }
        }
	}
}
