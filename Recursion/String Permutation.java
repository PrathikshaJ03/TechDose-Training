import java.util.*;
public class Main{
    static int count=0;
    public static void permutation(String s,String res){
        if(s.length()==0){
            System.out.println(res);
            count++;
            return;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            String left=s.substring(0,i);
            String right=s.substring(i+1);
            permutation(left+right,res+ch);
        }
    }
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		permutation(s,"");
		System.out.print(count);
	}
}
