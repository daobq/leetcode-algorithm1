package algorithm1.twopointers;

/**
 * Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each unique element appears at most twice.
 * The relative order of the elements should be kept the same.
 * <p/>
 * Since it is impossible to change the length of the array in some languages,
 * you must instead have the result be placed in the first part of the array nums.
 * More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result.
 * It does not matter what you leave beyond the first k elements.
 * <p/>
 * Return k after placing the final result in the first k slots of nums.
 * <p>
 * Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
 * <p/>
 * Ex: Input: nums = [1,1,1,2,2,3] --> Output: 5, nums = [1,1,2,2,3,_]
 */
public class _80_Remove_Duplicates_from_Sorted_Array_II {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n < 3) return n;
        int left = 0, right = 1;
        int count = 0;

        while (right < n) {
            if (nums[left] != nums[right]) {
                left++;
                nums[left] = nums[right];
                count = 0;
            } else if (nums[left] == nums[right] && count < 1) {
                left++;
                nums[left] = nums[right];
                count++;
            }
            right++;
        }

        return left + 1;
    }
}
