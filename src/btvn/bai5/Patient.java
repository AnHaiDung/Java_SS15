package btvn.bai5;

import java.util.Scanner;

public class Patient {
    private String id;
    private String name;

    public Patient(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "BN-" + id + " - " + name;
    }
}
