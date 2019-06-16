package matrix;
// 240 && 74
public class searchTwo {

	/*
	 *     col
	 * row [1,   4,  7, 11, 15],
           [2,   5,  8, 12, 19],
           [3,   6,  9, 16, 22],
           [10, 13, 14, 17, 24],
           [18, 21, 23, 26, 30]
	 */
	
	public boolean searchMatrix(int[][] matrix, int target) {
		// Base case for matrix
		if(matrix == null || matrix.length < 1 || matrix[0].length < 1) {
			return false;
		}
		
		int row = 0;
		int col = matrix[0].length - 1;
		
		// Notice row ---> matrix.length
		//        column ---> matrix[0].length
		//while(col >= 0 && row <= matrix[0].length - 1) {
		
		while(col >= 0 && row <= matrix.length - 1) {
			   if(target == matrix[row][col]) {
				return true;
			}
			   else if(target > matrix[row][col]) {
				row++;
			}
			   else if(target < matrix[row][col]) {
				col--;
			}
		}
		return false;
	}
}
