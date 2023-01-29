import java.util.*;
public class Main{
	public static void main(String[] args) {
		int row=3,col=3;
		int matrix[][]={{2,4,7},{1,3,8},{3,6,7}};
		int res=median(matrix,3,3);
		System.out.print(res);
	}
	public static int median(int matrix[][],int row,int col){
	    int min=Integer.MAX_VALUE;
	    int max=Integer.MIN_VALUE;
	    for(int i=0;i<row;i++){
	        if(matrix[i][0]<min){
	            min=matrix[i][0];
	        }
	        if(matrix[i][col-1]>max){
	            max=matrix[i][col-1];
	        }
	    }
	    int desired=(row+col+1)/2;
	    while(min<max){
	        int mid=min+(max-min)/2;
	        int place=0;
	        int get=0;
	        for(int i=0;i<row;i++){
	            get=Arrays.binarySearch(matrix[i],mid);
	            if(get<0){
	                get=Math.abs(get)-1;
	            }
	            else{
	                while(get<matrix[i].length && matrix[i][get]==mid){
	                    get++;
	                }
	            }
	            place+=get;
	        }
	        if(place<desired){
	            min=mid+1;
	        }
	        else{
	            max=mid;
	        }
	    }
	    return min;
	}
}
