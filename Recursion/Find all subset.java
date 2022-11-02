import java.util.*;

public class Main{
    static String s[];
    static int index;
    
    Main(int len){
        s=new String[1<<len];
        index=0;
    }
    
    public static void findSubset(String str,int pos,String curr){
        if(pos>=str.length()){
            s[index++]=curr;
            return;
        }
        findSubset(str,pos+1,curr);
        curr=curr+str.charAt(pos);
        findSubset(str,pos+1,curr);
    }
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		Main obj=new Main(str.length());
		findSubset(str,0,"");
		System.out.print(Arrays.toString(s));
	}
}
