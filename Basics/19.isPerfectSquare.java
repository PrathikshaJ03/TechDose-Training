import java.util.*;
public class Main{
    
    public static boolean isPerfectSquare(int N){
        if(N==0){
            return false;
        }
        for(int i=1;i*i<=N;i++){
            if((N%i==0) && (i*i==N)){
                return true;
            }
        }
        return false;
    }

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int N=sc.nextInt();
	    if(isPerfectSquare(N)){
	        System.out.print("Perfect Square");
	    }
	    else{
	        System.out.print("Not a Perfect Square");
	    }
	}
}
