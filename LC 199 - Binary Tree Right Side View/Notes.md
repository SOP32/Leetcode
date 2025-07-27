## 🧠 Approach: Depth-First Search (DFS) – Right First

We use DFS, but we visit the **right child before the left child**.

For each level, we only add the **first node** we encounter.  
Because we're going right-first, the first node at each level is the **rightmost node**.

---

### 🔍 Step-by-step

- We maintain a `rightSide` list to store the rightmost node at each level.
- We call a helper function `helper(node, level)`:
  - If `level == rightSide.size()`, it means we are visiting this level for the first time, so we add the node’s value.
  - Traverse the **right child first**, then the **left child**.
- Base case: If the tree is null, return an empty list.

---

### 🔄 Example

<pre> 1 / \ 2 3 \ \ 5 4 </pre>


- Level 0 → 1  
- Level 1 → 3
- Level 2 → 4  

✅ Output: `[1, 3, 4]`

---

### 🧩 Time and Space Complexity

| Complexity | Value                          |
|------------|--------------------------------|
| ⏱ Time     | O(n) – visit every node once   |
| 🗂 Space    | O(h) – height of tree (recursion stack) |

