class Solution {
    public int nthRoot(int n, int m) {
        // code here
        int ans = -1;
        int low =1;
        int high = m;
        
        if(m==0){
            return 0;
        }
        while(low<=high){
            
            int mid = low + (high-low)/2;
            int power =1;
            
            for(int i = 1;i<=n;i++){
                power = power*mid;
            }
            if(power== m){
                ans = mid;
                break;
            }
            
            else if(power<m){
                low = mid+1;
            }
            
            else{
                high = mid-1;
            }
        } return ans;
    }
}