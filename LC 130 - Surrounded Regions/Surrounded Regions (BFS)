import java.util.*;

class Solution {
    public void solve(char[][] board) {
        int rows = board.length;
        int cols = board[0].length;
        if (rows == 0 || cols == 0) return;

        // Step 1: Use BFS to mark all border-connected 'O's as 'S'
        for (int i = 0; i < rows; i++) {
            bfs(board, i, 0);
            bfs(board, i, cols - 1);
        }
        for (int j = 0; j < cols; j++) {
            bfs(board, 0, j);
            bfs(board, rows - 1, j);
        }

        // Step 2: Flip all 'O' → 'X' and 'S' → 'O'
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 'O') board[i][j] = 'X';
                else if (board[i][j] == 'S') board[i][j] = 'O';
            }
        }
    }

    private void bfs(char[][] board, int i, int j) {
        int rows = board.length;
        int cols = board[0].length;

        if (board[i][j] != 'O') return;

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] { i, j });
        board[i][j] = 'S'; // mark as safe

        int[][] directions = { {0, 1}, {1, 0}, {0, -1}, {-1, 0} };

        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int r = cell[0], c = cell[1];

            for (int[] dir : directions) {
                int newR = r + dir[0];
                int newC = c + dir[1];
                if (newR >= 0 && newR < rows && newC >= 0 && newC < cols && board[newR][newC] == 'O') {
                    queue.offer(new int[] { newR, newC });
                    board[newR][newC] = 'S'; // mark as safe
                }
            }
        }
    }
}
