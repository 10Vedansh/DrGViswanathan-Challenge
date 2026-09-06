class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int start = 0;
        int end = 0;
        int count = 0;
        
        while(low<=high){
            int mid = (low+high)/2;
            
            if(arr[mid]>=target){
                start = mid;
                high = mid-1;
                
            }
            else{
                low = mid+1;
            }}
            
        low = 0;
        high = n-1;
        
        while(low<=high){
            int mid = (low+high)/2;
            
            if(arr[mid]<=target){
                
                end = mid;
                low = mid+1;
                
            }
            else{
                high = mid-1;
            }
        
            
        }
        if(arr[start]!=target || arr[end]!=target){
            return 0;
        }
        count = end-start +1;
        return count;
    }
}
