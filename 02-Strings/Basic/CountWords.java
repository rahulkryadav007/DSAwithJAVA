package com.DSAPractice.String;

public class CountWords {

    // String mein total words count karna
    public static int Count(String str) {

        str = str.trim();

        // Empty string mein koi word nahi hota
        if (str.isEmpty()) {
            return 0;
        }

        // One ya multiple spaces ko ek separator maanenge
        String[] words = str.split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {

        String str = "Java is easy to learn";

        System.out.println("Total words: " + Count(str));
    }
}

/*
Output: Total words: 5

Time Complexity: O(n)
Space Complexity: O(n)
*/