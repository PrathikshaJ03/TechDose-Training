class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        Map<String,List<String>> ing=new HashMap<>();
        Map<String,Integer> r=new HashMap<>();
        for(int i=0;i<ingredients.size();i++){
            r.put(recipes[i],ingredients.get(i).size());
            for(int j=0;j<ingredients.get(i).size();j++){
                ing.putIfAbsent(ingredients.get(i).get(j),new ArrayList<>());
                ing.get(ingredients.get(i).get(j)).add(recipes[i]);                
            }
        }
        Queue<String> queue=new LinkedList<>();
        List<String> list=new ArrayList<>();
        for(String s:supplies){
            queue.add(s);
        }
        while(!queue.isEmpty()){
            String s=queue.poll();
            if(ing.containsKey(s)){
                for(String rec:ing.get(s)){
                    int temp=r.get(rec)-1;
                    r.put(rec,temp);
                    if(temp==0){
                        list.add(rec);
                        queue.add(rec);
                    }
                }
            }
        }
        return list;
    }
}
