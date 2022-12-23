import java.util.*;
public class Main{
    static List<List<Integer>> list=new ArrayList<>();
    
    //Iterative
    public static void bfs1(boolean visited[]){
        Queue<Integer> queue=new LinkedList<>();
        queue.add(0);
        while(!queue.isEmpty()){
            int val=queue.poll();
            if(!visited[val]){
                System.out.print(val+" ");
                visited[val]=true;
                
                for(Integer i:list.get(val)){
                    if(!visited[i]){
                        queue.add(i);
                    }
                }
            }
        }
    }
    
    //Recursive
    public static void bfs2(Queue<Integer> queue,boolean visited[]){
        if(queue.isEmpty()){
            return;
        }
        int val=queue.poll();
        if(!visited[val]){
            System.out.print(val+" ");
            visited[val]=true;
            
            for(Integer i:list.get(val)){
                if(!visited[i]){
                    queue.add(i);
                }
            }
        }
        bfs2(queue,visited);
    }
    
	public static void main(String[] args) {
		int n=6;
		int edges[][]={{3,5},{4,2},{2,0},{1,4},{1,3},{2,3},{5,4},{0,1}};
		for(int i=0;i<n;i++){
		    list.add(new ArrayList<>());
		}
		for(int i=0;i<edges.length;i++){
		    list.get(edges[i][0]).add(edges[i][1]);
		    list.get(edges[i][1]).add(edges[i][0]);
		}
		boolean visited[]=new boolean[n];
		bfs1(visited);
		System.out.println();
		Arrays.fill(visited,false);
		Queue<Integer> queue=new LinkedList<>();
		queue.add(0);
		bfs2(queue,visited);
	}
}
