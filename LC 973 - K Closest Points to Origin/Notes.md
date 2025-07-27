## 🧭 K Closest Points to Origin – Max-Heap Approach

This solution finds the `k` closest points to the origin `(0,0)` from a list of 2D points using a **max-heap (priority queue)**.

---

### ✅ Key Steps:

#### 1. Compute Distance
- Use the formula `x² + y²` to compute the Euclidean distance from each point to the origin.
- Store distances in a `Map<Integer, Double>` where:
  - **Key**: Index of the point in the `points` array
  - **Value**: Distance from the origin

#### 2. Use Max-Heap (`PriorityQueue`)
- Create a max-heap that stores point indices sorted by **distance** (farthest first).
- For each point:
  - Add its index to the heap.
  - If the heap size exceeds `k`, remove the farthest point to keep only the `k` closest.

#### 3. Build Result
- Extract indices from the heap and use them to fetch the actual `k` closest points from the original `points` array.

---

### 🧠 Why Max-Heap?

- We maintain a **max-heap of size `k`**, so the **top of the heap is always the farthest** among the current `k` closest points.
- When a new, closer point is found:
  - Remove the farthest from the heap
  - Add the new one
  - This keeps only the best `k` points at all times.

---

### 🧮 Time Complexity
- **O(n log k)**  
  - Each of the `n` points is added/removed in the heap with `O(log k)` operations.

### 📦 Space Complexity
- **O(n)** total:
  - `O(n)` for distance map
  - `O(k)` for heap
  - `O(k)` for result array  
  - Dominated by the map, hence **O(n)** overall.

---

💡 *You can optimize space further to O(k) by avoiding the distance map and computing squared distances inline.*
