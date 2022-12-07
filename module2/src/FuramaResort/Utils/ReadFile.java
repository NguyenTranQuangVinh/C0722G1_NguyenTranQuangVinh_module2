package FuramaResort.Utils;


import FuramaResort.Models.*;

import java.io.*;
import java.util.*;

public class ReadFile {
    public static List<Employee> readFileEmployee(String path) {
        List<Employee> employeeList = new ArrayList<>();
        File file = new File(path);
        BufferedReader bufferedReader = null;
        if (file.exists()) {
            try {
                FileReader fileReader = new FileReader(file);
                bufferedReader = new BufferedReader(fileReader);
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    String[] info = line.split(",");
                    Employee employee = new Employee(Integer.parseInt(info[0]), info[1], info[2], info[3], Integer.parseInt(info[4]), Integer.parseInt(info[5]), info[6], info[7], info[8], Integer.parseInt(info[9]));
                    employeeList.add(employee);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
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
        return employeeList;
    }

    public static List<Customer> readFileCustomer(String path) {
        List<Customer> customerList = new ArrayList<>();
        File file = new File(path);
        if (file.exists()) {
            BufferedReader bufferedReader = null;
            try {
                FileReader fileReader = new FileReader(file);
                bufferedReader = new BufferedReader(fileReader);
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    String[] info = line.split(",");
                    Customer customer = new Customer(info[0], info[1], info[2], Integer.parseInt(info[3]), Integer.parseInt(info[4]), info[5], Integer.parseInt(info[6]), info[7], info[8]);
                    customerList.add(customer);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return customerList;
    }

    public static List<Room>readFileRoomMap(String path) {
        List<Room> roomList = new ArrayList<>();
        File file = new File(path);

        if (file.exists()) {
            BufferedReader bufferedReader = null;
            try {
                FileReader fileReader = new FileReader(file);
                bufferedReader = new BufferedReader(fileReader);
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    String[] info = line.split(",");
                    Room room = new Room(info[0], Double.parseDouble(info[1]), Integer.parseInt(info[2]), Integer.parseInt(info[3]), info[4], info[5]);
                    roomList.add(room);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
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

        return roomList;
    }
    public static List<Villa>readFileVillaMap(String path) {
        List<Villa> villaList = new ArrayList<>();
        File file = new File(path);

        if (file.exists()) {
            BufferedReader bufferedReader = null;
            try {
                FileReader fileReader = new FileReader(file);
                bufferedReader = new BufferedReader(fileReader);
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    String[] info = line.split(",");
                    Villa villa = new Villa(info[0],Double.parseDouble(info[1]),Integer.parseInt(info[2]),Integer.parseInt(info[3]),info[4],info[5],Double.parseDouble(info[6]),Integer.parseInt(info[7]));
                    villaList.add(villa);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
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

        return villaList;
    }
//    public List<Facility> readFacility(String villaFilePath, String roomFilePath) {
//        List<Facility> facilityList = new ArrayList<>();
//        List<Villa> villaMap = readFileVillaMap(villaFilePath);
//        Set<Villa> villaSet = villaMap.keySet();
//        villaSet.forEach(key -> {
//            facilityMap.put(key,villaMap.get(key));
//        });
//        LinkedHashMap<Room, Integer> roomMap = readFileRoomMap(roomFilePath);
//        Set<Room> roomSet = roomMap.keySet();
//        roomSet.forEach(key -> {
//            facilityMap.put(key, roomMap.get(key));
//        });
//        return facilityList;
//    }
}
