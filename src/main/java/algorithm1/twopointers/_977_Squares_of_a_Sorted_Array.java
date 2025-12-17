package algorithm1.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class _977_Squares_of_a_Sorted_Array {

    public static void main(String[] args) {
        int[] a = {-4, -1, 0, 3, 10};
        System.out.println(Arrays.stream(sortedSquares_Collection(a)).boxed().toList());
    }

    public static int[] sortedSquares_Primitive(int[] nums) {
        long start = System.currentTimeMillis();
        int n = nums.length, mid = 0;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            mid = i;
            if (nums[i] >= 0) {
                break;
            }
        }

        System.out.println("Time executed: " + (System.currentTimeMillis() - start));
        return result;
    }

    public static int[] sortedSquares_Collection(int[] nums) {
        long start = System.currentTimeMillis();
        List<Integer> numList = Arrays.stream(nums).boxed().toList();
        List<Integer> squareNum = new ArrayList<>();

        numList.forEach(i -> {
            squareNum.add(i * i);
        });

        Collections.sort(squareNum);
        System.out.println("Time executed: " + (System.currentTimeMillis() - start));
        return squareNum.stream().mapToInt(i -> i).toArray();
    }
}
