🔥 Java Practice Assessment

In this assessment, you are required to implement a set of Java functions that demonstrate your understanding of fundamentals (loops, recursion, control flow, string/list manipulation) and extend your skills with some algorithmic challenges.


📝 Questions
1. reverseString(String str): String

Description:
Given a string, return its reverse.

Examples:

reverseString("hello") → "olleh"
reverseString("Java")  → "avaJ"

2. countVowels(String str): int

Description:
Count the number of vowels (a, e, i, o, u) in the given string. Case-insensitive.

Examples:

countVowels("Hello World") → 3
countVowels("AEIOU")       → 5

3. sumOfDigits(int n): int

Description:
Return the sum of digits of an integer.

Examples:

sumOfDigits(1234) → 10   // 1+2+3+4
sumOfDigits(987)  → 24

4. findMax(int[] arr): int

Description:
Return the maximum element in the array.

Examples:

findMax([3, 7, 2, 9, 5]) → 9

5. isPrime(int n): boolean

Description:
Return true if n is a prime number, otherwise false.

Examples:

isPrime(7)  → true
isPrime(12) → false

6. gcd(int a, int b): int

Description:
Find the greatest common divisor (GCD) of two integers using the Euclidean Algorithm.

Examples:

gcd(54, 24) → 6

7. toTitleCase(String str): String

Description:
Convert a sentence to title case (each word starts with a capital letter).

Examples:

toTitleCase("hello world") → "Hello World"
toTitleCase("java is fun") → "Java Is Fun"

8. uniqueChars(String str): boolean

Description:
Return true if the string contains only unique characters, false if there are duplicates.

Examples:

uniqueChars("abcdef") → true
uniqueChars("hello")  → false

9. `fizzBuzz(int n): List<String>`


**Parameters**:
n — The number up to which the FizzBuzz sequence should be generated. Must be a positive integer.

**Returns**:
A List<String> containing n elements that represent the FizzBuzz output from 1 to n.

- If the number is divisible by both 3 and 5, add "FizzBuzz" to the list.

- If the number is divisible by only 3, add "Fizz" to the list.

- If the number is divisible by only 5, add "Buzz" to the list.

- If the number is not divisible by 3 or 5, add the number itself as a string.

e.g: `fizzBuzz(15)`
```java
["1", "2", "Fizz", "4", "Buzz",
  "Fizz", "7", "8", "Fizz", "Buzz",
  "11", "Fizz", "13", "14", "FizzBuzz"
]
```

---

10. `fibonacciSequence(int n): String`

**Parameters**:
n — The number of Fibonacci numbers to generate. Must be a non-negative integer.

**Returns**:
A String representing the first n numbers in the Fibonacci sequence, separated by a single space.

The Fibonacci sequence starts from 0 and 1, and each subsequent number is the sum of the previous two.

If n == 0, return an empty string.
If n == 1, return "0".

e.g: ``fibonnaciSequence(7)``
```java
"0 1 1 2 3 5 8"
```

---

11. `calculate(int a, int b, String operator): String`

**Parameters**:

- a — The first integer operand.

- b — The second integer operand.

- operator — The arithmetic operation to apply. Supported values:

    ` "+", "-", "*", "/", "%"`

**Returns**:

A String representing the result of the arithmetic operation.

e.g:

```java
calculate(10, 3, "+")  // "13"
calculate(10, 3, "%")  // "1"
calculate(10, 3, "/")  // "3"
```
---

12. `drawTriangle(int n): String`

**Parameters**:

n — A positive integer representing the number of rows in the triangle.

**Returns**:

A String representation of a left-aligned triangle made of asterisks (*), with one asterisk on the first row, two on the second, and so on.

e.g: ``drawTriangle(3)``
```java
"
*
**
***"
```

---

13. `ìsPalindrome(String str): boolean`

**Parameters**:
string — The string to check.

**Returns**:
true if the string reads the same forwards and backwards, false otherwise.

Palindrome comparison is case-insensitive.

Ignore punctuation — "madam" is valid, "Madam" is valid.

e.g
```java
isPalindrome("racecar")     // true
isPalindrome("Racecar")     // true
isPalindrome("hello")       // false
isPalindrome("a")           // true

```

---

14. `factorial(int n): long`

**Parameters**:

n — A non-negative integer representing the number to compute the factorial of.

**Returns**:

A long representing the factorial of n. The factorial of a number n (denoted as n!) is the product of all positive integers less than or equal to n.

#### Defintion

```
n! = n × (n - 1) × (n - 2) × ... × 1
```

e.g: ``factorial(5)``

```java
5 × 4 × 3 × 2 × 1 = 120
```

🌟 Challenge Questions (Level Up)
15. anagramCheck(String s1, String s2): boolean

Description:
Check if two strings are anagrams (contain the same letters, case-insensitive, ignoring spaces/punctuation).

Examples:

anagramCheck("listen", "silent") → true
anagramCheck("hello", "world")   → false

16. twoSum(int[] nums, int target): List<Integer>

Description:
Return the indices of the two numbers in the array that add up to the target. If none, return an empty list.

Examples:

twoSum([2, 7, 11, 15], 9) → [0, 1]
twoSum([3, 2, 4], 6)      → [1, 2]

17. rotateMatrix(int[][] matrix): int[][]

Description:
Rotate a square matrix (NxN) 90 degrees clockwise.

Example:

Input:

1 2 3
4 5 6
7 8 9


Output:

7 4 1
8 5 2
9 6 3

18. longestSubstringWithoutRepeating(String str): int

Description:
Return the length of the longest substring without repeating characters.

Examples:

longestSubstringWithoutRepeating("abcabcbb") → 3  // "abc"
longestSubstringWithoutRepeating("bbbbb")    → 1  // "b"
longestSubstringWithoutRepeating("pwwkew")   → 3  // "wke"


✅ The first 8 questions are fundamental practice (like your consolidation test).
🌟 The last 4 questions are algorithmic challenges that show up in real coding interviews.
