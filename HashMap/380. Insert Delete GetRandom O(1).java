class RandomizedSet {
    
    List<Integer> list;
    Map<Integer,Integer> map;
    java.util.Random rand=new java.util.Random();
    
    public RandomizedSet() {
        list=new ArrayList<>();
        map=new HashMap<>();
    }
    
    public boolean insert(int val) {
        if(list.contains(val)){
            return false;
        }
        map.put(val,list.size());
        list.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(!list.contains(val)){
            return false;
        }
        int loc=map.get(val);
        int last=list.get(list.size()-1);
        if(loc<list.size()-1){
            list.set(loc,last);
            map.put(last,loc);
        }
        map.remove(val);
        list.remove(list.size()-1);
        return true;
    }
    
    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }
}
