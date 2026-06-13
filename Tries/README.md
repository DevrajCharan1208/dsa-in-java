# Tries (Prefix Trees) in Java

This directory contains implementations of the **Trie** data structure, which is highly optimized for string storage and prefix-based searching operations.

## 📁 Directory Structure

| File | Type | Description |
|---|---|---|
| [`T01CreatingTrie.java`](T01CreatingTrie.java) | **Implementation** | The foundational Trie structure. Contains the `Node` class (array of 26 children, `eow` flag), along with iterative `insert(word)` and `search(word)` algorithms. |
| [`T02WordBreakProblem.java`](T02WordBreakProblem.java) | **Problem** | Solves the classic **Word Break Problem**. Uses a Trie to efficiently check if a given string can be segmented into a space-separated sequence of dictionary words. |
| [`T03PrefixProblem.java`](T03PrefixProblem.java) | **Problem** | Finds the shortest unique prefix to represent every word in an array. Modifies the Trie node to track a `freq` variable during insertion. |
| [`T04StartsWith.java`](T04StartsWith.java) | **Implementation** | Implements the `startsWith(prefix)` utility. Similar to `search()`, but does not require the End Of Word (`eow`) flag to be true at the last matched character. |
| [`T05UniqueSubstrings.java`](T05UniqueSubstrings.java) | **Problem** | Finds the total number of unique substrings for a given string. Achieves this by inserting all suffixes of the string into a Trie; the total number of nodes in the Trie (including the root) equals the number of unique substrings. |
| [`T06LongestPrefixesWord.java`](T06LongestPrefixesWord.java) | **Problem** | Finds the longest word in an array that can be built one character at a time by other words in the array. Uses Trie DFS with backtracking to explore all valid `eow` paths. |

---

## 🛠️ Core Concepts & Complexities

### The Trie Data Structure
A Trie (pronounced "try") is a k-ary search tree used for locating specific keys from within a set, where keys are usually strings. Instead of storing entire strings in nodes, the path down the tree represents the string.

**Node Structure (`T01`)**:
```java
static class Node {
    Node[] children = new Node[26]; // For a-z lowercase English letters
    boolean eow = false; // End Of Word flag
}
```

### Time Complexities
Let $L$ be the length of the word being processed.
- **Insertion**: $O(L)$ - You traverse/create nodes proportional to the string length.
- **Searching**: $O(L)$ - You traverse existing nodes proportional to the string length.
- **Prefix Matching (`startsWith`)**: $O(L)$
- **Space Complexity**: $O(N \times L)$ in the worst case, where $N$ is the number of words, if there are no shared prefixes.

### Key Patterns

1. **Prefix Sharing**: 
   Words with the same prefix share the same ancestor nodes. This makes Tries vastly more space-efficient and search-efficient than HashMaps for prefix-matching tasks (like Autocomplete).

2. **Suffix Insertion for Substrings (`T05`)**: 
   A very powerful string property: **All unique substrings of a string are simply all prefixes of all suffixes of that string.** By inserting all suffixes of a string into a Trie, every node created represents a unique prefix of some suffix—thus, counting the nodes gives the count of unique substrings.
