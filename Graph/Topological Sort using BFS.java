import java.util.*;
public class Main{
    
    static List<Set<Integer>> list=new ArrayList<>();

    public static void topoSort(int n,int inDeg[]){
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(inDeg[i]==0){
                queue.add(i);
            }
        }
        while(!queue.isEmpty()){
            int val=queue.poll();
            System.out.print(val+" ");
            for(Integer i:list.get(val)){
                inDeg[i]--;
                if(inDeg[i]==0){
                    queue.add(i);
                }
            }
        }
    }
    
	public static void main(String[] args) {
		int n=6;
		int edges[][]={{0,2},{0,3},{5,2},{3,1},{4,2},{5,0},{4,1}};
		int inDeg[]=new int[n];
		for(int i=0;i<n;i++){
		    list.add(new HashSet<>());
		}
		for(int i=0;i<edges.length;i++){
		    inDeg[edges[i][1]]++;
		    list.get(edges[i][0]).add(edges[i][1]);
		}
		topoSort(n,inDeg);
	}
}
