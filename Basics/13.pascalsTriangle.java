import java.util.*;
public class Main{

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int N=sc.nextInt();
	    int pascal[][]=new int[N+1][N+1];
	    for(int i=1;i<=N;i++){
	        for(int j=1;j<=i;j++){
	            if(i==j || j==1){
	                pascal[i][j]=1;
	            }
	            else{
	                pascal[i][j]=pascal[i-1][j-1]+pascal[i-1][j];
	            }
	        }
	    }
	    for(int i=1;i<=N;i++){
	        for(int j=1;j<=i;j++){
	            System.out.print(pascal[i][j]);
	        }
	        System.out.println();
	    }
	}
}
