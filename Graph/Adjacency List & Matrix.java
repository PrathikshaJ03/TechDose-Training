
import java.util.*;
class Main {
    public static void adjacencyList(int n,int edges[][]){
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            list.get(edges[i][0]).add(edges[i][1]);
            list.get(edges[i][1]).add(edges[i][0]);
        }
        System.out.println("Adjacency List");
        for(int i=0;i<n;i++){
            System.out.println(i+" "+list.get(i));
        }
    }
    
    public static void adjacencyMatrix(int n,int edges[][]){
        int matrix[][]=new int[n][n];
        for(int i=0;i<edges.length;i++){
            matrix[edges[i][0]][edges[i][1]]=1;
            matrix[edges[i][1]][edges[i][0]]=1;
        }
        System.out.println("Adjacency Matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int n=6;
        int edges[][]={{0,1},{1,3},{3,5},{5,4},{4,2},{2,0},{1,4},{2,3}};
        adjacencyList(n,edges);
        adjacencyMatrix(n,edges);
    }
}
