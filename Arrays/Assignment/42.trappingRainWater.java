class Solution {
    public int trap(int[] height) {
        int N=height.length;
        if(N<=2){
            return 0;
        }
        int maxLeft[]=new int[N];
        int maxRight[]=new int[N];
        int max=height[0];
        maxLeft[0]=0;
        for(int i=1;i<N;i++){
            maxLeft[i]=max;
            if(height[i]>max){
                max=height[i];
            }
            
        }
        max=height[N-1];
        maxRight[N-1]=0;
        for(int i=N-2;i>=0;i--){
            maxRight[i]=max;
            if(height[i]>max){
                max=height[i];
            }
            
        }
        int result=0;
        for(int i=1;i<N-1;i++){
            if(height[i]<maxLeft[i] && height[i]<maxRight[i])
            result+=(Math.min(maxRight[i],maxLeft[i])-height[i]);
        }
        return result;
    }
}
