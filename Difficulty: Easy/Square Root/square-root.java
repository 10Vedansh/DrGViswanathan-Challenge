class Solution {
    int floorSqrt(int n) {
        // code here
        int ans = 0;
        for(int i = 0;i<=n;i++){
            int square = i*i;
            
            if(square<=n){
                ans = i;
            }
            else{
                break;
            }
        } return ans;
    }
}