package com.griddynamics.CalculateSum;

public class Solution {
    public static void main(String[] args) {
        System.out.println(calculateSum("463275"));
    }

    //"463275"
    public static Integer calculateSum(String input) {
        int value = 0;

        try {
            value = Integer.parseInt(input);
        } catch (Exception e) {
            e.printStackTrace();
        }
        int acum = 0;
        int temp = value;

        while (temp != 0) {
            acum += temp % 10;
            temp /= 10;
        }
        return acum;
    }
}
