package com.griddynamics.testAlgorithms.RemoveDuplicates;

import java.util.*;

public class Solution {
    // 1,4,5,4,2,1 -> 1,4,5,2
    private static List<Integer> removeDuplicates(List<Integer> input) { // O(n)
        Set<Integer> set = new HashSet<>(input);
        return new ArrayList<>(set);
    }

    private static List<Integer> removeDuplicatesUpgrade(List<Integer> input) { // рабатает но выходим за пределы массива
        Collections.sort(input);
        for (int i = 0; i < input.size(); ) {
            Integer a = input.get(i);
            Integer b = input.get(i + 1);
            if (b != null && a == b) {
                input.remove(i+1);
            }else {
                i++;
            }
        }
        return input;
    }

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(4);
        arrayList.add(2);
        arrayList.add(1);
        arrayList.forEach(System.out::print);

        List removeDuplicatesList = removeDuplicates(arrayList);
        System.out.println();
        System.out.println(removeDuplicatesList);

        List removeDuplicatesUpgrade = removeDuplicatesUpgrade(arrayList);
        System.out.println(removeDuplicatesUpgrade);



    }
}
