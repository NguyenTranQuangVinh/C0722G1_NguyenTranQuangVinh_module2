package ss16_text_file.exercise.exercise1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReaderAndWrite {
    public static void main(String[] args) throws IOException {

        File file = new File("src\\ss16_text_file\\exercise\\exercise1\\data\\source.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        List<String> list = new ArrayList<>();

        while ((line = bufferedReader.readLine()) != null) {

            list.add(line);
        }
        bufferedReader.close();

        File file1 = new File("src\\ss16_text_file\\exercise\\exercise1\\data\\target.csv");
        FileWriter fileWriter = new FileWriter(file1);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (String element : list) {
            bufferedWriter.write(element);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}

