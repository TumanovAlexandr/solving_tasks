package test_task;

public class App36 {
    // m-coloring problem
    public static void main(String[] args) {
        boolean[][] graph = {
            {false, true, true, true},
            {true, false, true, false},
            {true, true, false, true},
            {true, false, true, false}
        };
        int m = 3;
        int n = 4;
        System.out.println(graphColoring(graph, m, n));
    }

    public static boolean graphColoring(boolean[][] graph, int m, int n) {
        int[] color = new int[n];
        return dfs(graph, color, m, 0);
    }

    private static boolean dfs(boolean[][] graph, int[] color, int m, int row) {
        if (row == graph.length) return true;
        for (int i = 1; i <= m; i++) {
            if (isSafe(graph, color, i, row)) {
                color[row] = i;
            }
            if (dfs(graph, color, i, row + 1)) return true;
            color[row] = 0;
        }
        return false;
    }

    private static boolean isSafe(boolean[][] graph, int[] color, int currColor, int currRow) {
        for (int c = 0; c < graph[0].length; c++) {
            if (graph[currRow][c] == true) {
                if (color[c] == currColor) return false;
            }
        }
        return true;
    }
}
