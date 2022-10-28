class Solution {
    public int maximalRectangle(char[][] matrix) {
        int dp[]=new int[matrix[0].length];
        int maxArea=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                dp[j]=(matrix[i][j]=='1')?dp[j]+1:0;
            }
            maxArea=Math.max(maxArea,findMaxArea(dp));
        }
        return maxArea;
    }
    // Largest Rectangle in Histogram
    public static int findMaxArea(int arr[]){
        int N=arr.length;
        int left[]=new int[N];
        int right[]=new int[N];
        Stack<Integer> stack=new Stack<>();
        stack.push(0);
        left[0]=0;
        for(int i=1;i<N;i++){
            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
                stack.pop();
            }
            left[i]=(stack.isEmpty())?0:stack.peek()+1;
            stack.push(i);
        }
        stack.clear();
        stack.push(N-1);
        right[N-1]=N-1;
        for(int i=N-2;i>=0;i--){
            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
                stack.pop();
            }
            right[i]=(stack.isEmpty())?N-1:stack.peek()-1;
            stack.push(i);
        }
        int max=0;
        for(int i=0;i<N;i++){
            max=Math.max(max,arr[i]*(right[i]-left[i]+1));
        }
        return max;
    }
}
