package btvn.bai5;

import java.util.Scanner;
import java.util.Stack;

public class EmergencyCase {
    private Patient patient;
    private Stack<TreatmentStep> steps;

    public EmergencyCase(Patient patient) {
        this.patient = patient;
        this.steps = new Stack<>();
    }

    public Patient getPatient() {
        return patient;
    }

    public void addStep(TreatmentStep step) {
        if (step != null) {
            steps.push(step);
        }
    }

    public TreatmentStep undoStep() {
        if (steps.isEmpty()) {
            System.out.println("Không còn bước nào để hoàn tác.");
            return null;
        }
        TreatmentStep last = steps.pop();
        System.out.println("Đã hoàn tác: " + last);
        return last;
    }

    public void displaySteps() {
        if (steps.isEmpty()) {
            System.out.println("Chưa có bước xử lý nào.");
            return;
        }

        System.out.println("Các bước xử lý của " + patient + " (mới nhất ở trên):");
        int stt = 1;
        for (int i = steps.size() - 1; i >= 0; i--) {
            System.out.println(stt + ". " + steps.get(i));
            stt++;
        }
        System.out.println();
    }
}
