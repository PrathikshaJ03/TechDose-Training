class Solution {
    public int reachableNodes(int n, int[][] edges, int[] restricted) {
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            list.get(edges[i][0]).add(edges[i][1]);
            list.get(edges[i][1]).add(edges[i][0]);
        }
        int count=0;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        Set<Integer> set=new HashSet<>();
        set.add(0);
        for(int i:restricted){
            set.add(i);
        }
        int p;
        while(!queue.isEmpty()){
            p=queue.size();
            while(p>0){
                count++;
                int N=queue.poll();
                for(int i:list.get(N)){
                    if(!set.contains(i)){
                        queue.add(i);
                        set.add(i);
                    }
                }
                p--;
            }
        }
        return count;
    }
}
