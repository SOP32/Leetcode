https://leetcode.com/problems/rotting-oranges/description/

# Rotting Oranges – BFS Approach Explanation

## Problem Summary
You are given a grid representing a box of oranges:
- `0` = empty cell  
- `1` = fresh orange  
- `2` = rotten orange  

Each minute, any fresh orange that is 4-directionally adjacent to a rotten orange becomes rotten. Return the minimum number of minutes that must elapse until no cell has a fresh orange. If this is impossible, return -1.

---

## Approach: Multi-source Breadth-First Search (BFS)

### 1. Initialize the Queue and Count Fresh Oranges
- Traverse the grid.
- Add all initially rotten orange positions to a queue.
- Count the total number of fresh oranges.

### 2. Use a Marker to Track Time Levels
- Add a marker (e.g., `[-1, -1]`) to the queue to signal the end of each time unit (or level in BFS).
- This helps keep track of the minutes elapsed.

### 3. BFS Traversal
- While the queue is not empty:
  - Dequeue the front element.
  - If it's a marker:
    - Increment the `time` counter.
    - If the queue is not empty, add a new marker for the next level.
  - Else:
    - For each of the 4 directions (up, down, left, right):
      - Check if the neighboring cell is within bounds.
      - If it contains a fresh orange:
        - Change it to rotten.
        - Add the position to the queue.
        - Decrease the count of fresh oranges.

### 4. Return Result
- If there are no fresh oranges left (`fresh == 0`), return `time`.
- Otherwise, return `-1` (not all oranges could rot).

---

## Time and Space Complexity

- **Time Complexity:** O(m × n), where m = number of rows, n = number of columns in the grid
- **Space Complexity:** O(m × n) for the queue in the worst case. In the worst case, the grid is filled with rotten oranges. As a result, the queue would be initialized with all the cells in the grid.

