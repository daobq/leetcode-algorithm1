package com.leetcode.algorithm1;

import java.util.Arrays;

public class SecondHighest {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        System.out.println(secondHighest(a));
    }

    private static int secondHighest(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length - 2];
    }
}
