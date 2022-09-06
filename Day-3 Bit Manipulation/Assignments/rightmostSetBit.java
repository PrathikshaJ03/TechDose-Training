import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int pos=1;
        while(N>0){
            if((N&1)==1){
                System.out.print(pos);
                break;
            }
            N=N>>1;
            pos++;
        }
	}
}
