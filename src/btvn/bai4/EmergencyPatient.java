package btvn.bai4;

import java.util.Scanner;

public class EmergencyPatient {
    private String id;
    private String name;
    private int priority;

    public EmergencyPatient(String id, String name, int priority) {
        this.id = id;
        this.name = name;
        this.priority = priority;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        String level = (priority == 1) ? "Cấp cứu" : "Thường";
        return "BN-" + id + " | " + name + " | " + level;
    }
}
