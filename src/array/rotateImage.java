package array;
//
public class rotateImage {
public void rotate(int[][] matrix) {
	// 先换行，再转置
     if(matrix.length <= 1) return;
     
     int n = matrix.length;
     
     // 换行 (matirx[i] and matrix[n - 1 - i])
     for(int i = 0; i < n / 2; i++) {
    	 int[] temp = matrix[i];
    	 matrix[i] = matrix[n - i - 1];
    	 matrix[n - i - 1] = temp;
     }
     
     // 转置(matrix[i][j] and matrix[j][i])
     for(int i = 0; i < n; i++) {
    	for(int j = i; j < n; j++) {
    	 // for(int j = i; j < matrix[0].length; j++) { This is a n * n 2d array
    		int temp = matrix[i][j];
    		// int[] temp = matrix[i][j];
    		 matrix[i][j] = matrix[j][i];
    		 matrix[j][i] = temp;
    	 }
     }
    }
}
