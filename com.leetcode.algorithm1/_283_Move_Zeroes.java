package com.leetcode.algorithm1;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Given an integer array nums,
 * move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * <p>
 * Note that you must do this in-place without making a copy of the array.
 */
public class _283_Move_Zeroes {

    public static void main(String[] args) {
        int[] a = {4, 2, 4, 0, 0, 3, 0, 5, 1, 0};
        moveZeroes_withCursors(a);
        System.out.println(Arrays.stream(a).boxed().toList());
    }

    public static void moveZeroes_withJavaUtils(int[] nums) {
        long start = System.currentTimeMillis();
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.stream(nums).boxed().toList());
        for (int i = 0; i < linkedList.size(); i++) {
            int value = linkedList.get(i);
            if (value == 0) {
                linkedList.remove(i);
                linkedList.add(0);
            }
        }
        System.out.println(linkedList);

        System.out.println("Time executed: " + (System.currentTimeMillis() - start));
    }

    public static void moveZeroes1(int[] nums) {
        long start = System.currentTimeMillis();
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[k] = nums[i];
                k++;
                System.out.println(Arrays.stream(nums).boxed().toList());
            }
        }
        for (int i = k; i < nums.length; i++) {
            nums[i] = 0;
            System.out.println(Arrays.stream(nums).boxed().toList());
        }


        System.out.println("Time executed: " + (System.currentTimeMillis() - start));
    }

    public static void moveZeroes_withCursors(int[] nums) {
        int n = nums.length;
        if (n < 2) {
            return;
        }
        int left = 0;
        int right = 1;
        while (right < n) {
            if (nums[left] == 0 && nums[right] != 0) {
                int val = nums[left];
                nums[left] = nums[right];
                nums[right] = val;
                left++;
                right++;
            } else if(nums[left] == 0 && nums[right] == 0){
                right++;
            }else{
                left++;
                right++;
            }

        }
    }
}
