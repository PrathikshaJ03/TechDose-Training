class Solution {
    public int largestRectangleArea(int[] heights) {
        int N=heights.length;
        int left[]=new int[N];
        int right[]=new int[N];
        Stack<Integer> stack=new Stack<>();
        left[0]=0;
        stack.push(0);
        for(int i=1;i<N;i++){
            while(!stack.isEmpty() && heights[stack.peek()]>=heights[i]){
                stack.pop();
            }
            left[i]=(stack.isEmpty())?0:stack.peek()+1;
            stack.push(i);
        }
        stack.clear();
        right[N-1]=N-1;
        stack.push(N-1);
        for(int i=N-2;i>=0;i--){
            while(!stack.isEmpty() && heights[stack.peek()]>heights[i]){
                stack.pop();
            }
            right[i]=stack.isEmpty()?N-1:stack.peek()-1;
            stack.push(i);
        }
        int maxArea=0;
        for(int i=0;i<N;i++){
            maxArea=Math.max(maxArea,heights[i]*(right[i]-left[i]+1));
        }
        return maxArea;
    }
}
