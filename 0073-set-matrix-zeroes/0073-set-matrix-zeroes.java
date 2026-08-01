class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int row[] = new int [m];
        int col[] = new int [n];
        for(int i=0;i<m;i++){ // gives the total number of rows
            for(int j = 0;j<n;j++){ // gives the no of columns in that rows
                if(matrix[i][j]==0){
                    row[i] = 1;
                    col[j] =1;
                }
                }
            }
        for(int i=0;i<m;i++){ // gives the total number of rows
            for(int j = 0;j<n;j++){ // gives the no of columns in that rows
                if(row[i] ==1  || col[j]== 1){
                    matrix[i][j] = 0;
                }
                }
            }
        }
    }
