package vehicle_management.Utils;

import vehicle_management.Models.Motorcycle;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAndReadFileMotorcycle {
    public static List<Motorcycle> readFile(String path) {
        File file = new File(path);
        List<Motorcycle> motorcycleList = new ArrayList<>();
        if (file.exists()) {
            BufferedReader bufferedReader = null;
            try {
                FileReader fileReader = new FileReader(file);
                bufferedReader = new BufferedReader(fileReader);
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    String[] info = line.split(",");
                    Motorcycle motorcycle = new Motorcycle(Integer.parseInt(info[0]), info[1], Integer.parseInt(info[2]), info[3], info[4]);
                    motorcycleList.add(motorcycle);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return motorcycleList;
    }

    public static void writeFileMotorcycle(String path, List<Motorcycle> list) {
        File file = new File(path);
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Motorcycle motorcycle : list) {
                bufferedWriter.write(motorcycle.convertLine());
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
