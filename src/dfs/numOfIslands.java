package dfs;

// 200
public class numOfIslands {

	private int m = 0, n = 0;

	public int numIslands(char[][] grid) {
		int count = 0;
//		n = grid.length;
//		m = grid[0].length; // if m put before if , run time exception occurs for the case '[]'
//
//		if (n == 0)
//			return 0;

		n = grid.length;

		if (n == 0)
			return 0;

		m = grid[0].length; // m should put here, after check grid is not empty(grid.length not equal to 0)

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (grid[i][j] == '1') {
					dfs(grid, i, j);
					count++;
				}
			}
		}

		return count;
	}

	private void dfs(char[][] grid, int i, int j) {
		// TODO Auto-generated method stub
		// if (i < 0 || j < 0 || i > n || j > m || grid[i][j] != '1') // false, notice
		// if i = n, than i++ would cause run time exception
		if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] != '1')
			return;
		grid[i][j] = '0'; // Already count this one, so change 1 to 0
		dfs(grid, i + 1, j);
		dfs(grid, i - 1, j);
		dfs(grid, i, j + 1);
		dfs(grid, i, j - 1);
	}
}
