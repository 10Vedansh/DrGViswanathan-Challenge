class Solution {
    int maxLength(int nums[]) {
        // code here
        Map<Integer,Integer> mpp = new HashMap<>();
        
        int prefixsum=0;
        int maxlen = 0;
        
        
        for(int i=0;i<nums.length;i++){
            
            prefixsum+=nums[i];
            
            if(prefixsum==0){
                maxlen = i+1;
                
            }
            
            if(mpp.containsKey(prefixsum)){
                maxlen = Math.max(maxlen,i-mpp.get(prefixsum));
            }
            
            else{mpp.put(prefixsum,i);}
        } return maxlen;
                
    }
        
}
    
