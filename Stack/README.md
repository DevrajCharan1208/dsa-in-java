# Stack in Java

This directory contains implementations of the **Stack** data structure (LIFO - Last In, First Out) and related algorithmic problems solved in Java. It covers both custom implementations (using ArrayList and LinkedList) and algorithms using Java's built-in `java.util.Stack`.

## 📁 Directory Structure

| File | Type | Description |
|---|---|---|
| [`SK01UsingArrayList.java`](SK01UsingArrayList.java) | **Custom Implementation** | Stack implemented using an `ArrayList`. |
| [`SK02UsingLinkedList.java`](SK02UsingLinkedList.java) | **Custom Implementation** | Stack implemented from scratch using a custom `LinkedList` (Node chain). |
| [`SK03PushAtBottom.java`](SK03PushAtBottom.java) | **Problem** | Recursively pushes an element to the bottom of a Stack — O(n). |
| [`SK04ReverseString.java`](SK04ReverseString.java) | **Problem** | Reverses a string using a Stack — O(n). |
| [`SK05ReverseStack.java`](SK05ReverseStack.java) | **Problem** | Reverses a stack in-place using recursion — O(n²). |
| [`SK06StockSpan.java`](SK06StockSpan.java) | **Problem** | Calculates stock span using a Monotonic Stack — O(n). |
| [`SK07NextGreaterElement.java`](SK07NextGreaterElement.java) | **Problem** | Finds the next greater element for each array element using a Monotonic Stack — O(n). |
| [`SK08ValidParenthesis.java`](SK08ValidParenthesis.java) | **Problem** | Validates parentheses symbols matching inside a string — O(n). |
| [`SK09DuplicateParenthesis.java`](SK09DuplicateParenthesis.java) | **Problem** | Detects redundant / duplicate parenthesis in an expression — O(n). |
| [`SK10MaxAreaHistogram.java`](SK10MaxAreaHistogram.java) | **Problem** | Finds the largest rectangular area in a histogram using monotonic stacks — O(n). |

---

## 🛠️ Stack Operations (LIFO)

A Stack is a linear data structure that follows the **Last In, First Out (LIFO)** principle. The key operations include:

| Operation | Description | Time Complexity |
|---|---|---|
| **`push(data)`** | Inserts an element at the top of the stack. | O(1) |
| **`pop()`** | Removes and returns the top element of the stack. | O(1) |
| **`peek()`** | Returns the top element without removing it. | O(1) |
| **`isEmpty()`** | Checks if the stack is empty. | O(1) |

---

## 📝 Problem Summaries

### 1. Push at Bottom (`SK03PushAtBottom.java`)
- **Key Concept**: Using the call stack (recursion) to temporarily hold all elements of a stack, inserting the new element at the bottom, and pushing the held elements back on top as the recursive calls backtrack.
- **Time Complexity**: O(n)
- **Space Complexity**: O(n) due to recursion stack

### 2. Reverse a String (`SK04ReverseString.java`)
- **Key Concept**: Pushing every character of a string onto a Stack, then popping them off one-by-one. Since Stack is LIFO, popping yields the characters in reverse order.
- **Time Complexity**: O(n)
- **Space Complexity**: O(n)

### 3. Reverse a Stack (`SK05ReverseStack.java`)
- **Key Concept**: Pop the top element, recursively reverse the remaining stack, and then insert the popped element at the bottom using `pushAtBottom()`.
- **Time Complexity**: O(n²)
- **Space Complexity**: O(n) due to recursion stack

### 4. Stock Span Problem (`SK06StockSpan.java`)
- **Key Concept**: A **Monotonic Stack** stores indices of stock prices in a strictly decreasing order of their prices. For each day, we pop indices from the stack while today's price is greater than the stack top's price. Today's span is `i - stack.peek()` (or `i + 1` if stack is empty).
- **Time Complexity**: O(n) (since each index is pushed and popped at most once)
- **Space Complexity**: O(n)

### 5. Next Greater Element (`SK07NextGreaterElement.java`)
- **Key Concept**: Traverse the array from right to left. Maintain a **Monotonic Stack** containing elements in increasing order from top to bottom. Pop elements from the stack that are smaller than or equal to the current element. The stack's top is the next greater element (or `-1` if empty).
- **Time Complexity**: O(n)
- **Space Complexity**: O(n)

### 6. Valid Parentheses (`SK08ValidParenthesis.java`)
- **Key Concept**: Push opening brackets (`(`, `{`, `[`) onto the stack. For any closing bracket, check if the stack is non-empty and the top matches the corresponding opening bracket. If it does, pop it; otherwise, the string is invalid. At the end, the stack must be empty.
- **Time Complexity**: O(n)
- **Space Complexity**: O(n)

### 7. Duplicate Parentheses (`SK09DuplicateParenthesis.java`)
- **Key Concept**: Push characters onto the stack until we encounter a closing parenthesis `)`. When `)` is found, pop characters until the opening parenthesis `(` is reached. If the count of popped characters is less than 1, it means we have redundant/duplicate parentheses (like `((a+b))` or `()`). Otherwise, pop the opening parenthesis and continue.
- **Time Complexity**: O(n)
- **Space Complexity**: O(n)

### 8. Largest Rectangle in Histogram (`SK10MaxAreaHistogram.java`)
- **Key Concept**: For each bar in the histogram, find the index of the first smaller bar to its right (Next Smaller Right - NSR) and to its left (Next Smaller Left - NSL) using monotonic stacks. The maximum width of a rectangle containing bar `i` is `nsr[i] - nsl[i] - 1`. The area is `heights[i] * width`.
- **Time Complexity**: O(n)
- **Space Complexity**: O(n)

---
*💡 **Monotonic Stack Pattern**: A stack that keeps elements in a specific sorted order (increasing or decreasing). It's incredibly powerful for "next greater/smaller" or "previous greater/smaller" queries in linear time!*

---
*LIFO: The last one in is the first one out — just like a stack of plates!* 🥞
