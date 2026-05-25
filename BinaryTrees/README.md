# Binary Trees in Java

This directory contains custom implementations of the **Binary Tree** data structure, tree traversal methods, and fundamental tree-based algorithms implemented in Java.

## 📁 Directory Structure

| File | Type | Description |
|---|---|---|
| [`TR01BuildPreorderTree.java`](TR01BuildPreorderTree.java) | **Implementation & Traversals** | Builds a binary tree recursively from a preorder array representation and implements tree traversals (Preorder, Inorder, Postorder, Level Order). |
| [`TR02HeightOfATree.java`](TR02HeightOfATree.java) | **Problem** | Recursively calculates the height of a binary tree — O(n). |

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

---
*💡 **Binary Tree Concept**: A tree is a non-linear, hierarchical data structure. A Binary Tree is a tree in which each node has at most two children, referred to as the left child and the right child.* 🌳
