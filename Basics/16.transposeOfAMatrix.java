import java.util.*;
class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int R=sc.nextInt();
		int C=sc.nextInt();
		int matrix[][]=new int[R][C];
		for(int i=0;i<R;i++){
		    for(int j=0;j<C;j++){
		        matrix[i][j]=sc.nextInt();
		    }
		}
		for(int i=0;i<C;i++){
		    for(int j=0;j<R;j++){
		        System.out.print(matrix[j][i]+" ");
		    }
		    System.out.println();
		}
	}
}
