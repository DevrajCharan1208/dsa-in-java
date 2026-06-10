# Hashing in Java

This directory covers the core concepts of **Hashing**, including custom implementations of HashMaps and standard problem-solving patterns using `HashMap` and `HashSet` in Java.

## 📁 Directory Structure

| File | Type | Description |
|---|---|---|
| [`HS01HashMapImplementation.java`](HS01HashMapImplementation.java) | **Implementation** | A complete, generic custom implementation of a `HashMap` using an Array of LinkedLists (Separate Chaining). Includes `put`, `get`, `remove`, `containsKey`, `keySet`, and automatic `rehash()` when the load factor exceeds `2.0`. |
| [`HS02MajorityElement.java`](HS02MajorityElement.java) | **Problem** | Finds all elements in an array that appear more than $N/3$ times using frequency counting via a `HashMap`. |
| [`HS03ValidAnagram.java`](HS03ValidAnagram.java) | **Problem** | Checks if two strings are valid anagrams of each other by tracking character frequencies in a `HashMap`. |
| [`HS04CountDistinctElements.java`](HS04CountDistinctElements.java) | **Problem** | Counts the number of distinct elements in an array using a `HashSet`. |
| [`HS05HashSet.java`](HS05HashSet.java) | **Concept** | Introduction to Java's built-in `HashSet`, demonstrating basic operations (`add`, `remove`) and iteration (using enhanced `for` loops and `Iterator`). |
| [`HS06UnionAndIntersection.java`](HS06UnionAndIntersection.java) | **Problem** | Finds the size of the Union and Intersection of two arrays using a `HashSet`. |
| [`HS07ItineraryForTickets.java`](HS07ItineraryForTickets.java) | **Problem** | Reconstructs a full travel itinerary from a list of one-way tickets using a reverse-mapping strategy to find the starting point. |
| [`HS08LargestSubArrayWithSum0.java`](HS08LargestSubArrayWithSum0.java) | **Problem** | Finds the length of the largest subarray with a sum of 0 using a `HashMap` to store prefix sums and their earliest seen indices. |
| [`HS09SubArraysHavingSumK.java`](HS09SubArraysHavingSumK.java) | **Problem** | Counts the total number of continuous subarrays that sum up to exactly $K$. Uses a `HashMap` to store prefix sums and their occurrence frequencies. |

---

## 🛠️ Core Concepts & Time Complexities

### Hashing Basics
Hashing is a technique to uniquely identify objects and store them in a way that allows for $O(1)$ average time complexity for insertions, deletions, and lookups. 

### Java's `HashMap` & `HashSet`
- **`HashMap<K, V>`**: Stores key-value pairs. Keys are unique. Internally uses an array of Nodes/LinkedLists.
- **`HashSet<E>`**: Stores unique elements. Internally implemented using a `HashMap` where the values are dummy objects.
- **Time Complexity**: Average case $O(1)$ for `put`, `get`, `remove`, and `containsKey`. Worst case $O(N)$ (if many collisions occur, though Java 8+ optimizes this with Red-Black trees).

### Linked & Tree Variants
*(Note: Code for these isn't explicitly included to avoid redundant boilerplate, but they are crucial for specific DSA scenarios)*
- **`LinkedHashMap` / `LinkedHashSet`**: Maintains the **insertion order** of elements. They use a Doubly-Linked List across all elements in the hash table. 
  - *Time Complexity*: $O(1)$ operations, just like standard Hash structures, but with slightly higher constant overhead.
- **`TreeMap` / `TreeSet`**: Maintains elements in **sorted (ascending) order** based on their keys. Internally implemented using a **Red-Black Tree** (a self-balancing Binary Search Tree).
  - *Time Complexity*: $O(\log N)$ for `put`, `get`, `remove`, and `containsKey`. Use only when ordering is strictly required.

### Standard Patterns using Hashing

1. **Frequency Maps (`HS02`, `HS03`)**
   - Storing the count of occurrences of elements/characters.
   - Ideal for Anagrams, Majority Elements, and Duplicates.
   - Code trick: `map.put(key, map.getOrDefault(key, 0) + 1);`

2. **Uniqueness & Sets (`HS04`, `HS06`)**
   - Using a `HashSet` to filter out duplicates.
   - Ideal for finding Union, Intersection, or counting distinct elements.

3. **Prefix Sum + Hashing (`HS08`, `HS09`)**
   - *Extremely powerful pattern* for subarray problems.
   - Keep a running `sum`.
   - To find a subarray with sum $K$, check if `sum - K` exists in the HashMap.
   - Map stores `(Prefix Sum -> Index)` if we want the **length** of the subarray.
   - Map stores `(Prefix Sum -> Frequency)` if we want the **count** of such subarrays.
