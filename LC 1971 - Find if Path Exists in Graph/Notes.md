https://leetcode.com/problems/find-if-path-exists-in-graph/description/

# 🔍 Problem: Find if Path Exists in Graph

Given `n` nodes numbered from `0` to `n - 1`, and a list of undirected `edges`, determine if there is a valid path from `source` to `destination`.

---

## ✅ Approach: Breadth-First Search (BFS)

### 1. Build the Graph (Adjacency List)

- Create a graph using a HashMap:
  `Map<Integer, List<Integer>> graph = new HashMap<>();`

- Traverse each edge `[a, b]`.

- Use `computeIfAbsent` to create and update adjacency lists for both nodes to account for the undirected nature of the graph:

```java
graph.computeIfAbsent(a, val -> new ArrayList<>()).add(b);
graph.computeIfAbsent(b, val -> new ArrayList<>()).add(a);
```

---

### 2. Initialize BFS Structures

- Create a queue and add the source node:

```java
Queue<Integer> queue = new LinkedList<>();
queue.offer(source);
```

- Create a `visited[]` array to avoid revisiting nodes and mark the source as visited:

```java
boolean[] visited = new boolean[n];
visited[source] = true;
```

---

### 3. BFS Traversal

- While the queue is not empty:
  - Dequeue a node.
  - If the dequeued node is the destination, return `true`.
  - Otherwise, check its neighbors.
    - For each unvisited neighbor:
      - Mark it as visited.
      - Add it to the queue.

---

### 4. Return False if No Path Found

- If the loop ends and the destination hasn’t been reached, return `false`.

---

## 🕒 Time and Space Complexity

- **Time Complexity:** O(V + E)  
  Where `V` is the number of vertices (nodes) and `E` is the number of edges.

- **Space Complexity:** O(V + E)  
  For storing the graph as an adjacency list and the visited array.

## DFS vs BFS

- Both DFS and BFS can solve this. But BFS is preferred. We just need any valid path, not all paths.

| Graph Type     |  BFS                                 |  DFS                                 |
|----------------|--------------------------------------------------|------------------------------------------------|
| **Wide, Shallow** | Finds goal early by checking many neighbors    | May go down wrong paths before backtracking    |
| **Deep, Narrow**  | May consume more memory traversing wide levels | Can get stuck deep before finding destination  |
  

  
