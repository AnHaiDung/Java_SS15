package btvn.bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MedicalRecordHistory manager = new MedicalRecordHistory();

        int choice;
        do {
            System.out.println("\n1. Thêm chỉnh sửa");
            System.out.println("2. Undo");
            System.out.println("3. Xem gần nhất");
            System.out.println("4. Hiển thị tất cả");
            System.out.println("5. Thoát");
            System.out.print("Chọn: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.print("Mô tả: ");
                    String desc = sc.nextLine();

                    System.out.print("Thời gian (ví dụ 06-07-2006): ");
                    String time = sc.nextLine();

                    EditAction action = new EditAction(desc, time);
                    manager.addEdit(action);
                    System.out.println("Đã thêm: " + action);
                    break;
                case 2:
                    EditAction undone = manager.undoEdit();
                    if (undone != null) {
                        System.out.println("Đã undo: " + undone);
                    } else {
                        System.out.println("Không còn gì để undo");
                    }
                    break;
                case 3:
                    EditAction latest = manager.getLatestEdit();
                    if (latest != null) {
                        System.out.println("Gần nhất: " + latest);
                    } else {
                        System.out.println("Chưa có dữ liệu");
                    }
                    break;
                case 4:
                    manager.displayHistory();
                    break;
                case 5:
                    System.out.println("Thoát");
                    break;
            }
        } while (choice != 5);
    }
}
