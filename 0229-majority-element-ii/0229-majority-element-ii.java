class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> mpp = new HashMap<>();
        List<Integer> el = new ArrayList<>();
        int n = nums.length;
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            if(mpp.containsKey(nums[i])){
                count++;
            }
            mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry :mpp.entrySet()){
            if(entry.getValue()>n/3){
                el.add(entry.getKey());
            }
        } return el;
    }
}