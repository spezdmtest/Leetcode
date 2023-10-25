package com.griddynamics;



import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void ReverseArray() {
        int[] array = {1, 2, 3, 4, 5, 6};
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(reverseArray(array)));

    }

    private int[] reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        return array;
    }


    @Test
    public void Palindrome() {
//        assertTrue(true);
        System.out.println(isPalindrome(121));
    }

    private boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int invertNumber = 0;
        int temp0fX = x;

        while (temp0fX != 0) {
            invertNumber = invertNumber * 10 + temp0fX % 10;
            temp0fX = temp0fX / 10;
        }
        return invertNumber == x;
    }

    @Test
    public void PlusOne() {
        int[] array = {1, 2, 3};
        int[] array2 = {9, 9, 9};
        int[] array3 = {9};

        System.out.println(Arrays.toString(plusOne(array)));
        System.out.println(Arrays.toString(plusOne(array2)));
        System.out.println(Arrays.toString(plusOne(array3)));
    }

    private int[] plusOne(int[] digits) {
//        int index = digits.length - 1;
//        digits[index]++;
//        return digits;
//
        int index = digits.length - 1;
        while (digits[index] == 9) {
            digits[index] = 0;
            index--;

            if (index < 0) {
                digits = new int[digits.length + 1];
                digits[0] = 1;
                break;
            }
        }
        if (index > 0) {
            digits[index]++;
        }
        return digits;
    }

    @Test
    public void ReverseInteger() {
        System.out.println(reverse(155));
    }

    private int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int pop = x % 10;
            x = x / 10;
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }
            result = result * 10 + pop;
        }
        return result;
    }

    @Test
    public void TwoSum() {
        int[] array = {3, 7, 2, 6, 15};
        int[] ints = twoSum(array, 10);
        System.out.println(Arrays.toString(ints));
    }

    private int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }
        }
        return new int[0];
    }

    @Test
    public void ValidParentheses() {
        System.out.println(isValid("()"));
    }

    private boolean isValid(String s) {
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put(')', '(');
        brackets.put('}', '{');
        brackets.put(']', '[');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!brackets.containsKey(c)) {
                stack.push(c);
            } else {
                char top = stack.isEmpty() ? '?' : stack.pop();
                if (top != brackets.get(c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

