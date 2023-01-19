import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		
		int res=lcs1(s1,s1.length(),s2,s2.length());
		System.out.println(res);
		
		int mem[][]=new int[s1.length()+1][s2.length()+1];
		for(int i=0;i<=s1.length();i++){
		    for(int j=0;j<=s2.length();j++){
		        mem[i][j]=-1;
		    }
		}
		res=lcs2(s1,s1.length(),s2,s2.length(),mem);
		System.out.println(res);
		
		res=lcs3(s1,s1.length(),s2,s2.length());
		System.out.println(res);
	}
	
	//Recursion
	public static int lcs1(String s1,int m,String s2,int n){
	    if(m==0 || n==0){
	        return 0;
	    }
	    if(s1.charAt(m-1)==s2.charAt(n-1)){
	        return 1+lcs1(s1,m-1,s2,n-1);
	    }
	    return Math.max(lcs1(s1,m-1,s2,n),lcs1(s1,m,s2,n-1));
	}
	
	//Recursion+Memoization
	public static int lcs2(String s1,int m,String s2,int n,int mem[][]){
	    if(m==0 || n==0){
	        return 0;
	    }
	    if(mem[m][n]!=-1){
	        return mem[m][n];
	    }
	    if(s1.charAt(m-1)==s2.charAt(n-1)){
	        mem[m][n]=1+lcs2(s1,m-1,s2,n-1,mem);
	        return mem[m][n];
	    }
	    mem[m][n]=Math.max(lcs2(s1,m-1,s2,n,mem),lcs2(s1,m,s2,n-1,mem));
	    return mem[m][n];
	}
	
	//Dynamic Programming
	public static int lcs3(String s1,int m,String s2,int n){
	    int dp[][]=new int[m+1][n+1];
	    for(int i=0;i<=m;i++){
	        for(int j=0;j<=n;j++){
	            if(i==0 || j==0){
	                dp[i][j]=0;
	                continue;
	            }
	            if(s1.charAt(i-1)==s2.charAt(j-1)){
	                dp[i][j]=1+dp[i-1][j-1];
	            }
	            else{
	                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
	            }
	        }
	    }
	    return dp[m][n];
	}
}
