class Solution {
    public List<List<Integer>> generate(int numRows) {
        int n = numRows;
        List<List<Integer>> sol = new ArrayList<>();
        
        for(int i =0;i<n;i++){
            List<Integer> temp = new ArrayList<>();
            int ans =1;
            temp.add(ans);
            for(int j =1;j<=i;j++){
                ans = ans*(i-j+1);
                ans = ans/j;
                temp.add(ans);
            }
        sol.add(temp);
        }
        return sol;
    }
}