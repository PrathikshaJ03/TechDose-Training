import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(),R=sc.nextInt();
        int pt[][]=new int[N+1][N+1];
        for(int i=0;i<=N;i++){
            for(int j=0;j<=i;j++){
                if(j==0){
                    pt[i][j]=1;
                }
                else if(i==j){
                    pt[i][j]=1;
                }
                else{
                    pt[i][j]=pt[i-1][j-1]+pt[i-1][j];
                }
            }
        }
        System.out.print(pt[N][R]);
	}
}
