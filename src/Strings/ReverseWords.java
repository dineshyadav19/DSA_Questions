package Strings;

//https://leetcode.com/problems/reverse-words-in-a-string

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        reverse(str);
    }

    public static void reverse(String str) {
        if(str.length() == 0) {
            return;
        }
        int end = str.lastIndexOf(' ');
        for (int i = end + 1; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }

        System.out.print(" ");

        if(end != -1){
            str = str.substring(0, end);
            reverse(str);
        }
    }
}
