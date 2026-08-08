class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> el  = new ArrayList<>();
        long ans = 1;
        el.add((int)ans);
        for(int i =1;i<=rowIndex;i++){
            ans = ans*(rowIndex-i+1);
            ans = ans/i;
            el.add((int)ans);
        } return el;
    }
}