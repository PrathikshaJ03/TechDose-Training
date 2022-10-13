class Solution {
    public int latestTimeCatchTheBus(int[] buses, int[] passengers, int capacity) {
        HashSet<Integer> list=new HashSet<>();
        Arrays.sort(buses);
        Arrays.sort(passengers);
        for(int x:passengers){
            list.add(x);
        }
        int j=0,c,result=0;
        for(int i=0;i<buses.length;i++){
            c=capacity;
            while(j<passengers.length && c>0 && passengers[j]<=buses[i]){
                result=passengers[j];
                c--;
                j++;
            }
            if(c!=0){
                result=buses[i];
            }
        }
        while(list.contains(result)){
            result--;
        }
        return result;
    }
}
