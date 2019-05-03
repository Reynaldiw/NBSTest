package com.reynaldiwijaya.nbstest;

public class Palindrome {
    private void checkPalindrome(String text) {
        String reverse = new StringBuffer(text).reverse().toString();
        if (reverse.equals(text)) {
            System.out.println(text + " adalah palindrome");
        } else {
            System.out.println(text + " bukan palindrome");
        }
    }
}
