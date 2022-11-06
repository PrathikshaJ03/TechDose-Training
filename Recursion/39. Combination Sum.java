class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        solve(candidates,target,0,new ArrayList<>());
        return res;
    }
    public void solve(int arr[],int target,int index,List<Integer> l){
        if(index==arr.length || target<0){
            return;
        }
        if(target==0){
            res.add(new ArrayList(l));
            return;
        } 
        solve(arr,target,index+1,l);
        l.add(arr[index]);
        solve(arr,target-arr[index],index,l);
        l.remove(l.size()-1);
    }
}
