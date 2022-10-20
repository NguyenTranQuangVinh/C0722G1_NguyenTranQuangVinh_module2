package ss12_java_collection_framework.exercise;

import java.util.Scanner;

public class ProductTest {
    public static void main(String[] args) {
      ProductManager productManager = new ProductManager();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("===========Menu===========");
            System.out.println("1.\tThêm sản phẩm\n" +
                    "2.\tSửa sản phẩm\n" +
                    "3.\tXóa sản phẩm \n" +
                    "4.\tHiển thị danh sách\n" +
                    "5.\tTìm kiếm\n" +
                    "6.\tSắp xếp\n"
                    + "7.\tThoát");
            System.out.println("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    productManager.add();
                    break;
                case 2:
                    productManager.edit();
                    break;
                case 3:
                    productManager.remove();
                    break;
                case 4:
                    productManager.display();
                    break;
                case 5:
                    productManager.search();
                    break;
                case 6:
                    productManager.sort();
                    break;
                case 7:
                    System.exit(7);
            }
        }while (true);
    }
}
