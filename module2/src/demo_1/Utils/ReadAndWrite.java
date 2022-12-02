package demo_1.Utils;

import demo_1.Models.Posts;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ReadAndWrite {
    public static void main(String[] args) throws IOException {
        writeFile(getPost());

        for (int i = 0; i < readFile().size(); i++) {
            System.out.println(readFile().get(i));
        }

    }
    public static List<String> readFile() throws IOException {
        File file = new File("src\\demo_1\\Data\\posts.csv");
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
    public static void writeFile(Posts text) throws IOException {
        File file = new File("src\\demo_1\\Data\\posts.csv");
        FileWriter fileWrite = new FileWriter(file,true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWrite);

        bufferedWriter.write(text.getId() + ",");
        bufferedWriter.write(text.getTitle()+ ",");
        bufferedWriter.write(text.getSubtitle() + ",");
        bufferedWriter.write(text.getContent() + ",");
        bufferedWriter.write(text.getViews() + ",");
        bufferedWriter.newLine();
        bufferedWriter.close();
    }
    public static Posts getPost() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("hãy nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("hãy nhập title");
        String title = scanner.nextLine();
        System.out.println("hãy nhập subtitle");
        String subtitle = scanner.nextLine();
        System.out.println("hãy nhập content");
        String content = scanner.nextLine();
        System.out.println("hãy nhập view");
        int view = Integer.parseInt(scanner.nextLine());

        Posts post = new Posts(id, title, subtitle, content, view);
        return post;
    }



}

