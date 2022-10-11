class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> list =new ArrayList<>();
        Arrays.sort(items1,(a,b)->(a[0]-b[0]));
        Arrays.sort(items2,(a,b)->(a[0]-b[0]));
        int i=0,j=0;
        while(i<items1.length && j<items2.length){
            List<Integer> l=new ArrayList<>();
            if(items1[i][0]==items2[j][0]){
                l.add(items1[i][0]);
                l.add(items1[i][1]+items2[j][1]);
                list.add(l);
                i++;
                j++;
            }
            else if(items1[i][0]<items2[j][0]){
                l.add(items1[i][0]);
                l.add(items1[i][1]);
                list.add(l);
                i++;
            }
            else{
                l.add(items2[j][0]);
                l.add(items2[j][1]);
                list.add(l);
                j++;
            }
        }
        while(i<items1.length){
            List<Integer> l=new ArrayList<>();
            l.add(items1[i][0]);
            l.add(items1[i][1]);
            list.add(l);
            i++;
        }
        while(j<items2.length){
            List<Integer> l=new ArrayList<>();
            l.add(items2[j][0]);
            l.add(items2[j][1]);
            list.add(l);
            j++;
        }
        return list;
    }
}
