class Solution {
    public void rotate(int[][] matrix) {
        int[][] newmatrix=new int[matrix.length][matrix[0].length];
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                newmatrix[j][n-1-i]=matrix[i][j];
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=newmatrix[i][j];
            }
        }
    }
}
