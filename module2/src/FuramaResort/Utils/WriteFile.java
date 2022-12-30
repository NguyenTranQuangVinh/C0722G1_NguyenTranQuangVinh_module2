package FuramaResort.Utils;

import FuramaResort.Models.Customer;
import FuramaResort.Models.Employee;
import FuramaResort.Models.Room;
import FuramaResort.Models.Villa;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class WriteFile {
    public static void writeFileEmployee(String path, List<Employee> list) {
        File file = new File(path);
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee employee : list) {
                bufferedWriter.write(employee.convertLine());
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

    public static void writeFileCustomer(String path, List<Customer> list) {
        File file = new File(path);
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Customer customer : list) {
                bufferedWriter.write(customer.convertLine());
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

    public static void writeFileRoom(String path, Map<Room, Integer> roomIntegerMap) {
        File file = new File(path);

        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Map.Entry<Room, Integer> entry : roomIntegerMap.entrySet()) {
                bufferedWriter.write(entry.getKey().convertLine() + "," + entry.getValue());
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

    public static void writeFileVilla(String path, Map<Villa, Integer> villaIntegerMap) {
        File file = new File(path);
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Map.Entry<Villa, Integer> entry : villaIntegerMap.entrySet()) {
                bufferedWriter.write(entry.getKey().convertLine() + "," + entry.getValue());
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
//    public void writeVilla(String filePath, LinkedHashMap<Villa,Integer> villaMap) {
//        List<String> strings = new ArrayList<>();
////        Set<Villa> villaSet = villaMap.keySet();
//        villaMap.forEach(villa -> strings.add(villa.convertLine()));
//        writeFile(filePath, strings);
//    }
//
//    public void writeRoom(String filePath, LinkedHashMap<Room,Integer> roomMap) {
//        List<String> strings = new ArrayList<>();
////        Set<Room> roomSet = roomMap.keySet();
//        roomMap.forEach(room -> strings.add(room.convertLine()));
//        writeFile(filePath, strings);
//    }
}
