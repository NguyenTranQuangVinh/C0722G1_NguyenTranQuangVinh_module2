package ss17_binary_file_serialization.exercise;



import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;
public class ProductTest {


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        ProductManagement productManagement = new ProductManagement();
        int choice;
        do {
            System.out.println("===========Menu===========");
            System.out.println("1.\tThêm sản phẩm\n" +
                    "2.\tHiển thị danh sách\n" +
                    "3.\tTìm kiếm\n"
                    + "4.\tThoát");
            System.out.println("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    productManagement.add();
//                   productManagement.writeFile();
//                   productManagement.readFile();
                    break;
                case 2:
                    productManagement.display();
                    break;
                case 3:
                    productManagement.search();
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println("Số bạn nhập vượt quá chỉ tiêu. Vui lòng nhập số >0 và <5. !!");

            }
        } while (true);

    }
}
