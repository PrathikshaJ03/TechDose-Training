class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> result=new ArrayList<>();
        Map<Integer,Integer> winner=new HashMap<>();
        Map<Integer,Integer> loser=new HashMap<>();
        for(int i=0;i<matches.length;i++){
            winner.put(matches[i][0],loser.getOrDefault(matches[i][0],0)+1);
            loser.put(matches[i][1],loser.getOrDefault(matches[i][1],0)+1);
        }
        List<Integer> l=new ArrayList<>();
        for(Integer i:loser.keySet()){
            if(winner.containsKey(i)){
                winner.remove(i);
            }
            if(loser.get(i)==1){
                l.add(i);
            }
        }
        List<Integer> w=new ArrayList<>();
        for(Integer i:winner.keySet()){
            w.add(i);
        }
        Collections.sort(l);
        Collections.sort(w);
        result.add(w);
        result.add(l);
        return result;
    }
}
