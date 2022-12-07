package FuramaResort.Utils;

import FuramaResort.Models.Customer;
import FuramaResort.Models.Employee;
import FuramaResort.Models.Room;
import FuramaResort.Models.Villa;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

    public void writeFile(String filePath, List<String> strings) {
        FileWriter fileWriter=null;
        BufferedWriter bufferedWriter = null;
        try {
             fileWriter= new FileWriter(filePath);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String line : strings) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void writeVilla(String filePath, List<Villa> villaList){
        List<String> strings = new ArrayList<>();
        villaList.forEach(villa -> strings.add(villa.convertLine()));
        writeFile(filePath,strings);
    }
    public void writeRoom(String filePath, List<Room>roomList){
        List<String> strings = new ArrayList<>();
        roomList.forEach(room -> strings.add(room.convertLine()));
        writeFile(filePath,strings);
    }
}
