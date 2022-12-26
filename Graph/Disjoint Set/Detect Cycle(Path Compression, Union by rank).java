import java.util.*;
public class Main{
    static int parent[];
    static int rank[];
    
    
    public static int find(int n){
        if(parent[n]==-1){
            return n;
        }
        //Path Compression
        parent[n]=find(parent[n]);
        return parent[n];
    }
    
    public static boolean union(int from,int to){
        int fromP=find(from);
        int toP=find(to);
        
        if(fromP==toP){
            return true;
        }
        
        //Union by rank
        if(rank[fromP]>rank[toP]){
            parent[toP]=fromP;
        }
        else if(rank[toP]>rank[fromP]){
            parent[fromP]=toP;
        }
        else{
            parent[fromP]=toP;
            rank[toP]+=1;
        }
        return false;
    }
    
	public static void main(String[] args) {
		int n=5;
		parent=new int[n];
		rank=new int[n];
		Arrays.fill(parent,-1);
		int edges[][]={{0,1},{2,3},{1,2},{0,4},{4,3}};
		
		//Cycle detection
		for(int i=0;i<edges.length;i++){
		    if(union(edges[i][0],edges[i][1])){
		        System.out.print("Cycle is detected");
		        return;
		    }
		}
		System.out.print("Cycle is not detected");
	}
}
