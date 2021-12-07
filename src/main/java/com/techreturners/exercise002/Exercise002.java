package com.techreturners.exercise002;

public class Exercise002 {

    public boolean isFromManchester(Person person) {
        if (person.city == "Manchester") {
            return true;
        } else {
            return false;
        }
    }

    public boolean canWatchFilm(Person person, int ageLimit) {
        if (person.age >= ageLimit) {
            return true;
        } else {
            return false;
        }
    }
    
}

class Person {
    String name;
    String surname;
    String city;
    int age;

    public Person(String personName, String personSurname, String personCity, int personAge) {
        name =  personName;
        surname = personSurname;
        city = personCity;
        age = personAge;
    }
}
