package com.DSAPractice.String;

public class RemoveSpaces {

    // String se saare spaces remove karna
    public static String Remove(String str) {

        String result = "";

        // Har character ko check karenge
        for (int i = 0; i < str.length(); i++) {

            // Space nahi hai to result mein add karenge
            if (str.charAt(i) != ' ') {
                result = result + str.charAt(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        String str = "Java is easy";

        System.out.println(Remove(str));
    }
}

/*
Output: Javaiseasy

Time Complexity: O(n^2) due to String concatenation
Space Complexity: O(n)
*/