import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int K=sc.nextInt();
		Map<Character,Integer> map=new HashMap<>();
		int left=0,right=0,result=0;
		while(right<str.length()){
		    if(map.containsKey(str.charAt(right))){
		        map.put(str.charAt(right),map.get(str.charAt(right))+1);
		    }
		    else{
		        map.put(str.charAt(right),1);
		    }
		    if(map.size()>K){
		        int val=map.get(str.charAt(left));
		        if(val-1==0){
		            map.remove(str.charAt(left));
		        }
		        else{
		            map.put(str.charAt(left),val-1);
		        }
		        left++;
		    }
		    if(map.size()==K){
		        result=(result>(right-left+1))?result:(right-left+1);
		    }
		    right++;
		}
		System.out.print(result);
	}
}
