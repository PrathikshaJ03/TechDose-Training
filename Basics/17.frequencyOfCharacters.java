import java.util.*;
class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int count[]=new int[26];
		for(int i=0;i<str.length();i++){
		    count[(int)(str.charAt(i)-'a')]++;
		}
		for(int i=0;i<str.length();i++){
		    if(count[(int)(str.charAt(i)-'a')]>0){
		        System.out.println(str.charAt(i)+" : "+count[(int)(str.charAt(i)-'a')]);
		        count[(int)(str.charAt(i)-'a')]=0;
		    }
		}
		
		/* Using Map
		Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<str.length();i++){
		    if(map.containsKey(str.charAt(i))){
		        int count=map.get(str.charAt(i))+1;
		        map.put(str.charAt(i),count);
		    }
		    else{
		        map.put(str.charAt(i),1);
		    }
		}
		for(char ch:map.keySet()){
		    System.out.println(ch+" : "+map.get(ch));
		}
		*/
	}
}
