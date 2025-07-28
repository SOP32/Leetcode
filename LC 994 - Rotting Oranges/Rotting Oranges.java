class Solution {
    public int orangesRotting(int[][] grid) {
        int freshOranges = 0;
        int time = -1;
        Queue<Pair<Integer, Integer>> queue = new LinkedList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) freshOranges++;
                else if (grid[i][j] == 2) queue.offer(new Pair<>(i,j));
            }    
        }
        queue.offer(new Pair(-1, -1));
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        Pair<Integer, Integer> pair;
        while(!queue.isEmpty()) {
            pair = queue.poll();
            int key = pair.getKey();
            int value = pair.getValue();
            if (key == -1) {
                time++;
                if (!queue.isEmpty()) {
                    queue.offer(new Pair<>(-1, -1));
                }
            } else {
                for (int[] direction : directions) {
                    int n1 = key + direction[0];
                    int n2 = value + direction[1];
                    if (n1 >= 0 && n2 >= 0 && n1 < grid.length && n2 < grid[0].length) {
                        if (grid[n1][n2] == 1) {
                            queue.offer(new Pair<>(n1, n2));
                            freshOranges--;
                            grid[n1][n2] = 2;
                        }    
                    }
                }
            }
        }
        return freshOranges == 0 ? time : -1;
    }
}
