class Solution {
    public int[][] kClosest(int[][] points, int k) {
        Map<Integer, Double> map = new HashMap<>();
        for (int i = 0; i < points.length; i++) {
            map.put(i, Math.sqrt(points[i][0] * points[i][0] + points[i][1] * points[i][1]));
        }
        Queue<Integer> pq = new PriorityQueue<>((a, b) -> Double.compare(map.get(b), map.get(a)));

        for (int index : map.keySet()) {
            pq.add(index);
            if (pq.size() > k) pq.poll();
        }
        int[][] result = new int[k][2];
        for (int i = k - 1; i >= 0; i--) {
            int index = pq.poll();
            result[i][0] = points[index][0];
            result[i][1] = points[index][1];
        }
        return result;
    }
}
