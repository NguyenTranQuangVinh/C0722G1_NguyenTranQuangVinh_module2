package demo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadAndWrite {
    public static void main(String[] args) throws IOException {
        Scanner scanner= new Scanner(System.in);
        System.out.println("hãy nhập chuối bất kì");
        String chuoi = scanner.nextLine();
        writeFile(chuoi);

    }

    public static List<String> readFile() throws IOException {
        File file = new File("src\\Demo2\\demo.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        List<String> stringList = new ArrayList<>();
        while ((line = bufferedReader.readLine()) != null) {
            stringList.add(line);
        }
        bufferedReader.close();
        return stringList;
    }

    public static List<String> writeFile(String text) throws IOException {
        File file1 = new File("src\\Demo2\\demo.txt");
        FileWriter fileWriter = new FileWriter(file1);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        List<String> stringList = new ArrayList<>();

        stringList.add(text);

        for (int i = 0; i < stringList.size(); i++) {
            bufferedWriter.write(stringList.get(i));
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        return stringList;
    }
}

