class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int start = -1;
        int end = -1;

        while(low<=high){
            int mid = (low+high)/2;
            
            if(nums[mid]>=target){
                high = mid-1;
                start = mid; 
            }
            else{
                low = mid+1;
            }
        }
        if (start == -1 || nums[start] != target){
            return new int[]{-1, -1};
        }

        low = 0;
        high = n-1;
        
        while(low<=high){
            
            int mid = (low+high)/2;
            
            if(nums[mid]<=target){
                low = mid+1;
                end = mid;
            }
            else{
                high = mid-1;
            }
        
        }
        return new int[]{start,end};
        } 
    }
