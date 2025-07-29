## Explanation of the `kthSmallest` Solution

This solution finds the **kth smallest element** in a Binary Search Tree (BST) using **iterative in-order traversal** with a stack.

### Key Insight
In a BST, **in-order traversal** (left → root → right) visits nodes in **ascending order**.  
The **kth smallest element** is simply the **kth node visited** during this traversal.

---

### Step-by-Step Process

1. **Traverse Left Subtree:**  
   Starting from the root, repeatedly move to the **left child** while **adding each node to a stack**.  
   - This ensures we store all nodes on the path to the smallest value.

2. **Process the Current Node:**  
   When there are no more left children, **pop a node from the stack**.  
   - Each pop means we have visited the next smallest element in sorted order.  
   - Decrement `k`. If `k == 0`, the current node's value is the **kth smallest**.

3. **Traverse Right Subtree:**  
   After processing a node, move to its **right child** and repeat the above steps.

---

### Why Add Nodes to the Stack?
The stack stores the path of nodes we haven't processed yet, simulating the recursion of in-order traversal.  
By pushing nodes as we go left, we can **backtrack correctly** when we reach the leftmost node.

---

### Complexity
- **Time Complexity:** O(H + k), where `H` is the height of the tree (O(log N) for balanced trees).
- **Space Complexity:** O(H) due to the stack.

