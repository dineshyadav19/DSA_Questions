package Strings;

import java.util.Scanner;

public class StringOps {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        //printChars(str);
        //printSubstring(str);

        //System.out.println(isPalindrome(str));

        System.out.println(countPalindromicSubstrings(str));
    }

    //TODO: print characters of String
    public static void printChars(String str) {
        for (int i = 0; i <= str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }

    //TODO: print all substrings of a given string
    /*
    * Time Complexity: O(n*n*n)
    * if we find the no of substrings than they would be n^2
    * but because substring fn has its own time complexity of n
    * so it becomes n^3
    */
    public static void printSubstring(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }

    //TODO: check whether the string is palindrome or not
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while(left <= right){
            if(str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    //TODO: count no of palindrome substrings or not
    /*
    * Time Complexity: O(n*n*n)
    */
    public static int countPalindromeSubstrings(String str) {
        int count = 0;

//        for (int i = 0; i < str.length(); i++) {
//            for (int j = i+1; j <= str.length(); j++) {
//                    String ss = str.substring(i, j);
//                if (isPalindrome(ss)) {
//                    count++;
//                }
//            }
//        }

        return count;
    }

    //TODO: count palindromic substrings
    /*
    *
    * Count odd and even length palindromic substrings
    *
    * Time Complexity: O(n*n)
    *
    */

    public static int countPalindromicSubstrings(String str) {
        int count = 0;


        // Odd length Palindromic Substrings
        for (int axis = 0; axis < str.length(); axis++) {
            for (int orbit = 0; axis - orbit >= 0 && axis + orbit < str.length(); orbit++) {
                if(str.charAt(axis - orbit) == str.charAt(axis + orbit))
                    count++;
                else
                    break;
            }
        }

        // Even length Palindromic Substrings
        for (double axis = 0.5; axis < str.length(); axis++) {
            for (double orbit = 0.5; axis - orbit >= 0 && axis + orbit < str.length(); orbit++) {
                if(str.charAt((int) (axis - orbit)) == str.charAt((int) (axis + orbit)))
                    count++;
                else
                    break;
            }
        }
        return count;
    }
}