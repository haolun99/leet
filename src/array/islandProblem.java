package array;
// 463
public class islandProblem {
	public int islandPerimeterSol(int[][] grid) {
		int num = 0; // number of islands
		int neighbors = 0; // number of neighbors
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				// for(int j = 0; j < grid[0].length; j++) { Wrong
				if (grid[i][j] == 1) {
					num++;

					if (i < grid.length - 1 && grid[i + 1][j] == 1)
						neighbors++;
					if (j < grid[i].length - 1 && grid[i][j + 1] == 1)
						neighbors++;
				}
			}
		}

		return 4 * num - 2 * neighbors;
	}

	// Wrong
	// incorrect place of '}'
	public int islandPerimeter(int[][] grid) {
		int num = 0; // number of islands
		int neighbors = 0; // number of neighbors
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				// for(int j = 0; j < grid[0].length; j++) { Wrong
				if (grid[i][j] == 1) {
					num++;
				} // Mark: incorrect place
				if (i < grid.length - 1 && grid[i + 1][j] == 1)
					neighbors++;
				if (j < grid[i].length - 1 && grid[i][j + 1] == 1)
					neighbors++;
				// if(j < grid[0].length - 1 && grid[i][j + 1] == 1) neighbors++; Wrong
				// '}' should put here
			}
		}

		return 4 * num - 2 * neighbors;
	}
}
