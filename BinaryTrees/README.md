# Binary Trees in Java

This directory contains custom implementations of the **Binary Tree** data structure, tree traversal methods, and fundamental tree-based algorithms implemented in Java.

## 📁 Directory Structure

| File | Type | Description |
|---|---|---|
| [`TR01BuildPreorderTree.java`](TR01BuildPreorderTree.java) | **Implementation & Traversals** | Builds a binary tree recursively from a preorder array representation and implements tree traversals (Preorder, Inorder, Postorder, Level Order). |
| [`TR02HeightOfATree.java`](TR02HeightOfATree.java) | **Problem** | Recursively calculates the height of a binary tree — O(n). |
| [`TR03CountOfNodes.java`](TR03CountOfNodes.java) | **Problem** | Recursively counts the total number of nodes in a binary tree — O(n). |
| [`TR04SumOfNodes.java`](TR04SumOfNodes.java) | **Problem** | Recursively calculates the sum of all node values in a binary tree — O(n). |
| [`TR05DiameterOfTree.java`](TR05DiameterOfTree.java) | **Problem** | Calculates the diameter of a binary tree (slow O(n²) approach). |
| [`TR06DiameterOfTree2.java`](TR06DiameterOfTree2.java) | **Problem** | Calculates the diameter of a binary tree (optimized O(n) approach using a helper class). |
| [`TR07IsSubTree.java`](TR07IsSubTree.java) | **Problem** | Checks if a given tree is a subtree of another tree — O(n * m). |
| [`TR08TopViewOfATree.java`](TR08TopViewOfATree.java) | **Problem** | Traverses and prints the top view of a binary tree level-by-level — O(n). |
| [`TR09KthLevel.java`](TR09KthLevel.java) | **Problem** | Finds and prints all nodes located at the K-th level of a binary tree — O(n). |
| [`TR10LowestCommonAncestor.java`](TR10LowestCommonAncestor.java) | **Problem** | Finds the lowest common ancestor of two nodes by storing root-to-node paths — O(n). |
| [`TR11LowestCommonAncestor2.java`](TR11LowestCommonAncestor2.java) | **Problem** | Finds the lowest common ancestor of two nodes in a single recursive pass — O(n). |
| [`TR12MinDistanceBetweenNodes.java`](TR12MinDistanceBetweenNodes.java) | **Problem** | Calculates the minimum distance (number of edges) between two nodes — O(n). |

---

## 🛠️ Tree Traversals (DFS & BFS)

Tree traversals are methods for visiting all nodes of a tree. They are classified into:

### 1. Depth First Search (DFS)
* **Preorder** (Root → Left → Right): Visits the root node first, then recursively traverses the left subtree, followed by the right subtree.
* **Inorder** (Left → Root → Right): Recursively traverses the left subtree, visits the root node, and then recursively traverses the right subtree. In a BST, this yields nodes in ascending order.
* **Postorder** (Left → Right → Root): Recursively traverses the left subtree, then the right subtree, and visits the root node last.

### 2. Breadth First Search (BFS)
* **Level Order**: Visits nodes level-by-level starting from the root. Uses a `Queue` to keep track of child nodes and a `null` marker to format output level-by-level (by inserting line breaks).

---

## 📝 Problem Summaries

### 1. Build Preorder Tree (`TR01BuildPreorderTree.java`)
- **Key Concept**: Constructs a binary tree recursively from a preorder array containing node values, where `-1` represents a null node. 
  - A static index tracks the current position.
  - If the array element is `-1`, return `null`.
  - Otherwise, create a new node, recursively build its left subtree, recursively build its right subtree, and return the node.
- **Time Complexity**: $O(n)$ where $n$ is the number of elements in the array.
- **Space Complexity**: $O(n)$ call stack depth in the worst case (skewed tree), or $O(\log n)$ in the best case (balanced tree).

### 2. Height of a Tree (`TR02HeightOfATree.java`)
- **Key Concept**: The height of a binary tree is the length of the longest path from the root to a leaf node. 
  - The height of a null node is 0.
  - For any other node, the height is $\max(\text{left subtree height}, \text{right subtree height}) + 1$.
- **Time Complexity**: $O(n)$ since every node must be visited.
- **Space Complexity**: $O(h)$ where $h$ is the height of the tree, representing the maximum recursive call stack depth.

### 3. Count of Nodes (`TR03CountOfNodes.java`)
- **Key Concept**: The total number of nodes in a binary tree is calculated recursively. If the node is null, it returns 0. Otherwise, it returns the sum of nodes in the left subtree plus the sum of nodes in the right subtree plus 1 (for the current node).
- **Time Complexity**: $O(n)$ since we visit every node exactly once.
- **Space Complexity**: $O(h)$ where $h$ is the height of the tree, representing the maximum recursive call stack depth.

