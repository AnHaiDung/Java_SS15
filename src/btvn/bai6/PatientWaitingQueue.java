package btvn.bai6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PatientWaitingQueue {
    private Queue<Patient> waitingQueue;
    private int totalPatients;

    public PatientWaitingQueue() {
        this.waitingQueue = new LinkedList<>();
        this.totalPatients = 0;
    }

    public void addPatient(Patient p) {
        waitingQueue.add(p);
        totalPatients++;
    }

    public Patient getNextPatient() {
        if (waitingQueue.isEmpty()) {
            return null;
        }
        totalPatients--;
        return waitingQueue.poll();
    }

    public int getTotalPatients() {
        return totalPatients;
    }
}
