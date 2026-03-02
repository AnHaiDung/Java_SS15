package btvn.bai4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmergencyQueue eq = new EmergencyQueue();

        int choice;
        do {
            System.out.println("\n=== QUẢN LÝ HÀNG ĐỢI CẤP CỨU ===");
            System.out.println("1. Tiếp nhận bệnh nhân");
            System.out.println("2. Gọi bệnh nhân tiếp theo");
            System.out.println("3. Xem danh sách đang chờ");
            System.out.println("4. Thoát");
            System.out.print("Chọn: ");

            try {
                choice = Integer.parseInt(sc.nextLine().trim());
            } catch (Exception e) {
                System.out.println("Nhập số thôi nhé!");
                choice = 0;
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Mã BN (ví dụ: 001): ");
                    String id = sc.nextLine().trim();

                    System.out.print("Họ tên: ");
                    String name = sc.nextLine().trim();

                    System.out.print("Ưu tiên (1 = cấp cứu, 2 = thường): ");
                    int pri;
                    try {
                        pri = Integer.parseInt(sc.nextLine().trim());
                        if (pri != 1 && pri != 2) {
                            System.out.println("Chỉ nhập 1 hoặc 2!");
                            break;
                        }
                    } catch (Exception e) {
                        System.out.println("Ưu tiên phải là số 1 hoặc 2!");
                        break;
                    }

                    EmergencyPatient p = new EmergencyPatient(id, name, pri);
                    eq.addPatient(p);
                    break;

                case 2:
                    eq.callNextPatient();
                    break;

                case 3:
                    eq.displayQueue();
                    break;

                case 4:
                    System.out.println("Kết thúc ca trực.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (choice != 4);
    }
}
