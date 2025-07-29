# 🧩 Problem: Merge Intervals

Given a collection of intervals, merge all overlapping intervals and return an array of the non-overlapping intervals that cover all the intervals in the input.

---

## ✅ Approach

We use a **greedy algorithm** with sorting to efficiently merge overlapping intervals.

---

## 🔍 Steps

1. **Sort Intervals**:
   - Sort the input array based on the start time of each interval: `interval[0]`.

2. **Iterate and Merge**:
   - Initialize an empty `List<int[]>` called `merged`.
   - For each interval:
     - If `merged` is empty or the last merged interval ends before the current interval starts, simply **add** the interval.
     - Else, there is **overlap**, so we **merge** by updating the end of the last interval:

       ```java
       merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
       ```

3. **Return Result**:
   - Convert the list to a 2D array and return it.

---

## Why It Works

- Sorting ensures that intervals are processed in order, making it easy to merge overlapping intervals in one pass.
- We always compare the current interval’s start with the end of the last interval in `merged`.

---

## 📦 Time and Space Complexity

- **Time Complexity**: `O(n log n)`  
  (due to sorting)
- **Space Complexity**: `O(n)`  
  (in the worst case, all intervals are non-overlapping and stored in the result list)

