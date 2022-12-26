import java.util.*;
public class Main{
    static int parent[];
    
    public static int find(int n){
        if(parent[n]==-1){
            return n;
        }
        return find(parent[n]);
    }
    
    public static boolean union(int from,int to){
        int fromP=find(from);
        int toP=find(to);
        
        if(fromP==toP){
            return true;
        }
        parent[fromP]=toP;
        return false;
    }
    
	public static void main(String[] args) {
		int n=4;
		parent=new int[n];
		Arrays.fill(parent,-1);
		int edges[][]={{0,1},{0,3},{2,3},{1,2}};
		
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
