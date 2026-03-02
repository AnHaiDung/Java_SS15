package btvn.bai6;

import java.util.Scanner;

public class Patient {
    private String id;
    private String name;
    private int age;
    private String gender;

    public Patient(String id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "BN-" + id + ": " + name + " (" + age + " tuổi, " + gender + ")";
    }
}
