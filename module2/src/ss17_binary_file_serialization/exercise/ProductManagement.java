package ss17_binary_file_serialization.exercise;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductManagement {
    static ArrayList<Product> list = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public void writeFile() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("src\\ss17_binary_file_serialization\\exercise\\data.dat");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(list);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void add() {
        Product product = new Product();
        System.out.println("Nhập vào mã sản phẩm muốn thêm: ");
        product.setProductCode(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhập vào tên sản phẩm muốn thêm: ");
        product.setProductName(scanner.nextLine());
        System.out.println("Nhập hãng sản xuất muốn thêm: ");
        product.setManufacturer(scanner.nextLine());
        System.out.println("Nhập vào giá tiền của sản phẩm");
        product.setPrice(Integer.parseInt(scanner.nextLine()));
        System.out.println("Các mô tả khác: ");
        product.setDescriptions(scanner.nextLine());
        list.add(product);
    }

    public void display() {
        for (Product product : list) {
            System.out.println(product.toString());
        }
    }

    public void search() {
        System.out.println("Nhập vào id sản phẩm muốn tìm kiếm");
        int id = Integer.parseInt(scanner.nextLine());
        for (Product product : list) {
            if (product.getProductCode() == id) {
                System.out.println(product.toString());
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm");
    }

}
