package btvn.bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PatientQueue pq = new PatientQueue();

        int choice;
        do {
            System.out.println("1. Tiếp nhận bệnh nhân mới");
            System.out.println("2. Gọi bệnh nhân tiếp theo");
            System.out.println("3. Xem bệnh nhân sắp được gọi");
            System.out.println("4. Hiển thị danh sách đang chờ");
            System.out.println("5. Thoát");
            System.out.print("Chọn: ");
            choice = Integer.parseInt(sc.nextLine().trim());

            switch (choice) {
                case 1:
                    System.out.print("Mã bệnh nhân: ");
                    String id = sc.nextLine().trim();

                    System.out.print("Họ tên: ");
                    String name = sc.nextLine().trim();

                    System.out.print("Tuổi: ");
                    int age;
                    try {
                        age = Integer.parseInt(sc.nextLine().trim());
                    } catch (Exception e) {
                        System.out.println("Tuổi phải là số!");
                        break;
                    }

                    Patient p = new Patient(id, name, age);
                    pq.addPatient(p);
                    break;

                case 2:
                    pq.callNextPatient();
                    break;

                case 3:
                    pq.peekNextPatient();
                    break;

                case 4:
                    pq.displayQueue();
                    break;

                case 5:
                    System.out.println("Thoát");
                    break;
            }
        } while (choice != 5);
    }
}
