# Heaps & Priority Queues in Java

This directory contains implementations of the **Heap** data structure, **Priority Queue** collections, and standard problems solved using them.

## 📁 Directory Structure

| File | Type | Description |
|---|---|---|
| [`H01PriorityQueue.java`](H01PriorityQueue.java) | **Concept** | Introduction to Java's `PriorityQueue`. Covers Min-PQ (default), Max-PQ using `Comparator.reverseOrder()`, and using custom objects with the `Comparable` interface. |
| [`H02Heap.java`](H02Heap.java) | **Implementation** | Manual implementation of a **Min-Heap** using an `ArrayList`. Includes `add`, `peek`, `remove`, and `heapify` methods. |
| [`H03HeapSort.java`](H03HeapSort.java) | **Algorithm** | Implements **Heap Sort** to sort an array in ascending order in $O(N \log N)$ time using a Max-Heap. |
| [`H04NearbyCars.java`](H04NearbyCars.java) | **Problem** | Finds the $K$ closest cars to the origin $(0,0)$ using a Priority Queue and custom class comparison (based on distance squared). |
| [`H05ConnectNRopes.java`](H05ConnectNRopes.java) | **Problem** | Finds the minimum cost to connect $N$ ropes using a Min-Priority Queue. Greedy choice: always connect the two smallest ropes first. |
| [`H06WeakestSoldier.java`](H06WeakestSoldier.java) | **Problem** | Finds the $K$ weakest rows in a binary matrix. A row is weaker if it has fewer soldiers (1s), or if tied, a smaller index. |
| [`H07SlidingWindowMaximum.java`](H07SlidingWindowMaximum.java) | **Problem** | Finds the maximum element in every sliding window of size $K$. Uses a Max-Heap storing `(value, index)` and lazily removes elements that fall out of the window bounds. |

---

## 🛠️ Core Concepts & Complexities

A **Heap** is a complete binary tree that satisfies the heap property:
- **Max-Heap**: The value of each node is greater than or equal to the values of its children. (Root is the max element).
- **Min-Heap**: The value of each node is less than or equal to the values of its children. (Root is the min element).

Java's `PriorityQueue` is implemented under the hood as a Min-Heap.

### Core Operations (Min-Heap / Max-Heap)
- **Insert (`add`)**: Add at the last index, then bubble up (fix heap). **$O(\log N)$**
- **Peek / Get Min/Max**: Return the root (index 0). **$O(1)$**
- **Remove Min/Max**: Swap root with the last element, remove the last element, then bubble down the new root (`heapify`). **$O(\log N)$**

### Custom Objects in Priority Queue
When storing custom objects in a `PriorityQueue`, the class must implement the `Comparable<T>` interface and override the `compareTo` method.
```java
static class Student implements Comparable<Student> {
    int rank;
    @Override
    public int compareTo(Student s2) {
        return this.rank - s2.rank; // Ascending order (Min-Heap)
    }
}
```

### Heap Sort (`H03HeapSort.java`)
**Heap Sort** works in two phases:
1. Build a Max-Heap from the unsorted array ($O(N)$ time).
2. Repeatedly extract the maximum element (root) and place it at the end of the array, then heapify the reduced heap ($O(N \log N)$ time).
- **Total Time Complexity**: $O(N \log N)$
- **Space Complexity**: $O(1)$ (In-place sorting)
