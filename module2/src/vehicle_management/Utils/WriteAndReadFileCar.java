package vehicle_management.Utils;

import vehicle_management.Models.Car;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAndReadFileCar {
    // public static void readFile(String path) {
//        File file = new File(path);
//        BufferedReader bufferedReader = null;
//        List<Car> carList = new ArrayList<>();
//        String line;
//        String[] info;
//        try {
//            FileReader fileReader = new FileReader(file);
//            bufferedReader = new BufferedReader(fileReader);
//            while ((line = bufferedReader.readLine()) != null) {
//                info = line.split(",");
//                Car car = new Car(Integer.parseInt(info[0]),info[1],Integer.parseInt(info[2]),info[3],Integer.parseInt(info[4]),info[5]);
//                carList.add(car);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                bufferedReader.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//
// }
    public static List<Car> readFile(String path) {
        File file = new File(path);
        List<Car> carList = new ArrayList<>();
        if (file.exists()) {
            BufferedReader bufferedReader = null;
            try {
                FileReader fileReader = new FileReader(file);
                bufferedReader = new BufferedReader(fileReader);
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    String[] info = line.split(",");
                    Car car = new Car(Integer.parseInt(info[0]), info[1], Integer.parseInt(info[2]), info[3], Integer.parseInt(info[4]), info[5]);
                    carList.add(car);
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
        return carList;
    }

    public static void writeFileCar(String path, List<Car> list) {
        File file = new File(path);
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Car car : list) {
                bufferedWriter.write(car.convertLine());
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
            }finally {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
