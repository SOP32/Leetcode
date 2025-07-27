## 🧠 Approach: Depth-First Search (DFS) – Right First

We use DFS, but we visit the **right child before the left child**.

For each level, we only add the **first node** we encounter.  
Because we're going right-first, the first node at each level is the **rightmost node**.

---


### 🔍 Step-by-step

- We maintain a `rightSide` list to store the rightmost node at each level.
- At the start of `rightSideView()`, we check if the root is `null`. If so, we return an empty list — this is a **one-time null check**, not a recursive base case.
- We then call the helper function `helper(node, level)`:
  - If `level == rightSide.size()`, we are visiting this level for the first time → add the node’s value.
  - Recursively traverse the **right child first**, then the **left child**.
- Inside `helper()`, we don’t need an explicit base case because we only call it when the child node is non-null.

---

### 🧩 Time and Space Complexity

| Complexity | Value                          |
|------------|--------------------------------|
| ⏱ Time     | O(n) – visit every node once   |
| 🗂 Space    | O(h) – height of tree (recursion stack) |

