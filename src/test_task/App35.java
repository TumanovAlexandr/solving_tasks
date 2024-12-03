package test_task;

import java.util.ArrayList;
import java.util.List;

public class App35 {
    // rat in a maze
    public static void main(String[] args) {
        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {1, 1, 0, 0},
            {0, 1, 1, 1}
        };
        // write test cases
        List<String> paths = findPath(maze, 4);
        for (String path : paths) {
            System.out.println(path);
        }
    }

    public static List<String> findPath(int[][] m, int n) {
        boolean[][] visited = new boolean[n][n];
        List<String> res = new ArrayList<>();
        dfs(m, visited, res, n, 0, 0, "");
        return res;
    }

    private static void dfs(int[][] matrix, boolean[][] visited, List<String> res, int n, int r, int c, String currPath) {
        if (r < 0 || r >= n || c < 0 || c >= n || matrix[r][c] == 0 || visited[r][c]) return;
        if (r == n - 1 && c == n - 1) {
            res.add(currPath);
        }
        visited[r][c] = true;
        // down, up, right, left
        dfs(matrix, visited, res, n, r + 1, c, currPath + "D");
        dfs(matrix, visited, res, n, r - 1, c, currPath + "U");
        dfs(matrix, visited, res, n, r, c + 1, currPath + "R");
        dfs(matrix, visited, res, n, r, c - 1, currPath + "L");
        visited[r][c] = false;
    }
}
