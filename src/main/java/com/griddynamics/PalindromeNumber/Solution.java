package com.griddynamics.PalindromeNumber;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
    public static boolean isPalindrome(int x) {

        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int invertNumber = 0;
        int copyOfX = x;

        while (copyOfX != 0) {
            invertNumber = invertNumber * 10 + copyOfX % 10;
            copyOfX = copyOfX / 10;
        }
        return invertNumber == x;
    }
}
