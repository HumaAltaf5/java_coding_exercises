package com.techreturners.exercise003;

public class Exercise003 {

    int getIceCreamCode(String iceCreamFlavour) {
        int code = 0;
        if (iceCreamFlavour == "Pistachio") {
            code = 0;
        }  else if (iceCreamFlavour == "Raspberry Ripple") {
            code = 1;
        } else if (iceCreamFlavour == "Vanilla") {
            code = 2;
        } else if (iceCreamFlavour == "Mint Chocolate Chip") {
            code = 3;
        } else if (iceCreamFlavour == "Chocolate") {
            code = 4;
        } else if(iceCreamFlavour == "Mango Sorbet") {
            code = 5;
        }
        return code;
    }

    String[] iceCreamFlavours() {
        String[] icecream = { "Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate", "Mango Sorbet" };
        return icecream;
    }

}




