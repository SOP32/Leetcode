## 📌 Problem: Longest Substring Without Repeating Characters

Given a string `s`, find the length of the **longest substring** without repeating characters.

---

## ✅ Approach: Sliding Window + HashSet

### 🔍 Intuition
We use a **sliding window** to track a substring with **unique characters**. The window is defined by two pointers: `i` (start) and `j` (end). A `HashSet` stores the characters currently in the window.

### 🧠 Key Idea
- Expand the window by moving `j` when `s.charAt(j)` is **not** in the set.
- If a duplicate is found, **shrink** the window from the left by moving `i` and removing characters until the duplicate is gone.
- At each step, update the maximum length.

---

## ⏱ Time Complexity
**O(n)** — Each character is processed at most twice (once by `j`, once by `i`).

## 📦 Space Complexity
**O(min(n, m))** — Where `n` is the length of the input string, and `m` is the size of the character set (typically 128 for ASCII or 26 for lowercase letters).


