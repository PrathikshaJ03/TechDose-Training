public class Main{
    static int seg[];
    
    public static void build(int index,int start,int end,int arr[]){
	    if(start>end){
	        return;
	    }
	    if(start==end){
	        seg[index]=arr[start];
	        return;
	    }
	    int mid=start+(end-start)/2;
	    build(2*index,start,mid,arr);
	    build(2*index+1,mid+1,end,arr);
	    seg[index]=seg[2*index]+seg[2*index+1];
	}
	public static int query(int qs,int qe,int index,int start,int end){
	    if(qs>end || qe<start){
	        return 0;
	    }
	    if(start>=qs && end<=qe){
	        return seg[index];
	    }
	    int mid=start+(end-start)/2;
	    int left=query(qs,qe,2*index,start,mid);
	    int right=query(qs,qe,2*index+1,mid+1,end);
	    return left+right;
	}
	public static void update(int index,int start,int end,int pos,int val){
	    if(start>pos || end<pos){
	        return;
	    }
	    if(start==end){
	        seg[index]=val;
	        return;
	    }
	    int mid=start+(end-start)/2;
	    update(2*index,start,mid,pos,val);
	    update(2*index+1,mid+1,end,pos,val);
	    seg[index]=seg[2*index]+seg[2*index+1];
	}
	public static void main(String[] args) {
		int N=6;
		int arr[]={2,5,8,1,3,4};
		seg=new int[4*N+1];
		build(1,0,N-1,arr);
		
		System.out.println("Range(2,5)"+query(2,5,1,0,N-1));
		System.out.println("Range(0,5)"+query(0,5,1,0,N-1));
		
		//Update 
		arr[4]=6;
		update(1,0,N-1,4,6);
		
		System.out.println("Range(0,5)"+query(0,5,1,0,N-1));
	}
	
}
