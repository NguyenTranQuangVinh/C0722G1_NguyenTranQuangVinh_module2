package vehicle_management.Controllers;

import vehicle_management.Services.ICarServices;
import vehicle_management.Services.Impl.CarImpl;
import java.util.Scanner;

public class CarManagementControllers {

    public void menuCar() {
        ICarServices iCarServices = new CarImpl();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Thêm mới phương tiện car.\n" +
                    "2. Hiện thị phương tiện car\n" +
                    "3. Xóa phương tiện car\n" +
                    "4. Thoát.\n");
            System.out.println("Vui lòng chọn chức năng.");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iCarServices.addCar();
                    break;
                case 2:
                    iCarServices.displayCar();
                    break;
                case 3:
                    iCarServices.deleteCar();
                    break;
                case 4:
                    return;
            }
        } while (true);
    }
}
