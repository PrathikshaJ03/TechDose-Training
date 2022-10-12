class LUPrefix {
    int N;
    TreeSet<Integer> set=new TreeSet<>();
    public LUPrefix(int n) {
        this.N=n;
        for(int i=1;i<=N;i++){
            set.add(i);
        }
    }
    
    public void upload(int video) {
        set.remove(video);
    }
    
    public int longest() {
        return (set.isEmpty())?N:set.first()-1;
    }
}
