class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int temp=initialEnergy,hours=0,val;
        for(int i=0;i<energy.length;i++){
            temp=temp-energy[i];

        }
        if(temp<=0)
        hours=(-1)*temp+1;
        temp=initialExperience;
        for(int i=0;i<experience.length;i++){
            if(temp<=experience[i]){
                hours+=(experience[i]-temp)+1;
                val=(experience[i]-temp)+1;
                temp=temp+experience[i]+val;

            }
            else{
                temp=temp+experience[i];

            }
            
        }
        return hours;
    }
}
