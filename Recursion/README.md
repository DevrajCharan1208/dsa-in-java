# Recursion in Java

This directory contains implementations of classic recursion problems in Java — building up from basic recursive thinking to intermediate-level challenges.

## 📝 Topics Covered

| No. | Problem | Description | Solution Link |
|---|---|---|---|
| 1 | **Factorial** | Computing `n!` using recursive multiplication — O(n). | [`R01Factorial.java`](R01Factorial.java) |
| 2 | **Sum of First N Numbers** | Calculating the sum of first `n` natural numbers recursively — O(n). | [`R02SumOfNumbers.java`](R02SumOfNumbers.java) |
| 3 | **N-th Fibonacci** | Finding the n-th Fibonacci number using naive recursion — O(2ⁿ). | [`R03NthFibonacci.java`](R03NthFibonacci.java) |
| 4 | **Is Array Sorted** | Checking if an array is sorted in ascending order using recursion — O(n). | [`R04IsArraySorted.java`](R04IsArraySorted.java) |
| 5 | **Tiling Problem** | Counting ways to tile a 2×n floor with 2×1 tiles (Fibonacci-like recurrence) — O(2ⁿ). | [`R05TilingProblem.java`](R05TilingProblem.java) |
| 6 | **Remove Duplicate Characters** | Removing duplicate characters from a string using a boolean map and recursion — O(n). | [`R06RemoveDuplicateString.java`](R06RemoveDuplicateString.java) |
| 7 | **Friends Pairing Problem** | Counting ways `n` friends can remain single or pair up: `f(n) = f(n-1) + (n-1) * f(n-2)` — O(2ⁿ). | [`R07FriendsPairing.java`](R07FriendsPairing.java) |
| 8 | **Binary Strings (No Consecutive 1s)** | Printing all binary strings of length `n` with no two consecutive 1s — O(2ⁿ). | [`R08NoConsecutiveOnes.java`](R08NoConsecutiveOnes.java) |

## 📌 Recursion Essentials

- **Base Case** — The condition that stops recursion (prevents infinite calls).
- **Recursive Call** — The function calling itself with a smaller/simpler input.
- **Call Stack** — Each recursive call adds a frame to the stack; deep recursion may cause `StackOverflowError`.

> 💡 Many of these problems have equivalent iterative solutions that are more efficient — recursion here is for building a strong foundation before tackling Divide & Conquer and Backtracking.
