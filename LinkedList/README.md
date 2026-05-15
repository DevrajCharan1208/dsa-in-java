# Linked List in Java

This directory contains a **custom-built Linked List** implementation (without Java's Collection Framework) and standalone problem files that each define their own minimal `LinkedList` class to solve a specific problem.

## 📁 Structure

| File | Type | Description |
|---|---|---|
| [`LinkedList.java`](LinkedList.java) | **Core Implementation** | Full custom Singly Linked List with all core operations + Merge Sort |
| [`LL01CheckPalindrome.java`](LL01CheckPalindrome.java) | **Problem** | Checks if a linked list is a palindrome |
| [`LL02DetectAndRemoveCycle.java`](LL02DetectAndRemoveCycle.java) | **Problem** | Detects and removes a cycle using Floyd's Algorithm |

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

## 📝 Problem Files

| No. | Problem | Key Technique | Complexity | Solution Link |
|---|---|---|---|---|
| 1 | **Check Palindrome** | Find mid (slow/fast pointer) → Reverse 2nd half → Compare both halves | O(n) time, O(1) space | [`LL01CheckPalindrome.java`](LL01CheckPalindrome.java) |
| 2 | **Detect & Remove Cycle** | Floyd's Cycle Detection (slow/fast pointer) → Reset slow to head and advance both to find cycle start → Remove cycle | O(n) time, O(1) space | [`LL02DetectAndRemoveCycle.java`](LL02DetectAndRemoveCycle.java) |

---

## 💡 Why Are Problem Files Self-Contained?

Each problem file (`LL01`, `LL02`) defines its own minimal `LinkedList` / `Node` class instead of importing `LinkedList.java`. This is because:
1. Java doesn't support importing classes from the same directory without packages.
2. Each file is **independently runnable** — you can compile and test it without any dependencies.
3. The focus stays on the algorithm, not boilerplate setup.

> 💡 **Key Algorithms Used:** Slow & Fast Pointer (Floyd's Algorithm), In-place Reversal, Merge Sort on Linked List.

---
*Linked Lists teach you to think in pointers — master them and recursion becomes second nature!* 🔗
