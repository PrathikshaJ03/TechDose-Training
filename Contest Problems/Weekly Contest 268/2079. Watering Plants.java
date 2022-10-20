class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int res=0,c=capacity,steps=-1;
        for(int i=0;i<plants.length;i++){
            c=c-plants[i];
            if(steps==-1){
                res+=i-steps;
                steps=i;
            }
            else{
                res+=1;
                steps++;
            }
            if(i+1!=plants.length && c<plants[i+1]){
                res+=i+1;
                steps=-1;
                c=capacity;
            }
        }
        return res;
    }
}
