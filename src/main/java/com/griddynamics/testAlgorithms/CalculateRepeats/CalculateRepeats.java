package com.griddynamics.testAlgorithms.CalculateRepeats;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CalculateRepeats {
    public static void main(String[] args) {
        List<Integer> input = new ArrayList(){};
        input.add(1);
        input.add(2);
        input.add(3);
        input.add(4);
        input.add(2);
        input.add(3);
        input.add(4);
        input.add(100);
        Collections.singletonList(input).forEach(System.out::print);
//        Map<Integer, Integer> integerIntegerMap = calculateReports(input);
//        System.out.println(integerIntegerMap);

    }

    //1,2,3,4,2,3,4,100
    //{1,1}, {2,2}, {3,2} .....
    public static Map<Integer, Integer> calculateReports(List<Integer> input) {
//        Map<Integer, Integer> map = new ConcurrentHashMap<>();
//        if (input == null || input.isEmpty()) {
//            return map;
//        }
//        for (Integer el : input) {
//            if (map.containsKey(el)) {
//                Integer integer = map.get(el);
//                map.put(el,++integer);
//            }else {
//                map.put(el, 1);
//            }
//        }
//        return map;
//    }

        Map<Integer, Integer> collect = input.stream()
                .collect(Collectors.toMap(k -> k, v -> 1, Integer::sum));
        return collect;

    }
}
