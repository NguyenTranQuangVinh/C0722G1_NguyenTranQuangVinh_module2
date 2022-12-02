package vehicle_management.Utils;

import vehicle_management.Models.Truck;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAndReadFileTruck {
    public static List<Truck> readFile(String path) {
        File file = new File(path);
        List<Truck> truckList = new ArrayList<>();
        if (file.exists()) {
            BufferedReader bufferedReader = null;
            try {
                FileReader fileReader = new FileReader(file);
                bufferedReader = new BufferedReader(fileReader);
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    String[] info = line.split(",");
                    Truck truck = new Truck(Integer.parseInt(info[0]), info[1], Integer.parseInt(info[2]), info[3], info[4]);
                    truckList.add(truck);
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
        return truckList;
    }

    public static void writeFileTruck(String path, List<Truck> list) {
        File file = new File(path);
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Truck truck : list) {
                bufferedWriter.write(truck.convertLine());
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
