import java.util.*;
public class Main{
    
    static int parent[];
    static int rank[];
    
    public static int find(int n){
        if(parent[n]==-1){
            return n;
        }
        parent[n]=find(parent[n]);
        return parent[n];
    }
    
    public static boolean union(int from,int to){
        from=find(from);
        to=find(to);
        if(from==to){
            return true;
        }
        if(rank[from]>rank[to]){
            parent[to]=from;
        }
        else if(rank[to]>rank[from]){
            parent[from]=to;
        }
        else{
            parent[from]=to;
            rank[to]+=1;
        }
        return false;
    }
    
    public static void findMST(int n,int graph[][]){
        
        parent=new int[n];
        rank=new int[n];
        Arrays.sort(graph,(a,b)->a[2]-b[2]);
        Arrays.fill(parent,-1);
        
        int i=1,j=0;
        List<int[]> res=new ArrayList<>();
        
        while(i<n && j<graph.length){
            if(union(graph[j][0],graph[j][1])){
                j++;
                continue;
            }
            res.add(new int[]{graph[j][0],graph[j][1]});
            i++;
            j++;
        }
        
        for(i=0;i<res.size();i++){
            System.out.println(res.get(i)[0]+" "+res.get(i)[1]);
        }
    }
    
	public static void main(String[] args) {
		int n=6;
		int graph[][]={{0,1,6},{0,5,4},{1,5,2},{1,2,9},{1,4,1},{5,4,7},{4,2,5},{2,3,3},{4,3,2}};
// 		int graph[][]={{0,1,3},{1,2,2},{0,2,1},{2,3,5},{1,3,4}};
		findMST(n,graph);
	}
}
