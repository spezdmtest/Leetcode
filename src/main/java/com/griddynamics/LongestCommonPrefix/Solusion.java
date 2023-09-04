package com.griddynamics.LongestCommonPrefix;

public class Solusion {
    //flower
    //flow
    //flight
    public static void main(String[] args) {
        String[] array = {"flower", "flow", "flight"};
        String result = longestCommonPrefix(array);
        System.out.println(result);
    }
    public static String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }
        String result = strs[0];
        for (int i = 0; i < strs.length; i++) {
            while (strs[i].indexOf(result) != 0) {
                result = result.substring(0, result.length() - 1);
                if (result.isEmpty()) {
                    return "";
                }
            }
        }
        return result;
    }
}
