
import java.util.*;
public class Main {
    static List<List<Integer>> list=new ArrayList<>();
    static boolean visited[];
    
    //Recursion
    public static void dfs1(int n){
        System.out.print(n+" ");
        visited[n]=true;
        for(Integer i:list.get(n)){
            if(!visited[i]){
                dfs1(i);
            }
        }
    }
    
    
    //Iterative
    public static void dfs2(int n){
        Stack<Integer> stack=new Stack<>();
        stack.push(0);
        boolean visit[]=new boolean[n];
        while(!stack.isEmpty()){
            int val=stack.pop();
            if(!visit[val]){
                System.out.print(val+" ");
                visit[val]=true;
                
                for(Integer i:list.get(val)){
                    if(!visit[i]){
                        stack.push(i);
                    }
                }
            }
            
        }
    }
    
    public static void main(String[] args) {
        int n=6;
        int edges[][]={{3,5},{4,2},{2,0},{1,4},{1,3},{2,3},{5,4},{0,1}};
        visited=new boolean[n];
        for(int i=0;i<n;i++){
            list.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            list.get(edges[i][0]).add(edges[i][1]);
            list.get(edges[i][1]).add(edges[i][0]);
        }
        dfs1(0);
        System.out.println();
        dfs2(n);
    }
}
