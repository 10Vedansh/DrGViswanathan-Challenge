class Solution {
    public int findKRotation(int arr[]){
        // Code here
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int ans = Integer.MAX_VALUE;
        while(low<=high){
            
            int mid = (low+high)/2;
            
            if(arr[low]<=arr[high]){
                    ans = Math.min(ans,low);
                    break;
            }

            if(arr[low]>arr[mid]){
                    high = mid;
                    ans = Math.min(ans,mid);
            }
            
            else{
                    low = mid+1;
                    
            }
            
            } return ans;
        }
    }
