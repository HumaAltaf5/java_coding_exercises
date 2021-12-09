package com.techreturners.exercise002;

public class Exercise002 {

    public boolean isFromManchester(Person person) {
        return person.getCity().equals("Manchester");
    }

    public boolean canWatchFilm(Person person, int ageLimit) {
        return (person.getAge() >= ageLimit) ;
    }
    
}

    class Person {
        private String name;
        private String surname;
        private String city;
        private int age;

        public String getCity() {
            return city;
        }

        public int getAge() {
            return age;
        }

        public Person(String personName, String personSurname, String personCity, int personAge) {
            name =  personName;
            surname = personSurname;
            city = personCity;
            age = personAge;
        }
    }
