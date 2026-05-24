# Greedy Algorithms in Java

This directory contains implementations of various **Greedy Algorithms** in Java. Greedy algorithms build up a solution piece by piece, always choosing the next piece that offers the most obvious and immediate (local) benefit, hoping it leads to a global optimum.

## 📁 Directory Structure

| File | Type | Description |
|---|---|---|
| [`GR01ActivitySelection.java`](GR01ActivitySelection.java) | **Problem** | Maximizes the number of activities that can be performed by a single person — O(n log n). |
| [`GR02FractionKnapsack.java`](GR02FractionKnapsack.java) | **Problem** | Maximizes the total value in a knapsack by taking fractions of items — O(n log n). |
| [`GR03MinimumSumDIff.java`](GR03MinimumSumDIff.java) | **Problem** | Pairs elements from two arrays to minimize the sum of their absolute differences — O(n log n). |
| [`GR04LongestChain.java`](GR04LongestChain.java) | **Problem** | Finds the longest chain of pairs where `b < c` — O(n log n). |
| [`GR05IndianCoins.java`](GR05IndianCoins.java) | **Problem** | Finds the minimum number of coins to make change using standard Indian denominations — O(1). |
| [`GR06JobSequencing.java`](GR06JobSequencing.java) | **Problem** | Schedules jobs with deadlines to maximize profit — O(n log n). |
| [`GR06ChocolateBar.java`](GR06ChocolateBar.java) | **Problem** | Minimizes the cost to break a chocolate bar into 1x1 squares (Chocola) — O(n log n + m log m). |

---

## 🛠️ Greedy Philosophy

A Greedy algorithm works by making the **locally optimal choice** at each stage. It does not re-evaluate previous decisions, which makes it fast, though it is not guaranteed to produce the global optimum for all problems. For problems like Activity Selection and Fractional Knapsack, however, the greedy approach is mathematically proven to yield optimal results.

Key properties of problems solved by Greedy methods:
1. **Greedy Choice Property**: A global optimum can be reached by making local greedy choices.
2. **Optimal Substructure**: An optimal solution to the problem contains optimal solutions to its subproblems.

---

## 📝 Problem Summaries

### 1. Activity Selection (`GR01ActivitySelection.java`)
- **Key Concept**: We are given $n$ activities with their start and end times. The goal is to select the maximum number of activities that can be performed by a single person, assuming they can only work on one activity at a time.
- **Greedy Strategy**: Sort all activities by their end times in ascending order. Always select the first activity. For the remaining activities, select an activity if its start time is greater than or equal to the end time of the last selected activity.
- **Time Complexity**: 
  - $O(n \log n)$ if activities are unsorted (due to sorting).
  - $O(n)$ if activities are already sorted by end times.
- **Space Complexity**: $O(n)$ to store activities with their start/end times.

### 3. Minimum Sum of Absolute Difference (`GR03MinimumSumDIff.java`)
- **Key Concept**: Given two arrays of equal size, pair elements such that the sum of the absolute differences of the paired elements is minimized.
- **Greedy Strategy**: Sort both arrays in ascending order and pair the elements at the same indices. Pairing the smallest elements of both arrays together minimizes the gap.
- **Time Complexity**: $O(n \log n)$ due to sorting.
- **Space Complexity**: $O(1)$ auxiliary space.

### 4. Longest Chain of Pairs (`GR04LongestChain.java`)
- **Key Concept**: Given $n$ pairs of numbers where the first number is always smaller than the second. A pair `(c, d)` can follow a pair `(a, b)` if `b < c`. Find the maximum length of such a chain.
- **Greedy Strategy**: This is an extension of the Activity Selection problem. Sort the pairs based on their second element (end time) in ascending order. Build the chain by adding a pair if its first element is greater than or equal to the second element of the previously selected pair.
- **Time Complexity**: $O(n \log n)$ due to sorting.
- **Space Complexity**: $O(1)$ auxiliary space.

### 5. Indian Coins (`GR05IndianCoins.java`)
- **Key Concept**: Find the minimum number of coins/notes required to make change for a given amount using the canonical Indian currency system: $1, 2, 5, 10, 20, 50, 100, 500, 2000$.
- **Greedy Strategy**: Sort the currency denominations in descending order. Iteratively select the largest denomination that is less than or equal to the remaining amount, subtract it, and repeat until the amount becomes zero.
- **Time Complexity**: $O(1)$ relative to the amount, since the number of coin denominations is fixed (9 denominations).
- **Space Complexity**: $O(1)$ auxiliary space.

### 6. Job Sequencing (`GR06JobSequencing.java`)
- **Key Concept**: Given a set of $n$ jobs where each job has a deadline and a profit if completed before the deadline. Schedule jobs to maximize total profit.
- **Greedy Strategy**: Sort all jobs in descending order of their profits. Allocate each job to the latest possible free slot before or at its deadline to keep earlier slots free for jobs with tighter deadlines.
- **Time Complexity**: $O(n \log n)$ for sorting, and $O(n \times d)$ to find free slots where $d$ is the max deadline.
- **Space Complexity**: $O(n)$ to store job sequence and track free time slots.

### 7. Chocola / Chocolate Bar Cutting (`GR06ChocolateBar.java`)
- **Key Concept**: Given a chocolate bar of size $n \times m$. We need to break it into $1 \times 1$ squares using horizontal and vertical cuts. Minimize the total breaking cost.
- **Greedy Strategy**: Sort both horizontal and vertical cut costs in descending order. Always perform the cut with the highest cost first. Making a cut splits the bar into more pieces, which multiplies the cost of any subsequent perpendicular cuts (e.g., cutting a piece vertically multiplies the cost of future horizontal cuts on those pieces).
- **Time Complexity**: $O(n \log n + m \log m)$ due to sorting horizontal and vertical cuts.
- **Space Complexity**: $O(1)$ auxiliary space.

---
*💡 **Greedy Strategy Tip**: When designing a greedy algorithm, sorting is often the key first step to organize choices (e.g., sorting by end time, cost, ratio, or weight).* 🎯
