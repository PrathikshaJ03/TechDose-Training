class NumArray {
    
    int arr[];
    public NumArray(int[] nums) {
        this.arr=nums;
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i]+arr[i-1];
        }
    }
    
    public void update(int index, int val) {
        int n=(index==0)?arr[0]:(arr[index]-arr[index-1]);
        int diff=val-n;
        for(int i=index;i<arr.length;i++){
            arr[i]=arr[i]+diff;
        }
    }
    
    public int sumRange(int left, int right) {
        return (left==0)?arr[right]:arr[right]-arr[left-1];
    }
}
