// To find Minimum cost Spanning tree => Greedy Method => Prim's Algorithm

import java.util.*;
public class Main{
    
    //Finding minimum weight node
    public static int findMinNode(boolean visited[],int dist[]){
        
        int min=Integer.MAX_VALUE,minNode=-1;
        
        for(int i=0;i<dist.length;i++){
            if(!visited[i] && dist[i]<min){
                min=dist[i];
                minNode=i;
            }
        }
        return minNode;
    }
    
    public static void findMST(int n,int graph[][]){
        
        int dist[]=new int[n];
        boolean visited[]=new boolean[n];
        int parent[]=new int[n];
        
        Arrays.fill(dist,Integer.MAX_VALUE);
        parent[0]=-1;
        dist[0]=0;
        
        for(int i=1;i<n;i++){
            int min=findMinNode(visited,dist);
            visited[min]=true;
            for(int j=0;j<n;j++){
                if(graph[min][j]>0 && !visited[j] && dist[j]>=graph[min][j]){
                    dist[j]=graph[min][j];
                    parent[j]=min;
                }
            }
        }
        
        //Printing with parent array
        for(int i=1;i<n;i++){
            System.out.println(i+" -> "+parent[i]+" = "+graph[i][parent[i]]);
        }
    }
    
	public static void main(String[] args) {
		
		int n=6;
		
// 		Adjacency matrix
// 		int graph[][]={{0,3,1,0},{3,0,2,4},{1,2,0,5},{0,4,5,0}};
		int graph[][]={{0,4,6,0,0,0},{4,0,6,3,4,0},{6,6,0,1,0,0},{0,3,1,0,2,3},{0,4,0,2,0,7},{0,0,0,3,7,0}};
		
		findMST(n,graph);
	}
}
