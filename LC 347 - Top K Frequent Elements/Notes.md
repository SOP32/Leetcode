## 🎯 Goal  
To find the **top K most frequent elements** in an array.

---

## ⚙️ General Strategy  
- Use a **min-heap** (`PriorityQueue` with ascending order) to efficiently track the **K most frequent elements**.  
- Keep adding elements (based on frequency) into the heap.  
- If the heap size exceeds `k`, remove the **least frequent** element.

---

## 🔍 Why Ascending Order?

```java
PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));

- This comparator ensures the element with the lowest frequency is at the top of the heap.
- That makes it easy to remove the least useful (least frequent) element when the heap becomes too large.
