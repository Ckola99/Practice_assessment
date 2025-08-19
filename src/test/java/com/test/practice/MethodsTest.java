package com.test.practice;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class MethodsTest {
	Methods method = new Methods();

	@Test
	public void testReverseString() {
		String expected =  "olleh";
		assertEquals(expected, method.reverseString("hello"));
	}

	@Test
	public void testReverseStringEmpty() {
		Exception ex = assertThrows(IllegalArgumentException.class, () -> {
			method.reverseString("");
		});
		assertEquals("Empty string.", ex.getMessage());
	}

	@Test
	public void testCountVowels() {
		String toTest = "I have vowels.";
		assertEquals(5, method.countVowels(toTest));
	}

	@Test
	public void testCountVowelsStringEmpty() {
		Exception ex = assertThrows(IllegalArgumentException.class, () -> {
			method.countVowels("");
		});
		assertEquals("Empty string.", ex.getMessage());
	}

	@Test
	public void testSumDigits() {
		assertEquals(10, method.sumDigits(1234));
	}

	@Test
	public void testFindMax() {
		int[] array = {4, 7, 100, 9, 3};
		int arrayLength = array.length;
		assertEquals(100, method.findMax(array, arrayLength));
	}

	@Test
	public void testIsPrime() {
		assertEquals(true, method.isPrime(13));
	}

	@Test
    	public void testGcd() {
        	assertEquals(6, method.gcd(48, 18));
        	assertEquals(1, method.gcd(101, 10));
        	assertEquals(12, method.gcd(36, 24));
        	assertEquals(7, method.gcd(7, 0));    // edge case
        	assertEquals(5, method.gcd(0, 5));    // edge case
        	assertEquals(13, method.gcd(13, 13)); // same numbers
    	}

	@Test
	public void testTitleCase() {
		assertEquals("Hello World", method.titleCase("hello world"));
	}

	@Test
	public void testUniqueChars() {
		assertTrue(method.uniqueChars("abcdef"));
		assertFalse(method.uniqueChars("hello"));
	}

	@Test
	public void anagramCheck() {
		assertTrue(method.anagramCheck("silent", "listen"));
		assertFalse(method.anagramCheck("hello", "world"));
	}

	@Test
	public void anagramCheckWithSpaces() {
		assertTrue(method.anagramCheck("New York Times", "monkeys write"));
	}

	@Test
	public void anagramCheckWithPunctuation() {
		assertTrue(method.anagramCheck("Eleven plus two!!!", "Twelve plus one..."));
	}

	@Test
	public void anagramCheckWithDifferingLengths() {
		assertFalse(method.anagramCheck("silent", "ego"));
	}

	@Test
	public void twoSum() {
		int arr[] = {0, 1};
		int arrToCheck[] = {2, 7, 11, 15};
		assertArrayEquals(arr, method.twoSum(arrToCheck, 9));
	}

	@Test
	public void rotateMatrix() {
		int arrResult[][] = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
		int arrInput[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

		assertArrayEquals(arrResult, method.rotateMatrix(arrInput));
	}

	@Test
	public void longestSubstringWithoutRepeating() {
		assertEquals(method.longestSubstringWithoutRepeating("pwwkew"), 3);
		assertEquals(method.longestSubstringWithoutRepeating("bbb"), 1);
		assertEquals(method.longestSubstringWithoutRepeating("abcabcbb"), 3);
	}

	@Test
    	public void testFizzBuzz_basicCase() {
        	List<String> expected = Arrays.asList("1", "2", "Fizz");
        	assertEquals(expected, method.fizzBuzz(3));
    	}

    	@Test
    	public void testFizzBuzz() {
        	assertEquals(Arrays.asList("1"), method.fizzBuzz(1));
    	}

    	@Test
    	public void testFizzBuzz_invalidInput() {
        	Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            	method.fizzBuzz(-5);
        	});
        	assertEquals("Number must be positive.", ex.getMessage());
    	}

    	@Test
    	public void testFizzBuzz_divisible(){
        	List<String> expected = Arrays.asList("1", "2", "Fizz", "4", "Buzz");
		assertEquals(expected, method.fizzBuzz(5));
    	}

    	@Test
    	public void testFibonacci_zero() {
        	assertEquals("", method.fibonacciSequence(0));
    	}

    	@Test
    	public void testFibonacci_one() {
        	assertEquals("", method.fibonacciSequence(0));
    	}

    	@Test
    	public void TestFibonacci() {
        	assertEquals("0 1 1 2 3 5 8", method.fibonacciSequence(7));
   	}

    	@Test
    	public void TestCalculate_add() {
        	assertEquals("13", method.calculate(10, 3, "+"));
    	}

    	@Test
    	public void TestCalculate_modulo() {
        	assertEquals("1", method.calculate(10, 3, "%"));
    	}

    	@Test
    	public void TestCalculate_multiply() {
        	assertEquals("6", method.calculate(3, 2, "*"));
    	}

    	@Test
    	public void TestCalculate_subtract() {
        	assertEquals("3", method.calculate(9, 6, "-"));
    	}

    	@Test
    	public void TestCalcException_divide() {
        	Exception ex = assertThrows(ArithmeticException.class, () -> {
            		method.calculate(2, 0, "/");
       		});
        	assertEquals("Cannot divide by 0.", ex.getMessage());
    	}

    	@Test
    	public void TestCalcException_modulo() {
        	Exception ex = assertThrows(ArithmeticException.class, () -> {
            		method.calculate(2, 0, "%");
        	});
        	assertEquals("Cannot modulo by 0.", ex.getMessage());
    	}

    	@Test
    	public void TestIsPalindrome() {
        	assertTrue(method.isPalindrome("racecar"));
       		assertFalse(method.isPalindrome("hello"));
    	}

    	@Test
    	public void TestFactorial() {
        	assertEquals(120, method.factorial(5));
    	}

    	@Test
    	public void TestFactorial1() {
        	assertEquals(1, method.factorial(1));
    	}

    	@Test
    	public void TestFactorial0() {
        	assertEquals(1, method.factorial(0));
    	}
}
