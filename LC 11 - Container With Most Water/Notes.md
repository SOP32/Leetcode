## 💧 Container With Most Water – Explanation

This solution finds the **maximum area of water** that can be contained between two lines in an array using the **two-pointer approach**.

---

### 🔍 Problem Overview

Given an array `height[]`, where each element represents the height of a vertical line on the x-axis,  
you must find two lines such that together with the x-axis they form a container that holds the **most water**.

---

### ✅ Approach: Two Pointers

We use two pointers:
- `i` starts at the **left end** of the array.
- `j` starts at the **right end** of the array.

We calculate the area between the two pointers and keep track of the **maximum area** found so far.

---

### 🔁 Pointer Movement

After calculating area:
- If `height[i] < height[j]`, move `i++` (try to find a taller left line).
- Else, move `j--` (try to find a taller right line).

This ensures we explore all possible widest containers with taller lines.

---

### ⏱ Time and Space Complexity

- **Time Complexity:** O(n) — Each index is visited at most once.
- **Space Complexity:** O(1) — Only a few variables used.
