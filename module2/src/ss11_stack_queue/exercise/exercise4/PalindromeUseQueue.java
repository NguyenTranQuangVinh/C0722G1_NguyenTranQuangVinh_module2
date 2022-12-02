package ss11_stack_queue.exercise.exercise4;
import java.util.*;

public class PalindromeUseQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi");
        String str = scanner.nextLine().toLowerCase();
        String[] strings = str.split("");
        Queue<String> queue = new LinkedList<>();
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < strings.length; i++) {
            stack.push(strings[i]);
            queue.offer(strings[i]);
        }
        System.out.println(stack);
        System.out.println(queue);
        boolean check = true;
        for (int i = 0; i < stack.size(); i++) {
            if (!stack.pop().equals(queue.remove())) {
                check = false;
                break;
            }
        }
        if (check == true) {
            System.out.println("Chuỗi này là chuỗi Palidrome:");
        } else {
            System.out.println("Chuỗi này là  không phải chuỗi Palidrome:");
        }
    }
}
