package vehicle_management.Services.Impl;

import vehicle_management.Models.Motorcycle;
import vehicle_management.Services.IMotorcycleServices;
import vehicle_management.Utils.WriteAndReadFileMotorcycle;

import java.util.ArrayList;
import java.util.Scanner;

public class MotorcycleImpl implements IMotorcycleServices {
    Scanner scanner = new Scanner(System.in);
    public static ArrayList<Motorcycle> motorcycleArrayList = new ArrayList<>();
    final String PATH_MOTORCYCLE = "src\\vehicle_management\\Data\\motorcycle.csv";

    public void readFile() {
        WriteAndReadFileMotorcycle.readFile(PATH_MOTORCYCLE);
    }

    public void writeFile() {
        WriteAndReadFileMotorcycle.writeFileMotorcycle(PATH_MOTORCYCLE, motorcycleArrayList);
    }

    public boolean saeOfControlCheck(int saeOfControl) {
        readFile();
        for (Motorcycle motorcycle : motorcycleArrayList) {
            if (motorcycle.getSea​OfControl() == saeOfControl) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void addMotorcycle() {
        Motorcycle motorcycle = new Motorcycle();
        System.out.println("Vui lòng điền thông tin sau:");
        System.out.println("Nhập biển kiểm soát. ");
        int seaOfControl;
        do {
            seaOfControl = Integer.parseInt(scanner.nextLine());
            if (saeOfControlCheck(seaOfControl)) {
                System.out.println("biển kiểm soát đã tồn tại");
            } else {
                motorcycle.setSea​OfControl(seaOfControl);
                break;
            }
        } while (true);
        System.out.println("Nhập tên hãng sản xuất. ");
        motorcycle.setManufacturerIsName(scanner.nextLine());
        System.out.println("Nhập năm sản xuất");
        motorcycle.setYearOfManufacture(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhập chủ sở hữu");
        motorcycle.setOwner(scanner.nextLine());
        System.out.println("Nhập công suất:");
        motorcycle.setWattage(scanner.nextLine());
        motorcycleArrayList.add(motorcycle);
        writeFile();
    }

    @Override
    public void displayMotorcycle() {
        writeFile();
        for (Motorcycle motorcycle : motorcycleArrayList) {
            System.out.println(motorcycle.toString());
        }
    }

    @Override
    public void deleteMotorcycle() {
        System.out.println("Nhập vào biển kiểm soát muốn xóa");
        int sea​OfControl = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (Motorcycle motorcycle : motorcycleArrayList) {

            if (motorcycle.getSea​OfControl() == sea​OfControl) {
                check = true;
                System.out.println("bạn có chắc chắn muon xoa không: " +
                        "Y: yes, N:No");
                String answer = scanner.nextLine();
                if (answer.equals("Y")) {
                    motorcycleArrayList.remove(motorcycle);
                    System.out.println("Đã xóa thành công:. ");
                }
                writeFile();
                displayMotorcycle();

            }
        }
        if (!check) {
            System.out.println("Không tìm thấy biển kiểm soát");
        }

    }
}
