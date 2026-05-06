# Bit Manipulation in Java

This directory contains implementations of fundamental bit manipulation operations and tricks in Java.

## 📝 Topics Covered

| No. | Problem | Description | Solution Link |
|---|---|---|---|
| 1 | **Odd or Even** | Check if a number is odd or even using bitwise AND (`n & 1`) — O(1). | [`BM01OddOrEven.java`](BM01OddOrEven.java) |
| 2 | **Get i-th Bit** | Extract the i-th bit of a number using `n & (1 << i)` — O(1). | [`BM02GetIthBit.java`](BM02GetIthBit.java) |
| 3 | **Set i-th Bit** | Set (turn ON) the i-th bit using `n \| (1 << i)` — O(1). | [`BM03SetIthBit.java`](BM03SetIthBit.java) |
| 4 | **Clear i-th Bit** | Clear (turn OFF) the i-th bit using `n & ~(1 << i)` — O(1). | [`BM04ClearIthBit.java`](BM04ClearIthBit.java) |
| 5 | **Power of Two** | Check if a number is a power of 2 using `(n & (n-1)) == 0` — O(1). | [`BM05IsPowerOfTwo.java`](BM05IsPowerOfTwo.java) |
| 6 | **Count Set Bits** | Count the number of 1-bits by right-shifting and checking LSB — O(log n). | [`BM06CountSetBits.java`](BM06CountSetBits.java) |
| 7 | **Fast Exponentiation** | Compute `base^exp` using binary exponentiation (exponentiation by squaring) — O(log n). | [`BM07FastExponent.java`](BM07FastExponent.java) |

## 📌 Bitwise Operator Quick Reference

| Operator | Symbol | Example | Result |
|----------|--------|---------|--------|
| AND | `&` | `5 & 3` → `101 & 011` | `001` = 1 |
| OR | `\|` | `5 \| 3` → `101 \| 011` | `111` = 7 |
| XOR | `^` | `5 ^ 3` → `101 ^ 011` | `110` = 6 |
| NOT | `~` | `~5` → `~00000101` | `11111010` = -6 |
| Left Shift | `<<` | `1 << 3` | `1000` = 8 |
| Right Shift | `>>` | `8 >> 2` | `10` = 2 |
