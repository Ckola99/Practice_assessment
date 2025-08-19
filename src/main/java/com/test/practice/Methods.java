package com.test.practice;

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
public class Methods {

	public String reverseString(String word) {
		if (word.isEmpty()) {
			throw new IllegalArgumentException("Empty string.");
		}

		StringBuilder reversed = new StringBuilder();

		for (int i = word.length() - 1; i >= 0; i--) {
			reversed.append(word.charAt(i));
		}

		return reversed.toString();
	}

	public int countVowels(String word) {
		if (word.isEmpty()) {
			throw new IllegalArgumentException("Empty string.");
		}

		String vowelList = "aeiou";
		word = word.toLowerCase();
		int vowelCount = 0;

		for (int i  = 0; i < word.length(); i++) {
			char letter = word.charAt(i);
			if (vowelList.indexOf(letter) != -1) {
				vowelCount += 1;
			}
		}

		return vowelCount;
	}

	public int sumDigits(int number) {
		int sum = 0;

		while ( number > 0) {
			sum += number % 10;
			number /= 10;
		}

		return sum;
	}

	public int findMax(int[] numbers, int n) {
		// int max = numbers[0];

		// for (int n : numbers) {
		// 	if (n > max) {
		// 		max = n;
		// 	}
		// }
		// return max;

		if (n == 1) return numbers[0];

		return Math.max(numbers[n - 1], findMax(numbers, n - 1));

	}

	public boolean isPrime(int n) {
		if (n < 2) return false;

		for (int i = 2; i < Math.sqrt(n); i++){
			if (n % i == 0) {
				return false;
			}

		}
		return true;
	}

	public int gcd(int n, int m) {
		// if (m == 0) {
		// 	return n;
		// } else {
		// 	return gcd(m, n % m);
		// }

		while(m > 0) {
			int r = n % m;
			n = m;
			m = r;
		}

		return n;
	}

	public String titleCase(String sentence) {
		if (sentence == null || sentence.isEmpty()) return sentence;

		StringBuilder result = new StringBuilder();
		boolean capitalizeNext = true;

		for (char c : sentence.toCharArray()) {
			if (Character.isWhitespace(c)) {
				result.append(c);
				capitalizeNext = true;
			} else if (capitalizeNext) {
				result.append(Character.toUpperCase(c));
				capitalizeNext = false;
			} else {
				result.append(Character.toLowerCase(c));
			}
		}

		return result.toString();
	}

	public  List<String> fizzBuzz(int n) {

        if (n <= 0) {
            throw new IllegalArgumentException("Number must be positive.");
        }

        List<String> fizzBuzzList = new ArrayList<>();

        for (int i = 1; i <= n; i++){
            if (i % 3 == 0 && i % 5 == 0) {
                fizzBuzzList.add("FizzBuzz");
            } else if (i % 3 == 0) {
                fizzBuzzList.add("Fizz");
            } else if (i % 5 == 0) {
                fizzBuzzList.add("Buzz");
            } else {
                fizzBuzzList.add(Integer.toString(i));
            }
        }

        return fizzBuzzList;
    }

    public String fibonacciSequence(int n) {
        if (n <= 0) {
            return "";
        }

        StringBuilder fibList = new StringBuilder();
        int a = 0;
        int b = 1;

        for (int i = 0; i < n; i++) {
            fibList.append(a);

            if (i < n - 1) fibList.append(" ");

            int nextNum  = a + b;
            a = b;
            b = nextNum;
        }

        return fibList.toString();
    }


    public String calculate(int a, int b, String Operator){
        int result = 0;

        switch (Operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                try {
                    result = a / b;
                } catch (ArithmeticException e) {
                    throw new ArithmeticException("Cannot divide by 0.");
                }
                break;
            case "%":
                try {
                    result = a % b;
                } catch (ArithmeticException e) {
                    throw new ArithmeticException("Cannot modulo by 0.");
                }
                break;
            default:
                throw new IllegalArgumentException("Invalid operator");
        }

        return Integer.toString(result);
    }



    public String drawTriangle(int n){
        StringBuilder triangle = new StringBuilder();

        for (int i = 0; i < n; i++){
            for (int j = 0; j <= i; j++){
                triangle.append("*");
            }
            if (i < n - 1) {
            triangle.append("\n");
            }
        }
        return triangle.toString();
    }

    public boolean isPalindrome(String str){
        if (str == null) return false;

        String clean = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        int left  = 0;
        int right = clean.length() - 1;

        while(left < right) {
            if (clean.charAt(left) != clean.charAt(right)){
                return false;
            }
            left++;
            right --;
        }

        return true;
    }

    public long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }

        if (n == 0){
            return 1;
        }

        return n * factorial(n - 1);
    }

	public boolean uniqueChars(String word) {
		// char[] chars = word.toCharArray();
		// Arrays.sort(chars);

		// for (int i = 0; i < word.length(); i++){
		// 	if (chars[i] == chars[i + 1]) return false;
		// }

		// return true;

		Set<Character> seen = new HashSet<>();

		for (char c : word.toCharArray()) {
			if (!seen.add(c)) {
				return false;
			}
		}
		 return true; // larger strings solution

	}

	public boolean anagramCheck(String str1, String str2) {
		str1 = str1.replaceAll("[^a-zA-Z]", "").toLowerCase();
		str2 = str2.replaceAll("[^a-zA-Z]", "").toLowerCase();

		if (str1.length() != str2.length()) return false;

		// char[] chars1 = str1.toCharArray();
		// char[] chars2 = str2.toCharArray();

		// Arrays.sort(chars1);
		// Arrays.sort(chars2);

		// return Arrays.equals(chars1, chars2); // o(n log(n))

		int[] freq = new int[26];

		for (char c: str1.toCharArray()){
			freq[c - 'a']++;
		}

		for (char c: str2.toCharArray()){
			freq[c - 'a']--;
		}

		for (int count: freq){
			if (count != 0) return false;
		}

		return true;  // o(n) solution quicker
	}

	public int[] twoSum(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[]{i, j};
				}
			}
		}

		return new int[]{};
	}

	public int[][] rotateMatrix(int[][] matrix) {
		int n = matrix.length;
		// int[][] rotated = new int[n][n];

		// for (int i = 0; i < n; i++) {
		// 	for (int j = 0; j < n; j++){
		// 		rotated[j][n - 1 - i] = matrix[i][j];
		// 	}
		// }

		// return rotated;

		//in place solution
		for (int i = 0; i < n - 1; i++){
			for (int j = i + 1; j < n; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}

		for (int i = 0; i < n; i++) {
			reverseRow(matrix[i]);
		}

		return matrix;
	}

	public static void reverseRow(int[] row) {
		int left = 0, right = row.length - 1;

		while(left < right) {
			int temp = row[left];
			row[left] = row[right];
			row[right] = temp;
			left++;
			right--;
		}
	}

	public int longestSubstringWithoutRepeating(String str) {
		int left = 0, maxLen = 0;
		Set<Character> seen = new HashSet<>();

		for (int right = 0; right < str.length(); right++){
			char current = str.charAt(right);

			while (seen.contains(current)) {
				seen.remove(str.charAt(left));
				left++;
			}

			seen.add(current);
			maxLen = Math.max(maxLen, right - left + 1);
		}

		return maxLen;
	}
}




//        0  1  2

//    0  [1][2][3]
//    1  [4][5][6]
//    2  [7][8][9]
