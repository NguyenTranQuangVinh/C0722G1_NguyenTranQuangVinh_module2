package ss11_stack_queue.exercise.exercise3;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("mời bạn nhập số thập phân: ");
        int number = Integer.parseInt(scanner.nextLine());
        while (number > 0) {
            stack.push(number % 2);
            number /= 2;
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}

