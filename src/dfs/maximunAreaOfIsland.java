package dfs;
// 695
public class maximunAreaOfIsland {
	public int maxAreaOfIsland(int[][] grid) {
        	// Base case
			if(grid == null || grid.length == 0) {
				return 0;
			}
			
			int max = 0;
			int m = grid.length; // Otherwise helper method will not work, could not find grid
			int n = grid[0].length;
			for(int  i = 0; i < m; i++) {
				for(int j = 0; j < n; j++) {
					if(grid[i][j] == 1) {
						int area = dfs(grid, i, j, m, n, 0);
						max = Math.max(max, area);
					}
				}
			}
			return max;
			
    }
	
	public int dfs(int[][] grid, int i, int j, int m, int n, int area) {
		if(i < 0 || i >=m || j < 0 || j >=n || grid[i][j] == 0) {
			return area;
		}
		
		grid[i][j] = 0;
		area++;
		
		area = dfs(grid, i - 1, j, m, n, area);
		area = dfs(grid, i + 1, j, m, n, area);
		area = dfs(grid, i, j + 1, m, n, area);
		area = dfs(grid, i , j - 1, m, n, area);
	
		return area;
	}

}
