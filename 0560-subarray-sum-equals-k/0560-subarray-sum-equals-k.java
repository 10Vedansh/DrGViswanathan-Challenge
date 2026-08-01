class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer , Integer> mpp = new HashMap<>();
        int prefix = 0;
        int count = 0;
        mpp.put(0,1);
            for(int i = 0;i<nums.length;i++){
                prefix +=nums[i];
                int remove = prefix - k;
                if(mpp.containsKey(remove)){
                    count+=mpp.get(remove);
                }
                    mpp.put(prefix ,mpp.getOrDefault(prefix,0)+1);
        } return count;
    }
}