## 🌳 Problem: Binary Tree Level Order Traversal

This is a typical **BFS (Breadth-First Search)** problem where nodes are grouped by depth.  
We use a **queue** to explore each level and collect values **level-wise**.

---

### 🔹 1. Initialize the Queue and Output List

- Create a `List<List<Integer>> levels` to store the final result.
- Return it directly if `root == null`.
- Initialize a `Queue<TreeNode> queue` and add the `root` to start BFS.
- Use an integer `level` to track the current depth level.

---

### 🔹 2. BFS Traversal Level by Level

While the queue is not empty:

- Add an empty list for this level to `levels`.
- Get current level size:  
  `int n = queue.size();` — to know how many nodes are on this level.
- Process all nodes at this level (`n` times):  
  For each node:
  - Dequeue the node from the queue.
  - Add `node.val` to `levels.get(level)`.
  - If it has a left child, enqueue it.
  - If it has a right child, enqueue it.
- Move to the next level:  
  Increment `level++` after finishing all nodes at the current depth.

---

### 🔹 3. Return Result

After the loop ends (all levels processed), return the `levels` list.

---

### ⏱️ Time and Space Complexity

- **Time Complexity:** `O(n)`, where `n` is the number of nodes — each node is visited once.
- **Space Complexity:** `O(n)` for the queue and output list in the worst case (i.e., a full binary tree).
