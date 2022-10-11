class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int maxIndex,k=0;
        for(int i=0;i<heights.length-1;i++){
            maxIndex=i;
            for(int j=i+1;j<heights.length;j++){
                if(heights[j]>=heights[maxIndex]){
                    maxIndex=j;
                }
            }
            String s=names[i];
            names[i]=names[maxIndex];
            names[maxIndex]=s;
            int temp=heights[i];
            heights[i]=heights[maxIndex];
            heights[maxIndex]=temp;
        }
        return names;
    }
}
