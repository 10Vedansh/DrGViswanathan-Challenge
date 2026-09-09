class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int ans = 0;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(low==high){
                ans = nums[low];
                break;
            }
            else if(nums[low] == nums[low+1]){
                low = low+2;
            }
            else{
                ans = nums[low];
                break;
            }
        }return ans;
    }
}