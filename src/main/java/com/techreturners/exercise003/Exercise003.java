package com.techreturners.exercise003;

public class Exercise003 {

    int getIceCreamCode(String iceCreamFlavour) {
        int code = 0;
        // check for null or empty and throw Exception
        if (iceCreamFlavour == null || iceCreamFlavour.isEmpty()) {
            throw new NullPointerException("Cannot compare null or empty word");
        } else if (iceCreamFlavour.equals("Pistachio")) {
            code = 0;
        }  else if (iceCreamFlavour.equals("Raspberry Ripple")) {
            code = 1;
        } else if (iceCreamFlavour.equals("Vanilla")) {
            code = 2;
        } else if (iceCreamFlavour.equals("Mint Chocolate Chip")) {
            code = 3;
        } else if (iceCreamFlavour.equals("Chocolate")) {
            code = 4;
        } else if(iceCreamFlavour.equals("Mango Sorbet")) {
            code = 5;
        }
        return code;
    }

    String[] iceCreamFlavours() {
        String[] icecream = { "Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate", "Mango Sorbet" };
        return icecream;
    }

}




