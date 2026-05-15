# Linked List in Java

This directory contains a **custom-built Linked List** implementation (without Java's Collection Framework) and standalone problem files that each define their own minimal `LinkedList` class to solve a specific problem.

## 📁 Structure

| File | Type | Description |
|---|---|---|
| [`LinkedList.java`](LinkedList.java) | **Core Implementation** | Full custom Singly Linked List with all core operations + Merge Sort |
| [`DoubleLL.java`](DoubleLL.java) | **Core Implementation** | Full custom Doubly Linked List with `prev` + `next` pointers, add/remove/reverse |
| [`LL01CheckPalindrome.java`](LL01CheckPalindrome.java) | **Problem** | Checks if a linked list is a palindrome |
| [`LL02DetectAndRemoveCycle.java`](LL02DetectAndRemoveCycle.java) | **Problem** | Detects and removes a cycle using Floyd's Algorithm |
| [`LL03ZigZagLL.java`](LL03ZigZagLL.java) | **Problem** | Rearranges a linked list into ZigZag order (alternating min-max) |

---

## 🔧 Core Implementation — `LinkedList.java`

All operations are built from scratch using a custom `Node` class.

| No. | Operation / Method | Description | Complexity |
|---|---|---|---|
| 1 | **`addFirst(data)`** | Insert a node at the beginning of the list | O(1) |
| 2 | **`addLast(data)`** | Insert a node at the end of the list | O(1) |
| 3 | **`add(data, index)`** | Insert a node at a specific index | O(n) |
| 4 | **`removeFirst()`** | Remove and return the first node's value | O(1) |
| 5 | **`removeLast()`** | Remove and return the last node's value | O(n) |
| 6 | **`deleteNthFromEnd(n)`** | Remove the n-th node from the end | O(n) |
| 7 | **`search(key)`** | Iteratively search for a key; return its index | O(n) |
| 8 | **`recSearch(key)`** | Recursively search for a key; return its index | O(n) |
| 9 | **`reverse()`** | Reverse the linked list in-place | O(n) |
| 10 | **`printLL()`** | Print all nodes in `data->null` format | O(n) |
| 11 | **`mergeSort(head)`** | Sort the linked list using Merge Sort | O(n log n) |

---

## 🔧 Doubly Linked List — `DoubleLL.java`

Each `Node` has both a `next` and a `prev` pointer, enabling O(1) removal from both ends.

| No. | Operation / Method | Description | Complexity |
|---|---|---|---|
| 1 | **`addFirst(data)`** | Insert at head — update `newNode.next = head` and `head.prev = newNode` | O(1) |
| 2 | **`removeFirst()`** | Remove head — move head forward, set `head.prev = null` | O(1) |
| 3 | **`removeLast()`** | Remove tail — move tail backward using `tail.prev`, set `tail.next = null` | O(1) |
| 4 | **`reverse()`** | Swap `next` and `prev` pointers for every node | O(n) |
| 5 | **`print()`** | Print nodes in `null<->data<->null` format | O(n) |

---

## 📝 Problem Files

| No. | Problem | Key Technique | Complexity | Solution Link |
|---|---|---|---|---|
| 1 | **Check Palindrome** | Find mid (slow/fast pointer) → Reverse 2nd half → Compare both halves | O(n) time, O(1) space | [`LL01CheckPalindrome.java`](LL01CheckPalindrome.java) |
| 2 | **Detect & Remove Cycle** | Floyd's Cycle Detection (slow/fast pointer) → Reset slow to head and advance both to find cycle start → Remove cycle | O(n) time, O(1) space | [`LL02DetectAndRemoveCycle.java`](LL02DetectAndRemoveCycle.java) |
| 3 | **ZigZag Linked List** | Find mid → Reverse 2nd half → Alternately merge both halves (1→n→2→n-1→...) | O(n) time, O(1) space | [`LL03ZigZagLL.java`](LL03ZigZagLL.java) |

---

## 💡 Why Are Problem Files Self-Contained?

Each problem file (`LL01`, `LL02`, `LL03`) defines its own minimal `LinkedList` / `Node` class instead of importing `LinkedList.java`. This is because:
1. Java doesn't support importing classes from the same directory without packages.
2. Each file is **independently runnable** — you can compile and test it without any dependencies.
3. The focus stays on the algorithm, not boilerplate setup.

> 💡 **Key Algorithms Used:** Slow & Fast Pointer (Floyd's Algorithm), In-place Reversal, Merge Sort on Linked List, ZigZag Alternate Merge.

---
*Linked Lists teach you to think in pointers — master them and recursion becomes second nature!* 🔗
