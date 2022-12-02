package text_all;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 số");
        int number;
        do {
            number = Integer.parseInt(scanner.nextLine());
            if (number > 20 || number < 0) {
                System.out.println("Vui lòng nhập lại số <=20");
            }
        } while (number > 20);
        int fibonacci = 0;
        int fibonacci1 = 1;
        int fibonacci2 = 1;

        if (number==0||number==1){
            System.out.println("1");
        }else {
            for (int i = 1; i < number ; i++) {
                fibonacci = fibonacci1+fibonacci2;
                fibonacci1=fibonacci2;
                fibonacci2=fibonacci;
            }
            System.out.println(fibonacci);
        }
    }
}
