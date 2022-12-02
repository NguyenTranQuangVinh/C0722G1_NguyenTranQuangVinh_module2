package demo_2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadAndWrite {
    public static void main(String[] args) throws IOException {
        add();
        delete();
        display();
        edit();
    }

    public static List<Product> readFile () throws IOException {
        File file = new File("src\\demo_2\\product.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<Product> productList = new ArrayList<>();
        String line;
        while ((line=bufferedReader.readLine())!=null){
            String[] arr = line.split(",");
            Product product = new Product(arr[0],arr[1],arr[2]);
            productList.add(product);
        }
        bufferedReader.close();
        return productList;
    }

    public static void writeFile(List<Product>list) throws IOException {
        File file = new File("src\\demo_2\\product.csv");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (Product product: list) {
            bufferedWriter.write(product.getTen() + "," + product.getNgayThangNamSinh() + "," + product.getDiaChi());
            bufferedWriter.newLine();

        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
    public static void add() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hãy nhập tên");
        String name = scanner.nextLine();
        System.out.println("hãy nhập ngày tháng năm sinh");
        String ngaythangsinh = scanner.nextLine();
        System.out.println("hãy nhập địa chỉ");
        String diachi = scanner.nextLine();
        Product product = new Product(name,ngaythangsinh,diachi);
        List<Product> productList = readFile();
        productList.add(product);
        writeFile(productList);
    }
    public static void display() throws IOException {
        for (int i = 0; i <readFile().size(); i++) {
            System.out.println(readFile().get(i));
        }
    }
    public static void delete() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hãy nhập tên xóa");
        String name = scanner.nextLine();
        List<Product> productArrayList= readFile();
        for (int i = 0; i <productArrayList.size() ; i++) {
            if (productArrayList.get(i).getTen().equals(name)){
                productArrayList.remove(i );
            }
        }
        writeFile(productArrayList);
    }
    public static void edit() throws IOException {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhập tên bạn muốn sửa: ");
        String name1 = scanner.nextLine();
        for (int i = 0; i <readFile().size() ; i++) {
            if (readFile().get(i).getTen().equals(name1)){
                System.out.println("hãy nhập tên của bạn");
                String name = scanner.nextLine();
                System.out.println("hãy nhập ngày tháng năm sinh của bạn");
                String ngaythangsinh = scanner.nextLine();
                System.out.println("hãy nhập địa chỉ của bạn");
                String diachi = scanner.nextLine();
                Product product = new Product(name,ngaythangsinh,diachi);
                List<Product> productList = readFile();
                productList.add(product);
                writeFile(productList);
                display();
            }
        }

    }
}
