# Surrounded Regions – DFS Approach

## 🧩 Problem Summary  
Given an `m x n` board containing `'X'` and `'O'`, capture all regions surrounded by `'X'`.  
A region is captured if it is fully surrounded (i.e., none of its `'O'`s touch the border).

---

## ✅ Approach: Depth-First Search (DFS)

### 💡 Key Insight  
Only `'O'`s that are **not connected to the border** can be safely converted to `'X'`.  
All `'O'`s that are **connected to the border** (directly or indirectly) must be preserved.

---

## 🧠 Steps

### Step 1: Start DFS from all border `'O'` cells

- **Iterate over the top and bottom rows**, each cell:
  - Run DFS

- **Iterate over the left and right columns**, each cell:
  - Run DFS
    
- In DFS:
  -  check if the cell is `'O'` and within bounds, return if not
  - **mark all reachable `'O'`s from the border as `'S'`** (safe)
  - Recursively call DFS in **all 4 directions**: up, down, left, right.

---

### Step 2: After DFS traversal
- **Flip all remaining `'O'` → `'X'`** (these are truly surrounded)
- **Restore `'S'` → `'O'`** (to retain the original `'O'`s connected to the border)

---

## 📦 Time and Space Complexity

### ⏱️ Time Complexity: `O(m × n)`
- Each cell is visited **at most once**:
  - DFS visits connected `'O'`s starting from the border.
  - Final pass iterates through the entire board.
- Let `m` = number of rows, `n` = number of columns.
- ✅ **Total time = O(m × n)**

### 🧠 Space Complexity:

- **In-place modification** of the board → no extra space for the board itself.
- However, **recursive DFS uses the call stack**:
  - Worst case (entire board is `'O'`): recursion depth = `O(m × n)`
  - ⚠️ Risk of **stack overflow** in languages like Java on large boards.
- ✅ **Total space = O(m × n)** (due to recursion stack)


---
DFS visits deeply connected cells first, while BFS processes border-connected 'O's level by level.
In problems like Surrounded Regions, DFS is faster to write but BFS is safer and more predictable, especially on large boards
