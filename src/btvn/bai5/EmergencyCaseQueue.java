package btvn.bai5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EmergencyCaseQueue {
    private Queue<EmergencyCase> cases;

    public EmergencyCaseQueue() {
        this.cases = new LinkedList<>();
    }

    public void addCase(EmergencyCase c) {
        if (c != null) {
            cases.add(c);
            System.out.println("Đã thêm vào hàng đợi: " + c.getPatient());
        }
    }

    public EmergencyCase getNextCase() {
        if (cases.isEmpty()) {
            System.out.println("Không còn ca cấp cứu nào chờ xử lý.");
            return null;
        }

        EmergencyCase next = cases.poll();
        System.out.println("Đang xử lý ca: " + next.getPatient());
        return next;
    }
}
