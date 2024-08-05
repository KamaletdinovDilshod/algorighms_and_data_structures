package leetcode.medium;



public class SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        setZeroes(matrix);
    }

    public static void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        boolean row=false,col=false;
        for (int[] ints : matrix) {
            if (ints[0] == 0) {
                col = true;
            }
        }
        for(int j=0;j<m;j++){
            if(matrix[0][j]==0){
                row=true;
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        for(int i=1;i<n;i++){
            if(matrix[i][0]==0){
                for(int j=0;j<m;j++){
                    matrix[i][j]=0;
                }
            }
        }
        for(int j=1;j<m;j++){
            if(matrix[0][j]==0){
                for(int i=0;i<n;i++){
                    matrix[i][j]=0;
                }
            }
        }
        if(row){
            for(int j=0;j<m;j++){
                matrix[0][j]=0;
            }
        }
        if(col){
            for(int i=0;i<n;i++){
                matrix[i][0]=0;
            }
        }
        }
}
