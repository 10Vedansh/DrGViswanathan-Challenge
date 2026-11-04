class Solution {
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int largest = 0;
        int sum = 0;

        for(int i=0;i<=n-1;i++){
            if(nums[i]>largest){
                largest = nums[i];
            }
        }
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        int low = largest;
        int high = sum;
        while(low<=high){
            int mid = low + (high-low)/2;

            int count = 1;
            int currentsum = 0;

            for(int i=0;i<n;i++){
                currentsum+=nums[i];
                if(currentsum>mid){
                    count++;
                    currentsum = nums[i];
                }
            }
            if(count>k){
                low = mid+1;
            }
            else{
               high=mid-1;
            }
        } return low;
    }
}