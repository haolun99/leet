package dynamic;
// 64
public class minimumPathSum {
	public int minPathSum(int[][] grid) {
		int m = grid.length, n = grid[0].length;

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 && j == 0)
					continue;
				//else if (i == 0) {
					if(i == 0) {
					grid[i][j] += grid[i][j - 1];
				} else if (j == 0) {
					grid[i][j] += grid[i - 1][j];
				} else {
					// grid[i][j] += grid[i - 1][j - 1]; // Wrong
					grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
				}
			}
		}

		return grid[m - 1][n - 1];
		
	}
	
}
