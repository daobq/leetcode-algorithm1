package com.leetcode.algorithm1.twopointers;

public class _26_Remove_Duplicates_from_Sorted_Array {

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        int left = 0;
        for (int i = 1; i < n; i++) {
            if (nums[left] != nums[i]) {
                int val = nums[i];
                left++;
                nums[left] = val;
            }
        }
        return left+1;
    }
}
