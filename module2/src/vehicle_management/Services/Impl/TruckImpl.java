package vehicle_management.Services.Impl;

import vehicle_management.Models.Truck;
import vehicle_management.Services.ITruckServices;
import vehicle_management.Utils.WriteAndReadFileTruck;

import java.util.ArrayList;
import java.util.Scanner;

public class TruckImpl implements ITruckServices {
    Scanner scanner = new Scanner(System.in);
    public static ArrayList<Truck> truckArrayList = new ArrayList<>();
    final String PATH_TRUCK = "src\\vehicle_management\\Data\\truck.csv";

    public void readFile() {
        WriteAndReadFileTruck.readFile(PATH_TRUCK);
    }

    public void writeFile() {
        WriteAndReadFileTruck.writeFileTruck(PATH_TRUCK, truckArrayList);
    }

    public boolean seaOfControlCheck(int seaOfControl) {
        readFile();
        for (Truck truck : truckArrayList) {
            if (truck.getSea​OfControl() == seaOfControl) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void addTruck() {
        Truck truck = new Truck();
        System.out.println("Vui lòng vào điền thông tin sau:");
        System.out.println("Nhập biển kiểm soát: ");
        int seaOfControl;
        do {
            seaOfControl = Integer.parseInt(scanner.nextLine());
            if (seaOfControlCheck(seaOfControl)) {
                System.out.println("biển kiểm soát đã tồn tại");
            } else {
                truck.setSea​OfControl(seaOfControl);
                break;
            }
        } while (true);
        System.out.println("Nhập tên hãng sản xuất. ");
        truck.setManufacturerIsName(scanner.nextLine());
        System.out.println("Nhập năm sản xuất");
        truck.setYearOfManufacture(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhập chủ sở hữu");
        truck.setOwner(scanner.nextLine());
        System.out.println("Nhập trọng tại");
        truck.setTonnage(scanner.nextLine());
        truckArrayList.add(truck);
        writeFile();
    }

    @Override
    public void displayTruck() {
        writeFile();
        for (Truck truck : truckArrayList) {
            System.out.println(truck.toString());
        }
    }

    @Override
    public void deleteTruck() {
        System.out.println("Nhập vào biển kiểm soát muốn xóa");
        int sea​OfControl = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (Truck truck : truckArrayList) {

            if (truck.getSea​OfControl() == sea​OfControl) {
                check = true;
                System.out.println("bạn có chắc chắn muon xoa không: " +
                        "Y: yes, N:No");
                String answer = scanner.nextLine();
                if (answer.equals("Y")) {
                    truckArrayList.remove(truck);
                    System.out.println("Đã xóa thành công:. ");
                }
                writeFile();
                displayTruck();

            }
        }
        if (!check) {
            System.out.println("Không tìm thấy biển kiểm soát");
        }

    }
}
