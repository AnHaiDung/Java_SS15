package btvn.bai4;

import java.util.PriorityQueue;
import java.util.Scanner;

public class EmergencyQueue {
    private PriorityQueue<EmergencyPatient> queue;

    public EmergencyQueue() {
        this.queue = new PriorityQueue<>((p1, p2) -> {
            if (p1.getPriority() != p2.getPriority()) {
                return Integer.compare(p1.getPriority(), p2.getPriority());
            }
            return 0;
        });
    }

    public void addPatient(EmergencyPatient p) {
        if (p != null) {
            queue.offer(p);
            System.out.println("Đã tiếp nhận: " + p);
        }
    }

    public EmergencyPatient callNextPatient() {
        if (queue.isEmpty()) {
            System.out.println("Hiện tại không còn bệnh nhân nào chờ.");
            return null;
        }

        EmergencyPatient next = queue.poll();
        System.out.println("Mời vào khám: " + next);
        return next;
    }

    public void displayQueue() {
        if (queue.isEmpty()) {
            System.out.println("Hiện tại không có bệnh nhân nào đang chờ.");
            return;
        }

        System.out.println("\nDANH SÁCH CHỜ KHÁM (ưu tiên cao trước):");
        System.out.println("---------------------------------------");

        int stt = 1;
        PriorityQueue<EmergencyPatient> temp = new PriorityQueue<>(queue);
        while (!temp.isEmpty()) {
            System.out.println(stt + ". " + temp.poll());
            stt++;
        }

        System.out.println("---------------------------------------\n");
    }
}
