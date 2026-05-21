# Queue in Java

This directory contains implementations of the **Queue** data structure (FIFO - First In, First Out) and related problems solved in Java. It covers custom implementations (using Arrays and LinkedLists), implementing a Queue using Stacks, and implementing a Stack using Queues.

## 📁 Directory Structure

| File | Type | Description |
|---|---|---|
| [`Q01UsingArray.java`](Q01UsingArray.java) | **Custom Implementation** | Queue implemented using a fixed-size array (elements shift left on removal). |
| [`Q02UsingLinkedList.java`](Q02UsingLinkedList.java) | **Custom Implementation** | Queue implemented from scratch using a Singly LinkedList tracking both head and tail. |
| [`Q03UsingTwoStacks.java`](Q03UsingTwoStacks.java) | **Problem / Class** | Queue implemented using two Stacks. |
| [`Q04StackUsingTwoQueues.java`](Q04StackUsingTwoQueues.java) | **Problem / Class** | Stack implemented using two Queues. |

---

## 🛠️ Queue Operations (FIFO)

A Queue is a linear data structure that follows the **First In, First Out (FIFO)** principle. The key operations include:

| Operation | Description | Time Complexity (Array) | Time Complexity (LinkedList) |
|---|---|---|---|
| **`add(data)`** / **`enqueue`** | Inserts an element at the rear (tail) of the queue. | O(1) | O(1) |
| **`remove()`** / **`dequeue`** | Removes and returns the front (head) element of the queue. | O(n) (due to element shifting) | O(1) |
| **`peek()`** | Returns the front element without removing it. | O(1) | O(1) |
| **`isEmpty()`** | Checks if the queue is empty. | O(1) | O(1) |

---

## 📝 Problem Summaries

### 1. Queue using Array (`Q01UsingArray.java`)
- **Key Concept**: Uses a fixed-size array and a `rear` index. Inserting is done at `arr[rear]`. Removing is done at index 0, which requires shifting all remaining elements to the left by one position to fill the gap.
- **Time Complexity**: 
  - Add: O(1)
  - Remove: O(n)
  - Peek: O(1)
- **Space Complexity**: O(n)

### 2. Queue using LinkedList (`Q02UsingLinkedList.java`)
- **Key Concept**: Uses a custom Singly LinkedList. Tracks both `head` (front) and `tail` (rear) nodes. Enqueueing links new nodes to `tail.next` and updates `tail`, whereas dequeueing advances `head` to `head.next`. This eliminates the need for O(n) element shifting.
- **Time Complexity**: 
  - Add: O(1)
  - Remove: O(1)
  - Peek: O(1)
- **Space Complexity**: O(n)

### 3. Queue using Two Stacks (`Q03UsingTwoStacks.java`)
- **Key Concept**: Implements a FIFO queue using two LIFO stacks. When adding, we pop all elements from Stack 1 to Stack 2, push the new element to Stack 1, and then pop everything back to Stack 1. This keeps the oldest elements at the top of Stack 1.
- **Time Complexity**: 
  - Add: O(n)
  - Remove: O(1)
  - Peek: O(1)
- **Space Complexity**: O(n)

### 4. Stack using Two Queues (`Q04StackUsingTwoQueues.java`)
- **Key Concept**: Implements a LIFO stack using two FIFO queues. Pushing is O(1) (simply append to whichever queue is currently non-empty). Popping/peeking is O(n) because we must shift `n-1` elements to the other queue to retrieve the last-inserted element.
- **Time Complexity**: 
  - Push: O(1)
  - Pop: O(n)
  - Peek: O(n)
- **Space Complexity**: O(n)

---
*💡 **FIFO: First In, First Out**: Just like standing in a queue for movie tickets — the person who arrives first gets served first!* 🎟️
