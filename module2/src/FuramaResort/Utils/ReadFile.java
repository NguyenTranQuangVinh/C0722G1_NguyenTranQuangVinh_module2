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

//    public static List<Room> readFileRoomMap(String path) {
//        List<Room> roomList = new ArrayList<>();
//        File file = new File(path);
//
//        if (file.exists()) {
//            BufferedReader bufferedReader = null;
//            try {
//                FileReader fileReader = new FileReader(file);
//                bufferedReader = new BufferedReader(fileReader);
//                String line;
//                while ((line = bufferedReader.readLine()) != null) {
//                    String[] info = line.split(",");
//                    Room room = new Room(info[0], Double.parseDouble(info[1]), Integer.parseInt(info[2]), Integer.parseInt(info[3]), info[4], info[5]);
//                    roomList.add(room);
//                }
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            } catch (IOException e) {
//                e.printStackTrace();
//            } finally {
//                try {
//                    bufferedReader.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//
//        return roomList;
//    }

    public static Map<Room, Integer> readFileRoomMap(String path) {
        Map<Room, Integer> roomMap = new LinkedHashMap<>();
        File file = new File(path);

        if (file.exists()) {
            BufferedReader bufferedReader = null;
//            int value = 0;
            try {
                FileReader fileReader = new FileReader(file);
                bufferedReader = new BufferedReader(fileReader);
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    String[] info = line.split(",");
                    Room room = new Room(info[0], Double.parseDouble(info[1]), Integer.parseInt(info[2]), Integer.parseInt(info[3]), info[4], info[5]);
                    roomMap.put(room, 0);
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

        return roomMap;
    }

    public static Map<Villa, Integer> readFileVillaMap(String path) {
        Map<Villa, Integer> villaMap = new LinkedHashMap<>();
        File file = new File(path);

        if (file.exists()) {
            BufferedReader bufferedReader = null;
//            int value = 0;
            try {
                FileReader fileReader = new FileReader(file);
                bufferedReader = new BufferedReader(fileReader);
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    String[] info = line.split(",");
                    Villa villa = new Villa(info[0], Double.parseDouble(info[1]), Integer.parseInt(info[2]), Integer.parseInt(info[3]), info[4], info[5], Double.parseDouble(info[6]), Integer.parseInt(info[7]));
                    villaMap.put(villa, 0);
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

        return villaMap;
    }

//    public static LinkedHashMap<Facility, Integer> readFacility(String villaFilePath, String roomFilePath) {
//        LinkedHashMap<Facility, Integer> facilityMap = new LinkedHashMap<>();
//        LinkedHashMap<Villa, Integer> villaMap = readFileVillaMap(villaFilePath);
//        Set<Villa> villaSet = villaMap.keySet();
//        villaSet.forEach(key -> {
//            facilityMap.put(key, villaMap.get(key));
//        });
//        LinkedHashMap<Room, Integer> roomMap = readFileRoomMap(roomFilePath);
//        Set<Room> roomSet = roomMap.keySet();
//        roomSet.forEach(key -> {
//            facilityMap.put(key, roomMap.get(key));
//        });
//        return facilityMap;
//    }
}
