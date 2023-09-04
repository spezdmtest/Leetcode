package com.griddynamics.testAlgorithms.Sqrt;

public class Sqrt {

    public static void main(String[] args) {
        int result = calculateSqrt(7);
        System.out.println(result);
    }

    // 0 1 2 3 4
// 9 -> 3
// 4 -> 2
// 5 -> 2
    public static int calculateSqrt(int input) {
        int low = 0;
        int high = input;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int squareMid = mid * mid;
            if (squareMid == input) {
                return mid;
            }
            if (squareMid > input) {
                high = mid - 1;
            }
            if (squareMid < input) {
                low = mid + 1;
            }
        }
        return low - 1;
    }
}
