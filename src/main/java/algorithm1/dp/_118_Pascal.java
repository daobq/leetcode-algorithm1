package algorithm1.dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 * In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
 * Example:
 * Input: numRows = 5
 * Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 */
public class _118_Pascal {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Original: " + generate(n));
        System.out.println("Improved: " + generateV2(n));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        int[][] dp = new int[numRows][];
        if (numRows == 0) {
            return res;
        }
        if (numRows == 1) {
            res.add(List.of(1));
            return res;
        }

        dp[0] = new int[]{1};
        dp[1] = new int[]{1, 1};

        for (int i = 2; i < numRows; i++) {
            int len = dp[i - 1].length + 1;
            dp[i] = new int[len];
            int[] dd = new int[len];
            dd[0] = 1;
            dd[len - 1] = 1;
            for (int j = 1; j < len - 1; j++) {
                dd[j] = dp[i - 1][j - 1] + dp[i - 1][j];
            }
            for (int k = 0; k < len; k++) {
                dp[i][k] = dd[k];
            }
        }

        for (int i = 0; i < dp.length; i++) {
            int[] val = dp[i];
            List<Integer> temp = Arrays.stream(val).boxed().toList();
            res.add(temp);
        }

        return res;
    }

    // Improved version - simpler and cleaner
    public static List<List<Integer>> generateV2(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);  // First and last element always 1
                } else {
                    // Sum of two elements from previous row
                    row.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
                }
            }
            res.add(row);
        }
        return res;
    }

}
