// class Solution {
//     public int findKthLargest(int[] nums, int k) {
//         Arrays.sort(nums);
//         return nums[nums.length-k];
//     }
    
// }

class Solution {
    public int findKthLargest(int[] nums, int k) {
        quickSelect(nums,0,nums.length-1,k);
        return nums[k-1];
    }
    
    public static void quickSelect(int arr[],int low,int high,int K){
        if(low<high){
            int partitionIndex=partition(arr,low,high);
            if(partitionIndex+1==K){
                return;
            }
            else if(partitionIndex>=K){
                quickSelect(arr,low,partitionIndex-1,K);
            }
            else{
                quickSelect(arr,partitionIndex+1,high,K);
            }
        }
    }
    
    public static int partition(int arr[],int low,int high){
        int i=low-1;
        int pivot=arr[high];
        for(int j=low;j<high;j++){
            if(arr[j]>pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return i+1;
    }
    
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
}
