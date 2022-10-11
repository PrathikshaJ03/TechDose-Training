class Solution {
    public int sumSubarrayMins(int[] arr) {
        int N=arr.length;
        int mod=(int)1e9+7;
        Deque<Integer> deque=new ArrayDeque<>();
        long result=0;
        int minInd,fromInd,subarrayNo;
        for(int i=0;i<=N;i++){
            while(!deque.isEmpty() && (i==N?0:arr[i])<arr[deque.getLast()]){
                minInd = deque.pollLast();
                fromInd = (deque.isEmpty() ? -1 : deque.getLast());
                subarrayNo = (minInd-fromInd) * (i-minInd);
                result = (result + (long)arr[minInd] * subarrayNo) % mod;
            }
            deque.offerLast(i);
        }
        return (int)(result%mod) ;       
    }
}