### 4. Sum of Nodes (`TR04SumOfNodes.java`)
- **Key Concept**: The sum of all node values in a binary tree is calculated recursively. If the node is null, it returns 0. Otherwise, it returns the sum of node values in the left subtree plus the sum of node values in the right subtree plus the value of the current node.
- **Time Complexity**: $O(n)$ since we visit every node exactly once.
- **Space Complexity**: $O(h)$ where $h$ is the height of the tree, representing the maximum recursive call stack depth.

### 5. Diameter of a Tree - Slow $O(n²)$ (`TR05DiameterOfTree.java`)
- **Key Concept**: The diameter of a tree is the maximum distance between any two nodes. For each node, the diameter is the maximum of:
  1. The diameter of the left subtree.
  2. The diameter of the right subtree.
  3. The path passing through the current node ($\text{height}(\text{left}) + \text{height}(\text{right}) + 1$).
  Since heights are computed separately for each node, it results in quadratic time.
- **Time Complexity**: $O(n^2)$
- **Space Complexity**: $O(h)$

### 6. Diameter of a Tree - Optimized $O(n)$ (`TR06DiameterOfTree2.java`)
- **Key Concept**: We optimize the diameter calculation to linear time by returning both height and diameter in a single recursive pass using an auxiliary `Info` class. This avoids recomputing tree heights repeatedly.
- **Time Complexity**: $O(n)$
- **Space Complexity**: $O(h)$

### 7. Subtree of Another Tree (`TR07IsSubTree.java`)
- **Key Concept**: Checks if a given subtree `subRoot` is structurally and value-wise identical to any part of a larger binary tree. We traverse the main tree, and whenever we find a node matching the root of the subtree, we verify structural identity recursively using a helper function `isIdentical()`.
- **Time Complexity**: $O(n \times m)$ in the worst case (where $n$ and $m$ are node counts of the main tree and subtree).
- **Space Complexity**: $O(h_n + h_m)$ recursion stack depth.

### 8. Top View of a Tree (`TR08TopViewOfATree.java`)
- **Key Concept**: Prints the values of nodes as they would appear when viewed from the top. 
  - We assign a horizontal distance (hd) to each node: root is 0, left is $\text{parent.hd} - 1$, right is $\text{parent.hd} + 1$.
  - We perform level-order traversal (BFS) using a Queue and store the horizontal distance of each node.
  - A `HashMap` stores only the first node encountered for each unique horizontal distance (since BFS processes top nodes first).
  - Track minimum and maximum horizontal distances to output nodes in order.
- **Time Complexity**: $O(n)$
- **Space Complexity**: $O(n)$ to store BFS queue elements and horizontal distance map entries.

### 9. Nodes at K-th Level (`TR09KthLevel.java`)
- **Key Concept**: To retrieve all nodes at a given level `k`, we do a recursive DFS traversal of the tree, passing along a `level` variable. When `level == k`, we add the node's value to our result list and backtrack.
- **Time Complexity**: $O(n)$ in the worst case (as we might visit all nodes).
- **Space Complexity**: $O(h)$ for recursion stack.

### 10. Lowest Common Ancestor - Path Method (`TR10LowestCommonAncestor.java`)
- **Key Concept**: Find the root-to-node paths for both target nodes `n1` and `n2`. Compare the paths simultaneously until they diverge; the last common node before divergence is the lowest common ancestor.
- **Time Complexity**: $O(n)$
- **Space Complexity**: $O(n)$ to store paths of sizes up to tree height.

### 11. Lowest Common Ancestor - Recursive Method (`TR11LowestCommonAncestor2.java`)
- **Key Concept**: Find the LCA recursively in a single pass without extra path storage. If root is null, or matches `n1` or `n2`, return root. Recursively search left and right subtrees. If one is null, return the other; if both are non-null, root is the LCA.
- **Time Complexity**: $O(n)$
- **Space Complexity**: $O(h)$ (recursion stack space).

### 12. Minimum Distance Between Two Nodes (`TR12MinDistanceBetweenNodes.java`)
- **Key Concept**: The minimum distance (number of edges) between nodes `n1` and `n2` is equal to the distance from their Lowest Common Ancestor (LCA) to `n1` plus the distance from the LCA to `n2`. We calculate the LCA, and then run a helper function `lcaDist` to find the distance of each node from the LCA.
- **Time Complexity**: $O(n)$
- **Space Complexity**: $O(h)$ (recursion stack space).

---
*💡 **Binary Tree Concept**: A tree is a non-linear, hierarchical data structure. A Binary Tree is a tree in which each node has at most two children, referred to as the left child and the right child.* 🌳
