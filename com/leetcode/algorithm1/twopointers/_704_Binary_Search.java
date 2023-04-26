
package com.leetcode.algorithm1.twopointers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Given an array of integers nums which is sorted in ascending order,
 * and an integer target, write a function to search target in nums.
 * <p>
 * If target exists, then return its index. Otherwise, return -1.
 * <p>
 * You must write an algorithm with O(log n) runtime complexity.
 */
public class _704_Binary_Search {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(search(nums,target));
    }

    public static int search(int[] nums, int target) {
        List<Integer> listNum = Arrays.stream(nums).boxed().toList();
        Map<Integer, Integer> mapIdxVal = new HashMap<>();
        int idx = 0;
        for (Integer num : listNum) {
            mapIdxVal.put(idx, num);
            idx++;
        }

        for (Integer id : mapIdxVal.keySet()) {
            if (target == mapIdxVal.get(id)) {
                return id;
            }
        }
        return -1;
    }
}
