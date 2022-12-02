package vehicle_management.Services.Impl;

import vehicle_management.Models.Car;
import vehicle_management.Services.ICarServices;
import vehicle_management.Utils.WriteAndReadFileCar;

import java.util.ArrayList;
import java.util.Scanner;

public class CarImpl implements ICarServices {
    Scanner scanner = new Scanner(System.in);
    public static ArrayList<Car> carArrayList = new ArrayList<>();
    final String PATH_CAR = "src\\vehicle_management\\Data\\car.csv";

    public void readFile() {
        WriteAndReadFileCar.readFile(PATH_CAR);
    }

    public void writeFile() {
        WriteAndReadFileCar.writeFileCar(PATH_CAR, carArrayList);
    }

    public boolean seaOfControlCheck(int seaOfControl) {
        readFile();
        for (Car car : carArrayList) {
            if (car.getSea​OfControl() == seaOfControl) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void addCar() {
        readFile();
        Car car = new Car();
        System.out.println("Vui lòng điền thông tin sau:");
        System.out.println("Nhập biển kiểm soát. ");
        int sea​OfControl;
        do {
            sea​OfControl = Integer.parseInt(scanner.nextLine());
            if (seaOfControlCheck(sea​OfControl)) {
                System.out.println("biển kiểm soát đã tồn tại");
            } else {
                car.setSea​OfControl(sea​OfControl);
                break;
            }
        } while (true);
        System.out.println("Nhập tên hãng sản xuất. ");
        car.setManufacturerIsName(scanner.nextLine());
        System.out.println("Nhập năm sản xuất");
        car.setYearOfManufacture(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhập chủ sở hữu");
        car.setOwner(scanner.nextLine());
        System.out.println("Nhập số chỗ ngồi");
        car.setNumberOfSeats(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhập kiểu xe");
        car.setVehicleType(scanner.nextLine());
        carArrayList.add(car);
        writeFile();
    }

    @Override
    public void displayCar() {
        readFile();
        for (Car car : carArrayList) {
            System.out.println(car.toString());
        }
    }

    @Override
    public void deleteCar() {
        readFile();
        System.out.println("Nhập vào biển kiểm soát muốn xóa");
        int sea​OfControl = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (Car car : carArrayList) {

            if (car.getSea​OfControl() == sea​OfControl) {
                check = true;
                System.out.println("bạn có chắc chắn muon xoa không: " +
                        "Y: yes, N:No");
                String answer = scanner.nextLine();
                if (answer.equals("Y")) {
                    carArrayList.remove(car);
                    System.out.println("Đã xóa thành công:. ");
                }
                writeFile();
                displayCar();
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy biển kiểm soát");
        }

    }
}
