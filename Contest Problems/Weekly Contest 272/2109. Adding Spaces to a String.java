class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder str=new StringBuilder();
        int index=0;
        for(int i:spaces){
            str.append(s.substring(index,i));
            str.append(" ");
            index=i;
        }
        str.append(s.substring(spaces[spaces.length-1]));
        return str.toString();
    }
}
