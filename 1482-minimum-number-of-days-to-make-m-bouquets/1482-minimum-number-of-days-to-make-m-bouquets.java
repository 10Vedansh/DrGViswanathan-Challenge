class Solution {

    private boolean canMake(int[] bloomDay, int m, int k,int day){
        int count = 0;
        int bouquets = 0;
        for(int bloom:bloomDay){
            if(bloom<=day){
                count++;
            
                if(count==k){
                    count = 0;
                    bouquets ++;
                }}
            else{
                    count = 0;
            }
        }
         return bouquets>=m;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        int min = bloomDay[0];
        int max  = bloomDay[0];

        for(int i =0;i<n;i++){
            if(bloomDay[i]<min){
                min = bloomDay[i];
            }
            if(bloomDay[i]>max){
                 max = bloomDay[i] ;
            }
        }
        int low = min;
        int high = max;
        int ans = -1;
        if(n<m*k){
            return -1;
        }
        while(low<=high){
            int mid = low +(high-low)/2;

            if(canMake(bloomDay,m,k,mid)){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        } return ans;
    }
}