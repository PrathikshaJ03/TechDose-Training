import java.util.*;
class Main{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		if((N&1)==1){
		    System.out.print("Odd");
		}
		else{
		    System.out.print("Even");
		}
	}
}
