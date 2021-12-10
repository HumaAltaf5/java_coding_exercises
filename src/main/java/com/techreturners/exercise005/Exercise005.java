package com.techreturners.exercise005;

public class Exercise005 {

    public boolean isPangram(String input) {
        if (input == null) {
            throw new NullPointerException("Cannot check for Pangram for null String");
        } else {
            //Eliminate spaces
            input = input.toLowerCase().replaceAll("\\s+", "");
            //Eliminate all non alphabetic characters
            input = input.replaceAll("[^A-Za-z]", "");
            //Eliminate Duplicate alphabetic characters
            input = input.replaceAll("(.)(?=.*\\1)", "");
            // check for complete alphabet
            return (input.length() == 26);
        }
    }
}
