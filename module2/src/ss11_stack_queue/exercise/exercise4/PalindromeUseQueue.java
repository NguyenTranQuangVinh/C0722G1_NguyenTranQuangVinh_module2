package ss11_stack_queue.exercise.exercise4;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
public class PalindromeUseQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi");
        String str = scanner.nextLine();
        String[] strings = str.split("");
        Queue<String> queue = new ArrayDeque<>();
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < strings.length; i++) {
            stack.push(strings[i]);
            queue.offer(strings[i]);
        }
        System.out.println(stack);
        System.out.println(queue);
        boolean check = false;
        for (int i = 0; i < strings.length; i++) {
            if (!stack.peek().equals(queue.peek())) {
                check = false;
            } else {
                check = true;
            }
        }
        if (check == true) {
            System.out.println("Chuỗi này là chuỗi Palidrome:");
        } else {
            System.out.println("Chuỗi này là  không phải chuỗi Palidrome:");
        }
    }
}
