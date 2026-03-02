package queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
//        queue.add("apple");//thêm
//        queue.offer("Banana");//thêm
//        queue.remove();//lấy và xóa phần tử đầu của hàng đợi
//        queue.poll();//lấy và xóa (nên dùng)
//        queue.peek();//lấy nhưng không xóa
//        queue.element();//lấy nhưng không xóa
//        Hàng đợi 2 đầu
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addFirst("apple");//thêm đầu
        linkedList.getFirst();
        linkedList.addLast("banana");
        linkedList.getLast();
    }
}
