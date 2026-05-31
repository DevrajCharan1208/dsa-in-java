# Binary Search Trees in Java

This directory contains implementations of the **Binary Search Tree (BST)** data structure and its fundamental operations.

## 📁 Directory Structure

| File | Type | Description |
|---|---|---|
| [`BST01BuildingBST.java`](BST01BuildingBST.java) | **Implementation** | Constructs a BST by iteratively inserting values. Also includes Inorder traversal (which yields a sorted array) and a boolean `search` function. |
| [`BST02DeleteANode.java`](BST02DeleteANode.java) | **Implementation** | Implements the deletion of a node from a BST, handling all 3 cases: node with no child (leaf), node with one child, and node with two children (using inorder successor). |

---

## 🛠️ Core BST Properties & Operations

A **Binary Search Tree (BST)** is a specialized binary tree that satisfies the following property:
1. The **left subtree** of a node contains only nodes with keys **less than** the node's key.
2. The **right subtree** of a node contains only nodes with keys **greater than** the node's key.
3. The left and right subtrees must also be binary search trees.

This property guarantees that an **Inorder Traversal** of a BST will always output the nodes in strictly **ascending (sorted) order**.

### 1. Building a BST & Search (`BST01BuildingBST.java`)
- **Key Concept**: 
  - **Insert**: To insert a value, recursively traverse the tree. If the value is smaller than the root, go left; if larger, go right. Insert when a `null` spot is found.
  - **Search**: Recursively compare the target key with the root. If it matches, return `true`. If smaller, search the left subtree. If larger, search the right subtree.
- **Time Complexity**: 
  - **Insert**: $O(h)$ where $h$ is the height of the tree. In a balanced BST, this is $O(\log n)$. In a skewed BST, $O(n)$.
  - **Search**: $O(h)$.
- **Space Complexity**: $O(h)$ for the recursion stack space.

### 2. Deleting a Node (`BST02DeleteANode.java`)
- **Key Concept**: Deleting a node involves three distinct cases:
  1. **Case 1 (No child / Leaf node)**: Simply remove the node by returning `null` to its parent.
  2. **Case 2 (One child)**: Replace the node with its only child.
  3. **Case 3 (Two children)**: Find the **Inorder Successor** (the smallest node in the right subtree). Replace the target node's value with the inorder successor's value, and then recursively delete the inorder successor.
- **Time Complexity**: $O(h)$ to find the node and potentially its successor.
- **Space Complexity**: $O(h)$ for the recursion stack space.

---
*💡 **Fun Fact**: Most BST operations take $O(h)$ time, making them highly efficient ($O(\log n)$) when the tree is balanced (like in an AVL or Red-Black Tree).* 🌲
