package btvn.bai5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmergencyCaseQueue queue = new EmergencyCaseQueue();

        int choice;
        EmergencyCase currentCase = null;

        do {
            System.out.println("1. Tiếp nhận bệnh nhân mới (vào Queue)");
            System.out.println("2. Lấy ca cấp cứu tiếp theo để xử lý");
            System.out.println("3. Thêm bước xử lý cho ca hiện tại");
            System.out.println("4. Undo bước xử lý gần nhất");
            System.out.println("5. Xem các bước xử lý của ca hiện tại");
            System.out.println("6. Thoát");
            System.out.print("Chọn: ");

            try {
                choice = Integer.parseInt(sc.nextLine().trim());
            } catch (Exception e) {
                System.out.println("Nhập số thôi!");
                choice = 0;
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Mã BN: ");
                    String id = sc.nextLine().trim();
                    System.out.print("Họ tên: ");
                    String name = sc.nextLine().trim();

                    Patient p = new Patient(id, name);
                    EmergencyCase ec = new EmergencyCase(p);
                    queue.addCase(ec);
                    break;

                case 2:
                    currentCase = queue.getNextCase();
                    if (currentCase != null) {
                        System.out.println("Bắt đầu xử lý ca này.");
                    }
                    break;

                case 3:
                    if (currentCase == null) {
                        System.out.println("Chưa chọn ca nào để xử lý!");
                        break;
                    }
                    System.out.print("Mô tả bước xử lý: ");
                    String desc = sc.nextLine().trim();
                    System.out.print("Thời gian (ví dụ: 14:30): ");
                    String time = sc.nextLine().trim();

                    TreatmentStep step = new TreatmentStep(desc, time);
                    currentCase.addStep(step);
                    System.out.println("Đã thêm bước: " + step);
                    break;

                case 4:
                    if (currentCase == null) {
                        System.out.println("Chưa chọn ca nào!");
                        break;
                    }
                    currentCase.undoStep();
                    break;

                case 5:
                    if (currentCase == null) {
                        System.out.println("Chưa chọn ca nào!");
                        break;
                    }
                    currentCase.displaySteps();
                    break;

                case 6:
                    System.out.println("Kết thúc chương trình.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (choice != 6);
    }
}
