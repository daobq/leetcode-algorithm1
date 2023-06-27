package com.leetcode.algorithm1.test;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {


        System.out.println(detectNumberFromList("1a2s3d"));
    }

    private static boolean detectString(String input) {
        try {
            Integer num = Integer.parseInt(input);
            System.out.println("input is number");
            return true;
        } catch (NumberFormatException ex) {
            System.out.println("input is not a number");
            return false;
        }


//        Pattern pattern = Pattern.compile("\\d+/");
//        Matcher matcher = pattern.matcher(input);
//        boolean matchFound = matcher.find();
//        return true;
    }

    private static List<String> detectNumberFromList(String input) {
        String numbers = "";
        String letters = "";
        char[] a = input.toCharArray();
        for (char x : a) {
            try {
                Integer num = Integer.parseInt(String.valueOf(x));
                numbers += String.valueOf(x);
            } catch (NumberFormatException ex) {
                letters += String.valueOf(x);
            }
        }

        List<String> result = new ArrayList<>();
        result.add(numbers);
        result.add(letters);
        return result;
    }


}
