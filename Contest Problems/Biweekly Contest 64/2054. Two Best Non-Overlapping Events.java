class Solution {
    public int maxTwoEvents(int[][] events) {
        Arrays.sort(events,(a,b)->(a[0]==b[0])?a[1]-b[1]:a[0]-b[0]);
        PriorityQueue<int[]> queue=new PriorityQueue<>((a,b)->a[0]-b[0]);
        int maxVal=0,res=0;
        for(int[] e:events){
            int start=e[0];
            while(!queue.isEmpty()){
                if(queue.peek()[0]>=start){
                    break;
                }
                int temp[]=queue.remove();
                maxVal=Math.max(maxVal,temp[1]);
            }
            res=Math.max(res,e[2]+maxVal);
            queue.add(new int[]{e[1],e[2]});
        }
        return res;
    }
}
