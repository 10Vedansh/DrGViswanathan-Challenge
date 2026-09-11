class Solution {
    private long calcsum(int[]nums, int no){
        long sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += ((long) nums[i] + no - 1) / no;
        }
        return sum;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int max = nums[0];
        for(int i:nums){
            if(max<i){
                max = i;
            }
        }
        int low = 1;
        int high = max;
        int ans = 0;
        while(low<=high){
            int mid = (low+high)/2;

            if(calcsum(nums,mid)<=threshold){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        } return ans;
    }
}