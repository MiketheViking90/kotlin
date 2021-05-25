package algo

class NumberOfIslands {
    fun numIslands(grid: Array<CharArray>): Int {
        val r = grid.size
        val c = grid[0].size

        var count = 0;
        for (i in 0 until r) {
            for (j in 0 until c) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j)
                    count++
                }
            }
        }
        return count
    }

    private fun dfs(grid: Array<CharArray>, i: Int, j: Int) {
        val r = grid.size
        val c = grid[0].size

        if (i < 0 || i >= r || j < 0 || j >= c) {
            return
        }
        if (grid[i][j] != '1') {
            return
        }

        grid[i][j] = '2'
        dfs(grid, i+1, j)
        dfs(grid, i-1, j)
        dfs(grid, i, j+1)
        dfs(grid, i, j-1)
    }
}