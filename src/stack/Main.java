package stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int b = 100;
        demo();
        System.out.println("end");
        // cach dung stack
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
//       lay va xoa phan tu tren cung
        System.out.println("phan tu tren cung la: "+ stack.pop());
        System.out.println(stack);
//        lay nhung khong xoa
        System.out.println("phan tu tren cung la: "+ stack.peek());
//        duyet stack: top-down
        while (!stack.isEmpty()){
//            lay phan tu trn cung
            Integer top = stack.pop();
//            Xu ly top
            System.out.println("top: "+top);
        }
//        đảo ngược câu trong tiếng vệt
//        Hello các bạn => các bạn Hello : sử dung stack
        String seq = "Hello các bạn cntt2";
        System.out.println(seq);
        String[]arr = seq.split("");
//        duyệt và thêm vào stack
        Stack<String> stringStack = new Stack<>();
        for (String word: arr){
            stringStack.push(word);
        }

        while (!stringStack.isEmpty()){
            System.out.printf("%s",stringStack.pop());
        }

    }
    public static void demo(){
        int a = 10;
        for (int i = 0;i<a;i++){
            System.out.println(i);
        }
    }
}
