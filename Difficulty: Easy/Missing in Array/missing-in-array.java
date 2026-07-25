class Solution {
    int missingNum(int arr[]) {
        // code here
        int n = arr.length +1 ;
        int expectedsum = 0;
        for(int i = 1;i<=n;i++){
            expectedsum = expectedsum + i;
    }
    int a = arr.length;
    int sum = 0;
    for(int i =0;i<n-1;i++){
        sum = sum + arr[i];
    }
    return expectedsum - sum;
}
}
