class Solution {
    public int maximumGroups(int[] grades) {
        int N=grades.length;
        return (int)((Math.sqrt(1+8*N)-1)/2);
    }
}
