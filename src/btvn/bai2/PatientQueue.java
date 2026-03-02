package btvn.bai2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PatientQueue {
    Queue<Patient> queue;

    public PatientQueue() {
        this.queue = new LinkedList<>();
    }

    public void addPatient(Patient p) {
        if (p != null) {
            queue.add(p);
            System.out.println("Đã tiếp nhận: " + p);
        }
    }

    public Patient callNextPatient() {
        if (queue.isEmpty()) {
            System.out.println("Hiện tại không có bệnh nhân nào đang chờ.");
            return null;
        }

        Patient next = queue.poll();
        System.out.println("Mời vào khám: " + next);
        return next;
    }

    public Patient peekNextPatient() {
        if (queue.isEmpty()) {
            System.out.println("Không còn bệnh nhân nào chờ khám.");
            return null;
        }

        Patient next = queue.peek();
        System.out.println("Bệnh nhân tiếp theo sẽ được gọi: " + next);
        return next;
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void displayQueue() {
        if (queue.isEmpty()) {
            System.out.println("Hiện tại không có bệnh nhân nào đang chờ.");
            return;
        }

        for (Patient p : queue) {
            System.out.printf("%%s%n", p);
        }
    }
}
