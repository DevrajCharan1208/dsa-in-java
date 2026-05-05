# Sorting Algorithms in Java

This directory contains implementations of fundamental sorting algorithms in Java.

## 📝 Algorithms Covered

| No. | Algorithm | Best Case | Average Case | Worst Case | Space | Solution Link |
|---|---|---|---|---|---|---|
| 1 | **Bubble Sort** | O(n) | O(n²) | O(n²) | O(1) | [`S01BubbleSort.java`](S01BubbleSort.java) |
| 2 | **Selection Sort** | O(n²) | O(n²) | O(n²) | O(1) | [`S02SelectionSort.java`](S02SelectionSort.java) |
| 3 | **Insertion Sort** | O(n) | O(n²) | O(n²) | O(1) | [`S03InsertionSort.java`](S03InsertionSort.java) |
| 4 | **Counting Sort** | O(n+k) | O(n+k) | O(n+k) | O(k) | [`S04CountingSort.java`](S04CountingSort.java) |

> `n` = number of elements, `k` = range of input values

## 📌 Algorithm Notes

- **Bubble Sort** — Repeatedly swaps adjacent elements if they are in the wrong order. Simple but inefficient for large datasets.
- **Selection Sort** — Finds the minimum element from the unsorted portion and places it at the correct position. Always makes O(n²) comparisons.
- **Insertion Sort** — Builds the sorted array one element at a time by inserting each element into its correct position. Efficient for nearly-sorted data.
- **Counting Sort** — Non-comparison-based sort that counts occurrences of each element. Very fast when the value range `k` is small relative to `n`.
