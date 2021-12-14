package com.techreturners.exercise003;

import java.util.Arrays;

public class Exercise003 {

    int getIceCreamCode(String iceCreamFlavour) {
        // check for null or empty and throw Exception
        if (iceCreamFlavour == null || iceCreamFlavour.isEmpty()) {
            throw new NullPointerException("Cannot compare null or empty word");
        } else  {
            return Arrays.asList(iceCreamFlavours()).indexOf(iceCreamFlavour);
        }
    }

    String[] iceCreamFlavours() {
        String[] icecream = { "Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate", "Mango Sorbet" };
        return icecream;
    }



}




