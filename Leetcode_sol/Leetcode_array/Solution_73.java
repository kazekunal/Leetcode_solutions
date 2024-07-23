package Leetcode_sol.Leetcode_array;

public class Solution_73 {
        public static void setZeroes(int[][] matrix) {
          final int m = matrix.length;
          final int n = matrix[0].length;
          boolean F_Row = false;
          boolean F_col = false;
      
          for (int j = 0; j < n; ++j)
            if (matrix[0][j] == 0) {
              F_Row = true;
              break;
            }
      
          for (int i = 0; i < m; ++i)
            if (matrix[i][0] == 0) {
              F_col = true;
              break;
            }
      
          // Store the information in the first row and the first column.
          for (int i = 1; i < m; ++i)
            for (int j = 1; j < n; ++j)
              if (matrix[i][j] == 0) {
                matrix[i][0] = 0;
                matrix[0][j] = 0;
              }
      
          // Fill 0s for the matrix except the first row and the first column.
          for (int i = 1; i < m; ++i)
            for (int j = 1; j < n; ++j)
              if (matrix[i][0] == 0 || matrix[0][j] == 0)
                matrix[i][j] = 0;
      
          // Fill 0s for the first row if needed.
          if (F_Row)
            for (int j = 0; j < n; ++j)
              matrix[0][j] = 0;
      
          // Fill 0s for the first column if needed.
          if (F_col)
            for (int i = 0; i < m; ++i)
              matrix[i][0] = 0;

        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        }
        public static void main(String[] args) {
            int[][] my_matrix = {{1,0,5},{2,7,0},{4,5,5}};
            setZeroes(my_matrix);
        }
      }
