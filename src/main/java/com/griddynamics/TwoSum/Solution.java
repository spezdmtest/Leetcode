package com.griddynamics.TwoSum;

import java.sql.PreparedStatement;
import java.util.*;

/***
 * Given an array of integers nums and an integer target,
 * return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution,
 * and you may not use the same element twice.
 *
 * You can return the answer in any order.
 * Example 1:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Example 2:
 *
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Example 3:
 *
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 */
public class Solution {
    public static void main(String[] args) {
        int[] array = {3, 7, 2, 6, 15};
        int[] ints = twoSum(array, 10);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] twoSum(int[] nums, int target) {
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

    // сумма элементов - значения
//    public static int[] twoSum(int[] nums, int target) {
//        Set<Integer> set = new HashSet<>();
//        int[] result = new int[2];
//        for (int i = 0; i < nums.length; i++) {
//            int sumCandidate = target - nums[i];
//            if (!set.contains(sumCandidate)) {
//                set.add(nums[i]);
//                continue;
//            }
//            return new int[]{sumCandidate, nums[i]};
//        }
//        return new int[0];
//    }
//    public static int[] twoSum(int[] nums, int target) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            map.put(nums[i], i);
//        }
//        for (int i = 0; i < nums.length; i++) {
//            int requiredNumber = target - nums[i];
//
//            if (map.containsKey(requiredNumber) && map.get(requiredNumber) != i) {
//                return new int[] {i, map.get(requiredNumber)};
//            }
//        }
//        throw new IllegalArgumentException("No solution for defined input data!!!");
//    }

//    public static int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[j] == target - nums[i]) {
//                    return new int[]{i, j};
//                }
//            }
//        }
//        throw new IllegalArgumentException("No solution for defined input data!!!");
//    }
}
