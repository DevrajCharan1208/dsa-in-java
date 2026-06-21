# Graphs in Java

This directory covers **Graph** data structures and algorithms, starting from basic representations to complex traversal, shortest paths, and spanning tree algorithms.

## 📁 Directory Structure

| File | Type | Description |
|---|---|---|
| [`G01CreatingAGraph.java`](G01CreatingAGraph.java) | **Implementation** | Demonstrates how to create a weighted, undirected Graph using an **Adjacency List**. Defines an `Edge` class (`src`, `dest`, `wt`) and uses an Array of `ArrayList<Edge>` to store the graph. |
| [`G02BFS.java`](G02BFS.java) | **Algorithm** | Implements **Breadth-First Search (BFS)** using a Queue. Visits nodes level by level. |
| [`G03DFS.java`](G03DFS.java) | **Algorithm** | Implements **Depth-First Search (DFS)** using recursion. Explores as far as possible along each branch before backtracking. |
| [`G04HasPath.java`](G04HasPath.java) | **Problem** | Uses DFS to determine if there exists a valid path between a `source` and a `destination` vertex. |
| [`G05ConnectedComponents.java`](G05ConnectedComponents.java) | **Algorithm** | Adapts BFS and DFS to handle **Disconnected Graphs** by iterating over all vertices and initiating traversals for unvisited nodes. |
| [`G06CycleDetectionUndirected.java`](G06CycleDetectionUndirected.java) | **Algorithm** | Detects cycles in an undirected graph using DFS. Tracks the `parent` node to avoid false positives from the edge we just traversed. |
| [`G07BipartiteGraph.java`](G07BipartiteGraph.java) | **Algorithm** | Determines if a graph is **Bipartite** (can be colored with 2 colors without adjacent nodes sharing the same color) using BFS Graph Coloring. |
| [`G08CycleDetectionDirected.java`](G08CycleDetectionDirected.java) | **Algorithm** | Detects cycles in a **Directed Graph** using DFS. Keeps a recursion `stack[]` array to track nodes currently in the active traversal path. |
| [`G09TopologicalSorting.java`](G09TopologicalSorting.java) | **Algorithm** | Implements **Topological Sorting** for Directed Acyclic Graphs (DAGs) using a modified DFS and a Stack. Dependencies are pushed to the stack after all their children are visited. |
| [`G10ToplogicalSortBFS.java`](G10ToplogicalSortBFS.java) | **Algorithm** | Implements **Topological Sorting using BFS (Kahn's Algorithm)**. Calculates in-degrees of all vertices and uses a Queue to process nodes with `in-degree == 0`. |
| [`G11AllPaths.java`](G11AllPaths.java) | **Problem** | Finds **All Paths** from a source to a target node in a Directed Graph using DFS Backtracking. |
| [`G12DjiktrasAlgo.java`](G12DjiktrasAlgo.java) | **Algorithm** | Implements **Dijkstra's Algorithm** for finding the shortest paths from a source to all other vertices. Uses a `PriorityQueue` (Greedy approach). Fails on negative weights. |
| [`G13BellmanFordAlgo.java`](G13BellmanFordAlgo.java) | **Algorithm** | Implements the **Bellman-Ford Algorithm** for finding shortest paths. Iterates $V-1$ times to relax all edges. Can handle **negative weight edges** and detect negative weight cycles. |

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
