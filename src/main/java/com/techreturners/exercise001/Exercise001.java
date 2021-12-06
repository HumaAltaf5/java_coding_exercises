package com.techreturners.exercise001;

import java.text.DecimalFormat;
import java.util.List;
import java.lang.String.*;
import java.util.*;

public class Exercise001 {
    public String capitalizeWord(String word) {
        if (word == null || word.isEmpty()) {
            return word;
        } else {
            String capitalString = word.substring(0, 1).toUpperCase() + word.substring(1);
            return capitalString;
        }
    }

    public String generateInitials(String firstName, String lastName) {
        if (firstName == null || firstName.isEmpty()) {
            return firstName;
        } else if (lastName == null|| lastName.isEmpty()){
            return lastName;
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
            return sentence;
        } else {
            StringBuilder revStr = new StringBuilder();
            revStr.append(sentence);
            return revStr.reverse().toString();
        }
    }

    public int countLinuxUsers(List<User> users) {

        // Add your code here
        Integer cnt = 0;
        for (int i=0;i<users.size();i++) {
            User user1 = users.get(i);
            if (user1.getType() == "Linux") {
                cnt ++;
            }
        }
        return cnt;
    }
}
