class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int count = 0;
        int maxcnt = 0;
        for(int i=0; i<n;i++){
            if(nums[i]==1){
                count ++;
                // if(maxcnt<count){
                //     maxcnt=count;
                // }
            }
            else{
                count=0;
            }
            maxcnt=Math.max(maxcnt,count);
        }
        return maxcnt;
    }
}