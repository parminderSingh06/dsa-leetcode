public class Search2dMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low = 0, high = matrix.length-1;
        int mid = 0;
        int ansRow = -1;

        while(ansRow == -1 && low <= high){
            mid = low + (high-low) / 2;
            int rowLength = matrix[mid].length;
            if(matrix[mid][0] > target && matrix[mid][rowLength] > target){
                high = mid -1;
            }
            else if(matrix[mid][0] < target && matrix[mid][rowLength] < target){
                low = mid + 1;
            }
            else{
                ansRow = mid;
            }
        }

        if(ansRow == -1) return false;
        
        low = 0;
        high = matrix[ansRow].length;
        while(low <= high){
            mid = low + (high-low) / 2;
            if(matrix[ansRow][mid] > target){
                high = mid - 1;
            }
            else if(matrix[ansRow][mid] < target){
                low = mid + 1;
            }
            else if(matrix[ansRow][mid] == target){
                return true;
            }
        }

        return false;
    }
}
