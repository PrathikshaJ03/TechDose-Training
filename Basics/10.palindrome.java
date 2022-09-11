import java.util.*;
public class Main{

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str=sc.next();
	    int start=0,end=str.length()-1;
	    while(start<=end){
	        if(str.charAt(start)!=str.charAt(end)){
	            System.out.print("Not a Palindrome");
	            return;
	        }
	        start++;
	        end--;
	    }
	    System.out.print("Palindrome");
	}
}
