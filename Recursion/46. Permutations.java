class Solution {
    List<List<Integer>> list=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            l.add(nums[i]);
        }
        permutation(l,new ArrayList<Integer>());
        return list;
    }
    public void permutation(List<Integer> nums,List<Integer> l){
        if(nums.size()==0){
            list.add(new ArrayList<>(l));
            return ;
        }
        
        for(int i=0;i<nums.size();i++){
            int n=nums.get(i);
            List<Integer> temp=new ArrayList<>();
            temp.addAll(nums);
            temp.remove(i);
            l.add(n);
            permutation(temp,l);
            l.remove(l.size()-1);
        }
    }
}
