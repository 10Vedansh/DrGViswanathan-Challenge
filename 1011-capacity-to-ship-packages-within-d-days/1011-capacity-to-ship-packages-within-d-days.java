class Solution {
    private int calcdays(int[] weights , int c){
        int current = 0;
        int daysUsed = 1;
        for(int i=0;i<weights.length;i++){
            if(current + weights[i]<=c){
                current = current + weights[i];
            }
            else{
                daysUsed++;
                current = weights[i];
            }
        }return daysUsed;
    }

    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int max = weights[0];
        int sum = 0;
        for(int i:weights){
            sum+=i;
            if(i>max){
                max = i;
            }
        }

        int low = max;
        int high = sum;
        while(low<=high){
            int mid = (low+high)/2;
            if(calcdays(weights,mid)<=days){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        } return low;
    }
}