import java.util.*;
public class Main{
    
    static List<Set<Integer>> list=new ArrayList<>();
    static boolean visited[];
    static Stack<Integer> stack=new Stack<>();
    
  //Recursion
    public static void topoSort(int val){
        visited[val]=true;
        for(Integer i:list.get(val)){
            if(!visited[i]){
                topoSort(i);
            }
        }
        stack.push(val);
    }
    
	public static void main(String[] args) {
		int n=6;
		int edges[][]={{0,2},{0,3},{5,2},{3,1},{4,2},{5,0},{4,1}};
		
		for(int i=0;i<n;i++){
		    list.add(new HashSet<>());
		}
		for(int i=0;i<edges.length;i++){
		    list.get(edges[i][0]).add(edges[i][1]);
		}
		visited=new boolean[n];
		for(int i=0;i<n;i++){
		    if(!visited[i]){
		        topoSort(i);
		    }
		}
		while(!stack.isEmpty()){
		    System.out.print(stack.pop()+" ");
		}
	}
}
