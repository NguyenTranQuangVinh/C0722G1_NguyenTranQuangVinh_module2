package ss11_stack_queue.exercise.exercise1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseElements {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        System.out.println("Nhập vào số lượng phần tử của mảng: ");
//        int size = Integer.parseInt(scanner.nextLine());
//        int[] ints = new int[size];
//        for (int i = 0; i < size; i++) {
//            System.out.println("Nhập phần tử của mảng thứ: " + (i + 1));
//            ints[i] = Integer.parseInt(scanner.nextLine());
//            stack.push(ints[i]);
//        }
//        for (int i = 0; i <ints.length ; i++) {
//            ints[i] = stack.pop();
//        }
//        System.out.println("Mảng sau khi đảo ngược: ");
//        System.out.println(Arrays.toString(ints));

        Stack<String> wStack = new Stack<>();
        System.out.println("Nhập vào một chuỗi: ");
        String string = scanner.nextLine();
        String[] array = string.split("");
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            wStack.push(array[i]);
        }
        //  System.out.println(wStack);
        String strings = "";
        for (int i = 0; i < array.length; i++) {
            strings += wStack.pop();
        }
        System.out.println("Chuỗi sau khi đảo ngược là: ");
        System.out.println(strings);
    }


}
