# Binary Search Trees in Java

This directory contains implementations of the **Binary Search Tree (BST)** data structure and its fundamental operations.

## 📁 Directory Structure

| File | Type | Description |
|---|---|---|
| [`BST01BuildingBST.java`](BST01BuildingBST.java) | **Implementation** | Constructs a BST by iteratively inserting values. Also includes Inorder traversal (which yields a sorted array) and a boolean `search` function. |
| [`BST02DeleteANode.java`](BST02DeleteANode.java) | **Implementation** | Implements the deletion of a node from a BST, handling all 3 cases: node with no child (leaf), node with one child, and node with two children (using inorder successor). |
| [`BST03PrintInRange.java`](BST03PrintInRange.java) | **Problem** | Prints all elements of a BST that fall within a given range `[k1, k2]`. |
| [`BST04RootToLeafPath.java`](BST04RootToLeafPath.java) | **Problem** | Finds and prints all paths from the root node to the leaf nodes. |
| [`BST05IsSubTreeValid.java`](BST05IsSubTreeValid.java) | **Problem** | Validates if a given binary tree is a valid Binary Search Tree using the `min, max` boundary approach. |
| [`BST06MirrorBST.java`](BST06MirrorBST.java) | **Problem** | Converts a Binary Search Tree into its mirror tree by recursively swapping left and right children. |
| [`BST07SortedArrayToBalancedBST.java`](BST07SortedArrayToBalancedBST.java) | **Implementation** | Constructs a balanced Binary Search Tree from a sorted array. |
| [`BST08BSTtoBalancedBST.java`](BST08BSTtoBalancedBST.java) | **Implementation** | Converts an unbalanced Binary Search Tree into a balanced one using inorder traversal. |

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

### 3. Print in Range (`BST03PrintInRange.java`)
- **Key Concept**: Traverses the BST to find elements in the range `[k1, k2]`. Uses the BST property to optimize traversal:
  - If `root.data` is within range, print it and recursively search both left and right subtrees.
  - If `root.data < k1`, only search the right subtree.
  - If `root.data > k2`, only search the left subtree.
- **Time Complexity**: $O(n)$ in the worst case if all elements are in range, but practically faster as it prunes branches.
- **Space Complexity**: $O(h)$ for the recursion stack.

### 4. Root to Leaf Paths (`BST04RootToLeafPath.java`)
- **Key Concept**: Uses Depth-First Search (DFS) with an `ArrayList` to track the current path. When a leaf node is reached (`left == null && right == null`), the current path is added to the list of all paths. Important to remove the last node from the path list when backtracking.
- **Time Complexity**: $O(n)$ to visit every node.
- **Space Complexity**: $O(h)$ for recursion stack and path storage.

### 5. Validate BST (`BST05IsSubTreeValid.java`)
- **Key Concept**: To check if a tree is a valid BST, each node must fall within a specific `(min, max)` range. The root starts with `(null, null)`. When moving left, the `max` becomes the current node's data. When moving right, the `min` becomes the current node's data.
- **Time Complexity**: $O(n)$ to visit every node.
- **Space Complexity**: $O(h)$ for the recursion stack.

### 6. Mirror a BST (`BST06MirrorBST.java`)
- **Key Concept**: A mirror tree is created by swapping the left and right children of all non-leaf nodes. This is done via a simple post-order or pre-order DFS traversal, swapping `root.left` and `root.right` at every step.
- **Time Complexity**: $O(n)$ to visit every node.
- **Space Complexity**: $O(h)$ for the recursion stack.

### 7. Sorted Array to Balanced BST (`BST07SortedArrayToBalancedBST.java`)
- **Key Concept**: To create a balanced BST from a sorted array, the middle element of the array must become the root. The left half of the array recursively forms the left subtree, and the right half forms the right subtree. This ensures that the height difference between the left and right subtrees is at most 1.
- **Time Complexity**: $O(n)$ to process each element of the array once.
- **Space Complexity**: $O(\log n)$ for the recursion stack since the tree is perfectly balanced.

### 8. Convert BST to Balanced BST (`BST08BSTtoBalancedBST.java`)
- **Key Concept**: An unbalanced (skewed) BST can be balanced by first extracting its elements in sorted order. We do an **inorder traversal** and store the elements in an `ArrayList`. Then, we apply the exact same logic as `BST07` (picking the middle element recursively) to build a new balanced BST from the sorted list.
- **Time Complexity**: $O(n)$ for the inorder traversal + $O(n)$ to build the new tree = $O(n)$ total.
- **Space Complexity**: $O(n)$ to store the inorder sequence in an array list, plus $O(\log n)$ for the tree construction recursion stack.

---
*💡 **Fun Fact**: Most BST operations take $O(h)$ time, making them highly efficient ($O(\log n)$) when the tree is balanced (like in an AVL or Red-Black Tree).* 🌲
