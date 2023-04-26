package com.leetcode.algorithm1.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SecondHighest {
    public static void main(String[] args) {
        int[] a = {3, 2, 5, 2, 3, 4, 5};
        System.out.println(secondHighest(a));
    }

    private static int secondHighest(int[] nums) {
        long start = System.currentTimeMillis();

        Set<Integer> set = new HashSet<>(Arrays.stream(nums).boxed().toList());
        int[] arr = set.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(arr);

        System.out.println("Time executed: " + (System.currentTimeMillis() - start));
        return arr[arr.length - 2];
    }
}
