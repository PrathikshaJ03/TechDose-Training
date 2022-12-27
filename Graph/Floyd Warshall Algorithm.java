
public class Main{
    
    public static void floyds(int n,int graph[][]){
        int dist[][]=new int[n][n];
    
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dist[i][j]=graph[i][j];
            }
        }
    
        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(dist[i][k]==Integer.MAX_VALUE || dist[k][j]==Integer.MAX_VALUE){
                        continue;
                    }
                    else if(dist[i][j]>dist[i][k]+dist[k][j]){
                        dist[i][j]=dist[i][k]+dist[k][j];
                    }
                }
            }
        }
    
        for(int i=0;i<n;i++){
            if(dist[i][i]<0){
                System.out.print("Negative edge weight cycle");
                return;
            }
        }
    
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println(i+" , "+j+" -> "+dist[i][j]);
            }
        }
    }
    
	public static void main(String[] args) {
	    int n=4;
		int graph[][]={{0,3,Integer.MAX_VALUE,5},
		               {2,0,Integer.MAX_VALUE,8},
		               {Integer.MAX_VALUE,1,0,Integer.MAX_VALUE},
		               {Integer.MAX_VALUE,Integer.MAX_VALUE,2,0}};
		floyds(n,graph);
	}
}
