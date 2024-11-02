package org.Census;

public class Resident {
    int  age;
    int gender;

    public Resident(int age, int gender) {
        this.age = age;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public int getGender() {
        return gender;
    }
}
