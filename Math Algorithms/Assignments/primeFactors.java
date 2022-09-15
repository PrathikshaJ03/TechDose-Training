import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int temp=N;
        for(int i=1;i*i<=temp;i++){
            if(temp%i==0){
                temp/=i;
                System.out.print(i+" ");
            }
        }
        if(temp==N){
            System.out.print(temp);
        }
	}
}
