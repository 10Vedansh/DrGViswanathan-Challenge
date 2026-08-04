class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length-1;
       Arrays.sort(nums);
       for(int i = n;i>0;i--){
            int diff = nums[i]-nums[i-1];
            if(nums[i]-nums[i-1]!=1){
                int k =diff-1;
                while(k>=1){
                ans.add(nums[i]-k);
                k--;
            }}
            
       } Collections.sort(ans);
        return ans;
    }
}