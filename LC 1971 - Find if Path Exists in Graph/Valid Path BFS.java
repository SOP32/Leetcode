class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int[] edge : edges) {
            int a = edge[0];
            int b = edge[1];
            graph.computeIfAbsent(a, val -> new ArrayList<>()).add(b);
            graph.computeIfAbsent(b, val -> new ArrayList<>()).add(a);
        }
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(source);
        boolean[] visited = new boolean[n];
        visited[source] = true;
        while (!queue.isEmpty()) {
            int key = queue.poll();
            if (key == destination) return true;
            for (int q : graph.get(key)) {
                if (!visited[q]) {
                    queue.offer(q);
                    visited[q] = true;
                }
            }
        }
        return false;
    }
}
