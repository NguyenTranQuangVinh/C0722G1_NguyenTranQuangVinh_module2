package demo_3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadAndWrite {
    public static void main(String[] args) throws IOException {
        add();
        display();
    }

    public static List<Product> readFile() throws IOException {
        File file = new File("src\\demo_3\\product.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        List<Product> productList = new ArrayList<>();
        while ((line = bufferedReader.readLine()) != null) {
            String[] arr = line.split(",");
            Product product = new Product(arr[0], Integer.parseInt(arr[1]), arr[2]);
            productList.add(product);
        }
        bufferedReader.close();
        return productList;
    }

    public static void writeFile(List<Product> list) throws IOException {
        File file = new File("src\\demo_3\\product.csv");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Product product : list) {
            bufferedWriter.write(product.getInfo());
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    public static void add() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" hãy nhập tên:");
        String ten = scanner.nextLine();
        System.out.println("Hãy nhập tuổi: ");
        int tuoi = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giới tính: ");
        String gioiTinh = scanner.nextLine();
        Product product = new Product(ten, tuoi, gioiTinh);
        List<Product> productList = readFile();
        productList.add(product);
        writeFile(productList);
    }

    public static void display() throws IOException {
        for (int i = 0; i < readFile().size(); i++) {
            System.out.println(readFile().get(i));
        }
    }
}
