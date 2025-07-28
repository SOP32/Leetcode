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
