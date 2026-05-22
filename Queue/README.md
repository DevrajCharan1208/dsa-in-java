# Queue in Java

This directory contains implementations of the **Queue** data structure (FIFO - First In, First Out) and related problems solved in Java. It covers custom implementations (using Arrays and LinkedLists), implementing a Queue using Stacks, and implementing a Stack using Queues.

## 📁 Directory Structure

| File | Type | Description |
|---|---|---|
| [`Q01UsingArray.java`](Q01UsingArray.java) | **Custom Implementation** | Queue implemented using a fixed-size array (elements shift left on removal). |
| [`Q02UsingLinkedList.java`](Q02UsingLinkedList.java) | **Custom Implementation** | Queue implemented from scratch using a Singly LinkedList tracking both head and tail. |
| [`Q03UsingTwoStacks.java`](Q03UsingTwoStacks.java) | **Problem / Class** | Queue implemented using two Stacks. |
| [`Q04StackUsingTwoQueues.java`](Q04StackUsingTwoQueues.java) | **Problem / Class** | Stack implemented using two Queues. |
| [`Q05FirstNonRepeatingLetter.java`](Q05FirstNonRepeatingLetter.java) | **Problem** | Finds the first non-repeating character in a stream of characters — O(n). |
| [`Q06InterleaveHalves.java`](Q06InterleaveHalves.java) | **Problem** | Interleaves the first half of a Queue with the second half — O(n). |
| [`Q07ReverseQueue.java`](Q07ReverseQueue.java) | **Problem** | Reverses the elements of a Queue using an auxiliary Stack — O(n). |
| [`Q08QueueUsingDeque.java`](Q08QueueUsingDeque.java) | **Custom Implementation** | Queue implemented using a double-ended queue (Deque). |
| [`Q08StackUsingDeque.java`](Q08StackUsingDeque.java) | **Custom Implementation** | Stack implemented using a double-ended queue (Deque). |

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

### 5. First Non-Repeating Character (`Q05FirstNonRepeatingLetter.java`)
- **Key Concept**: Maintain a frequency array of size 26 and a Queue. As characters are read from the stream, add them to the Queue and increment their frequency. Pop characters from the front of the Queue while their frequency is greater than 1 (meaning they are repeating). The front of the Queue will be the first non-repeating character (or '0' if the Queue becomes empty).
- **Time Complexity**: O(n) (each character is pushed and popped at most once)
- **Space Complexity**: O(n) for the queue, O(1) for the fixed frequency array

### 6. Interleave Halves of a Queue (`Q06InterleaveHalves.java`)
- **Key Concept**: Remove the first half of the elements from the queue and store them in a temporary queue. Then, alternately dequeue from the temporary queue and enqueue back, followed by dequeuing from the original queue and enqueuing back. This merges the two halves in an interleaved fashion.
- **Time Complexity**: O(n)
- **Space Complexity**: O(n) for the temporary queue

### 7. Reverse a Queue (`Q07ReverseQueue.java`)
- **Key Concept**: Dequeue all elements from the queue and push them onto an auxiliary Stack. Since the Stack is LIFO, popping elements from the Stack and enqueuing them back into the Queue reverses the order of the elements.
- **Time Complexity**: O(n)
- **Space Complexity**: O(n)

### 8. Queue Using Deque (`Q08QueueUsingDeque.java`)
- **Key Concept**: A Deque (Double Ended Queue) supports insertion and removal at both ends. We implement a FIFO queue by adding to the front of the deque (`addFirst`) and removing/peeking from the tail (`removeLast` / `getLast`).
- **Time Complexity**: 
  - Add: O(1)
  - Remove: O(1)
  - Peek: O(1)
- **Space Complexity**: O(n)

### 9. Stack Using Deque (`Q08StackUsingDeque.java`)
- **Key Concept**: We implement a LIFO stack using a Deque by performing all push, pop, and peek operations on the same end of the Deque (`addLast`, `removeLast`, `getLast`).
- **Time Complexity**: 
  - Push: O(1)
  - Pop: O(1)
  - Peek: O(1)
- **Space Complexity**: O(n)

---
*💡 **FIFO: First In, First Out**: Just like standing in a queue for movie tickets — the person who arrives first gets served first!* 🎟️
