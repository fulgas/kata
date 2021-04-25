package org.fulgas.kata.leetcode.easy;


import java.util.HashMap;
import java.util.Map;

/**
 * Brute force approach
 */
public class TwoSum {

    // time O(n^2)
    // space O(1)
    public static int[] bruteForce(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    // time O(n)
    // space O(n)
    public static int[] complement(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }
        final Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}
