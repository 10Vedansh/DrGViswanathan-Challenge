class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> ld = new ArrayList<>();
        
        int maxright = arr[arr.length-1];
        
        
        
        for(int i = arr.length-1;i>=0;i--){
            
            if(maxright<=arr[i]){
                maxright = arr[i];
                ld.add(arr[i]);
            }
        }Collections.reverse(ld); 
        return ld;
    }
}
