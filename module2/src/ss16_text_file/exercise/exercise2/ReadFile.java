package ss16_text_file.exercise.exercise2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        File file = new File("src\\ss16_text_file\\exercise\\exercise2\\data\\read.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        List<Country> countryList = new ArrayList<>();
        while ((line = bufferedReader.readLine()) != null) {
            String[] info = line.split(",");
            Country country = new Country(Integer.parseInt(info[0]), info[1], info[2]);
            countryList.add(country);
        }
        bufferedReader.close();
        for (Country country:countryList) {
            System.out.println(country.toString());
        }
    }
}
