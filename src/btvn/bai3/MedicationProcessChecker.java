package btvn.bai3;

import java.util.Scanner;
import java.util.Stack;

public class MedicationProcessChecker {
    Stack<String> stack = new Stack<>();
    public boolean checkProcess(String[] actions) {
        stack.clear();

        for (String action : actions) {
            if (action == null) continue;
            action = action.trim().toUpperCase();

            if (action.equals("PUSH")) {
                stack.push("Thuốc");
            } else if (action.equals("POP")) {
                if (stack.isEmpty()) {
                    System.out.println("Lỗi: POP khi stack rỗng");
                    return false;
                }
                stack.pop();
            } else {
                System.out.println("Thao tác không hợp lệ: " + action);
                return false;
            }
        }

        if (stack.isEmpty()) {
            System.out.println("Hợp lệ: Tất cả đã hoàn tất");
            return true;
        } else {
            System.out.println("Không hợp lệ: Còn " + stack.size() + " thuốc chưa hoàn tất");
            return false;
        }
    }

    public void reset() {
        stack.clear();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MedicationProcessChecker checker = new MedicationProcessChecker();

        while (true) {
            System.out.println("\nNhập chuỗi thao tác :");
            System.out.println("Ví dụ: PUSH POP PUSH POP");

            String line = sc.nextLine().trim();

            if (line.isEmpty()) {
                System.out.println("Vui lòng nhập chuỗi!");
                continue;
            }

            String[] actions = line.replace(",", " ").split("\\s+");

            boolean ok = checker.checkProcess(actions);
            System.out.println("Kết quả: " + (ok ? "HỢP LỆ" : "KHÔNG HỢP LỆ"));
            System.out.println("-----------------------------");

            checker.reset();
        }

    }
}
