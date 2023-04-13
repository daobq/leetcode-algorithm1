package com.leetcode.algorithm1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class _189_Rotate_Array {

    public static void main(String[] args) {
        int[] nums = {-1, -100, 3, 99};
        int k = 2;
        rotate(nums, k);
    }

    public static void rotate(int[] nums, int k) {
        List<Integer> list = new LinkedList<>(Arrays.stream(nums).boxed().toList());

        for (int i = 0; i < k; i++) {
            int lastVal = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            list.add(0, lastVal);
        }
        System.arraycopy(list.stream().mapToInt(i -> i).toArray(), 0, nums, 0, nums.length);
        System.out.println(list);
    }
}
