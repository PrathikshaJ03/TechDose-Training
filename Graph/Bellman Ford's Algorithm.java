import java.util.*;
public class Main{
    
    public static void bellmanford(int n,int graph[][]){
        int cost[]=new int[n];
        int parent[]=new int[n];
        Arrays.fill(cost,Integer.MAX_VALUE);
        cost[0]=0;
        parent[0]=-1;
        boolean updated=false;
        
        //V-1 relaxation
        for(int i=0;i<n-1;i++){
            updated=false;
            for(int j=0;j<graph.length;j++){
                int src=graph[j][0];
                int dest=graph[j][1];
                int weight=graph[j][2];
                
                if(cost[src]+weight<cost[dest]){
                    cost[dest]=cost[src]+weight;
                    parent[dest]=src;
                    updated=true;
                }
            }
            if(!updated){
                break;
            }
        }
        
        //Vth  relaxation if there is an update in (V-1)relaxation
        if(updated){
            for(int j=0;j<graph.length;j++){
                int src=graph[j][0];
                int dest=graph[j][1];
                int weight=graph[j][2];
                if(cost[src]+weight<cost[dest]){
                    System.out.print("Negative Edge Weight Cycle");
                    return;
                }
            }
        }
        
        //Printing single source shortest path
        for(int i=0;i<n;i++){
            System.out.println(i+" -> "+cost[i]);
        }
    }
    
	public static void main(String[] args) {
	    //Negative edge weight Cycle
	    // int n=3;
	    // int graph[][]={{0,1,2},{1,2,3},{2,0,-6}};
	    
	    int n=5;
	    int graph[][]={{0,1,6},{0,2,7},{1,2,8},{1,3,-4},{1,4,5},{2,3,9},{2,4,-3},{3,4,7},{3,0,2},{4,1,-2}};
	    bellmanford(n,graph);
	}
}
