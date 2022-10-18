class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack=new Stack<>();
        int res[]=new int[nums1.length];
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            while(!stack.isEmpty() && nums2[i]>stack.peek()){
                map.put(stack.pop(),nums2[i]);
            }
            stack.push(nums2[i]);
        }
        int index=0;
        for(int i=0;i<nums1.length;i++){
            res[index++]=map.getOrDefault(nums1[i],-1);
        }
        return res;
    }
}
