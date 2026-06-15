# Graphs in Java

This directory covers **Graph** data structures and algorithms, starting from basic representations to complex traversal, shortest paths, and spanning tree algorithms.

## 📁 Directory Structure

| File | Type | Description |
|---|---|---|
| [`G01CreatingAGraph.java`](G01CreatingAGraph.java) | **Implementation** | Demonstrates how to create a weighted, undirected Graph using an **Adjacency List**. Defines an `Edge` class (`src`, `dest`, `wt`) and uses an Array of `ArrayList<Edge>` to store the graph. |
| [`G02BFS.java`](G02BFS.java) | **Algorithm** | Implements **Breadth-First Search (BFS)** using a Queue. Visits nodes level by level. |
| [`G03DFS.java`](G03DFS.java) | **Algorithm** | Implements **Depth-First Search (DFS)** using recursion. Explores as far as possible along each branch before backtracking. |
| [`G04HasPath.java`](G04HasPath.java) | **Problem** | Uses DFS to determine if there exists a valid path between a `source` and a `destination` vertex. |

---

## 🛠️ Core Concepts & Representations

A Graph is a non-linear data structure consisting of vertices (nodes) and edges (lines connecting them).

### Common Representations

1. **Adjacency Matrix**: A 2D array of size $V \times V$ where $arr[i][j] = 1$ (or weight) if an edge exists between vertex $i$ and $j$.
   - **Space**: $O(V^2)$
   - **Best for**: Dense graphs.

2. **Adjacency List (`G01`)**: An Array (or Map) of Lists. Each vertex has a list of edges originating from it.
   - **Space**: $O(V + E)$
   - **Best for**: Sparse graphs (most common representation in DSA).

### Java Adjacency List Setup
```java
// 1. Define the Edge
static class Edge {
    int src, dest, wt;
    public Edge(int src, int dest, int wt) {
        this.src = src; this.dest = dest; this.wt = wt;
    }
}

// 2. Initialize the Graph (Array of ArrayLists)
int V = 5;
ArrayList<Edge>[] graph = new ArrayList[V];

for (int i = 0; i < V; i++) {
    graph[i] = new ArrayList<>(); // Initialize empty lists
}

// 3. Add Edges
graph[0].add(new Edge(0, 1, 5));
```

### Graph Traversals

| Traversal | Mechanism | Complexity | Best For |
|---|---|---|---|
| **BFS** (Breadth-First Search) | `Queue` + `boolean[] visited` | $O(V + E)$ | Finding shortest path on unweighted graphs, level-by-level exploration. |
| **DFS** (Depth-First Search) | Recursion (Call Stack) + `boolean[] visited` | $O(V + E)$ | Connectivity, cycle detection, topological sorting. |

*Note: For disconnected graphs, you would need to loop through all vertices and call BFS/DFS for unvisited nodes to ensure the entire graph is processed.*
