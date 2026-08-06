class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(arr);
        
        int k = arr.length-1;
        
        for(int i = 0;i<arr.length-1;i++){
            
            if(arr[i]==arr[i+1]){
                ans.add(arr[i]);
                break;
            }
        }
        
        if(arr[0]!=1){
            ans.add(1);
        }
        
        else if(arr[k]+1==arr.length){
            ans.add(arr.length);
        }
        
        else{
            
        while(k>0){
            int diff = arr[k] - arr[k-1];
            
            if(diff!= 1&& diff!=0){
                ans.add(arr[k]-1);
            }
            
            k--;
        }}return ans;
    }
}
