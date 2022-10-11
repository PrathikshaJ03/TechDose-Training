class Solution {
    public static final int month[]={31,28,31,30,31,30,31,31,30,31,30,31};
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int aa=convertToDays(arriveAlice);
        int la=convertToDays(leaveAlice);
        int ab=convertToDays(arriveBob);
        int lb=convertToDays(leaveBob);
        int high=Math.min(la,lb);
        int low=Math.max(aa,ab);
        return Math.max(0,high-low+1);
    }
    public static int convertToDays(String s){
        int days=Integer.parseInt(s.substring(3));
        for(int i=0;i<Integer.parseInt(s.substring(0,2))-1;i++){
            days+=month[i];
        }
        return days;
    }
}
