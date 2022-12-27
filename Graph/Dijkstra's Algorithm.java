import java.util.*;

public class Main{
    
    public static int findMinNode(int dist[],boolean visited[]){
        int min=Integer.MAX_VALUE,minIndex=-1;
        for(int i=0;i<dist.length;i++){
            if(dist[i]<min && !visited[i]){
                min=dist[i];
                minIndex=i;
            }
        }
        return minIndex;
    }
    
    public static void dijkstra(int n,int graph[][]){
        int dist[]=new int[n];
        boolean visited[]=new boolean[n];
        int parent[]=new int[n];
        
        Arrays.fill(dist,Integer.MAX_VALUE);
        Arrays.fill(parent,-1);
        dist[0]=0;

        for(int i=0;i<n-1;i++){
            int min=findMinNode(dist,visited);
            visited[min]=true;
            for(int j=0;j<n;j++){
                if(graph[min][j]>0 && !visited[j] && dist[j]>graph[min][j]+dist[min]){
                    dist[j]=graph[min][j]+dist[min];
                    parent[j]=min;
                }
            }
        }
        
        //Print shortest distance from source to all nodes
        for(int i=0;i<n;i++){
            System.out.println(i+" -> "+dist[i]);
        }
    }
	
	public static void main(String[] args) {
		int n=6;
		int graph[][]={{0,4,6,0,0,0},{4,0,6,3,4,0},{6,6,0,1,0,0},{0,3,1,0,2,3},{0,4,0,2,0,7},{0,0,0,3,7,0}};
// 		int graph[][]={{0,3,1,0},{3,0,2,4},{1,2,0,5},{0,4,5,0}};
		dijkstra(n,graph);
	}
}
