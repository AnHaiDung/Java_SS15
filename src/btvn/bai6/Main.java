package btvn.bai6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("BỆNH NHÂN CHỜ KHÁM");
        PatientWaitingQueue queue = new PatientWaitingQueue();
        queue.addPatient(new Patient("001", "Nguyễn Văn A", 45, "Nam"));
        queue.addPatient(new Patient("002", "Trần Thị B", 32, "Nữ"));
        System.out.println("Tổng chờ: " + queue.getTotalPatients());
        System.out.println("Gọi khám: " + queue.getNextPatient());
        System.out.println("Tổng còn lại: " + queue.getTotalPatients());

        System.out.println("\nLỊCH SỬ CHỈNH SỬA BỆNH ÁN");
        MedicalRecordHistory history = new MedicalRecordHistory("BA-123");
        history.addEdit(new EditAction("Cập nhật huyết áp 130/85", "BS Minh", "2026-03-02 16:00"));
        history.addEdit(new EditAction("Thêm triệu chứng sốt", "BS Minh", "2026-03-02 16:05"));
        System.out.println("Undo: " + history.undoEdit());

        System.out.println("\nHỆ THỐNG GỌI SỐ ");
        TicketSystem ticket = new TicketSystem();
        ticket.issueTicket("2026-03-02 16:10");
        ticket.issueTicket("2026-03-02 16:12");
        System.out.println("Gọi số: " + ticket.callNext());

        System.out.println("\nHOÀN TÁC NHẬP LIỆU");
        UndoManager undo = new UndoManager(5);
        undo.addAction(new InputAction("Huyết áp", "120/80", "130/85", "16:15"));
        undo.addAction(new InputAction("Thuốc", "Paracetamol", "Efferalgan", "16:20"));
        System.out.println("Undo: " + undo.undo());
    }
}
