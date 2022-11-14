package Medium;

public class Number_of_Islands {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < grid.length; i++) {//row
            for (int j = 0; j < grid[0].length; j++) {// col
                if (grid[i][j] == '1') {// if it is an island (1)
                    count++;
                    bfs(grid, i, j);// mark all the connected 1s to 0
                }
            }
        }
        return count;
    }

    public void bfs(char[][] grid, int i, int j){
        if(i<0 || i>=grid.length || j<0 || j>=grid.length || grid[i][j] == '0') return;// if it is out of bound or it is not an island then return
        grid[i][j] = '0';// mark the island as 0 so that it is not counted again
        bfs(grid, i+1, j);// check the island on the right
        bfs(grid, i-1, j);// check the island on the left
        bfs(grid, i, j+1);// check the island on the top
        bfs(grid, i, j-1);// check the island on the bottom

    }


    public int numIslands2(char[][] grid) {
        if(grid.length ==0 || grid == null) return 0;

        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == '1'){
                    count++;
                    dfs(grid, i, j);
                }
            }
        }
        return count;
    }

    public void dfs(char[][] grid, int i, int j){
        if(i<0 || i>=grid.length || j <0 || j>= grid[i].length || grid[i][j] == '0') return;
        grid[i][j] = '0';
        dfs(grid, i+1, j);
        dfs(grid, i-1, j);
        dfs(grid, i, j+1);
        dfs(grid, i, j-1);

    }
}
