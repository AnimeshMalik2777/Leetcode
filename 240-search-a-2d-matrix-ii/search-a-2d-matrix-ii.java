class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int cols = matrix[0].length;

         int r = 0;
         int c = cols-1;

         while(r<row && c>=0 ){
            if(matrix[r][c]==target)
            return true;
            if(matrix[r][c]>target) c--;
            else r++;
            
            
        
         }
            return false;
        
    }
}