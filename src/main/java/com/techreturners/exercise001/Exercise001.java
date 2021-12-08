package com.techreturners.exercise001;

import java.text.DecimalFormat;
import java.util.List;
import java.lang.String.*;
import java.util.*;

public class Exercise001 {
    public String capitalizeWord(String word) {
        if (word == null || word.isEmpty()) {
            throw new NullPointerException("Cannot capitalize null or empty word");
        } else {
            return word.substring(0, 1).toUpperCase() + word.substring(1);
        }
    }

    public String generateInitials(String firstName, String lastName) {
        if (firstName == null || firstName.isEmpty()) {
            throw new NullPointerException("First name is null or empty");
        } else if (lastName == null|| lastName.isEmpty()) {
            throw new NullPointerException("Last name is null or empty");
        } else {
            return firstName.substring(0,1).toUpperCase() + "." + lastName.substring(0,1).toUpperCase();
        }
    }

    public double addVat(double originalPrice, double vatRate) {
        DecimalFormat df = new DecimalFormat("###.##");
        double vatAmount = originalPrice*(1.0+(vatRate/100));
        return Double.parseDouble(df.format(vatAmount));
    }

    public String reverse(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            throw new NullPointerException("Sentence to Reverse is null or empty");
        } else {
            StringBuilder revStr = new StringBuilder();
            revStr.append(sentence);
            return revStr.reverse().toString();
        }
    }

    public int countLinuxUsers(List<User> users) {
        int cnt = 0;
        for (int i=0;i<users.size();i++) {
            User user1 = users.get(i);
            if (user1.getType().equals("Linux")) {
                cnt ++;
            }
        }
        return cnt;
    }
}
