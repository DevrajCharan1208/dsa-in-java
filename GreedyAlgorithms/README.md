# Greedy Algorithms in Java

This directory contains implementations of various **Greedy Algorithms** in Java. Greedy algorithms build up a solution piece by piece, always choosing the next piece that offers the most obvious and immediate (local) benefit, hoping it leads to a global optimum.

## 📁 Directory Structure

| File | Type | Description |
|---|---|---|
| [`GR01ActivitySelection.java`](GR01ActivitySelection.java) | **Problem** | Maximizes the number of activities that can be performed by a single person — O(n log n). |
| [`GR02FractionKnapsack.java`](GR02FractionKnapsack.java) | **Problem** | Maximizes the total value in a knapsack by taking fractions of items — O(n log n). |

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

### 2. Fractional Knapsack (`GR02FractionKnapsack.java`)
- **Key Concept**: Given weights and values of $n$ items, we need to put these items in a knapsack of capacity $W$ to get the maximum total value. Unlike the 0-1 Knapsack problem, we are allowed to break items (i.e., we can take a fraction of an item).
- **Greedy Strategy**: Calculate the value-to-weight ratio ($\text{value}/\text{weight}$) for each item. Sort items in descending order of this ratio. Pick the item with the highest ratio fully. If the capacity is not enough to take the whole item, take the fraction that fits and fill the knapsack.
- **Time Complexity**: $O(n \log n)$ to calculate ratios and sort items.
- **Space Complexity**: $O(n)$ to store item ratios and metadata.

---
*💡 **Greedy Strategy Tip**: When designing a greedy algorithm, sorting is often the key first step to organize choices (e.g., sorting by end time, cost, ratio, or weight).* 🎯
