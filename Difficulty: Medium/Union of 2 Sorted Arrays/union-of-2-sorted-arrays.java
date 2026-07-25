class Solution {
    
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        
        Set<Integer> c = new TreeSet<>();
        
        for(int num :a){
            c.add(num);
        }
        
        for(int num :b){
            c.add(num);
        }
        
        
        ArrayList<Integer> e = new ArrayList<>(c);
        return e;
    }
}