class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
        Map<Integer,Integer> mpp = new HashMap<>();
        int xor = 0;
        int count = 0;
        mpp.put(0, 1);
        for(int i = 0;i<arr.length;i++){
            
            xor^=arr[i];
            int need = xor^k;
            if(mpp.containsKey(need)){
                count+=mpp.get(need);
            }
            
            mpp.put(xor,mpp.getOrDefault(xor,0)+1);
        } return count;
        
    }
}