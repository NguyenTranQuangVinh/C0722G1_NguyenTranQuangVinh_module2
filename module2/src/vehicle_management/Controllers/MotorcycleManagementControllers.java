package vehicle_management.Controllers;

import vehicle_management.Services.IMotorcycleServices;
import vehicle_management.Services.Impl.MotorcycleImpl;

import java.util.Scanner;

public class MotorcycleManagementControllers {
    public void menuMotocycle() {
        IMotorcycleServices iMotorcycleServices = new MotorcycleImpl();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Thêm mới phương tiện motorcycle.\n" +
                    "2. Hiện thị phương tiện motorcycle\n" +
                    "3. Xóa phương tiện motorcycle\n" +
                    "4. Thoát.\n");
            System.out.println("Vui lòng chọn chức năng.");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iMotorcycleServices.addMotorcycle();
                    break;
                case 2:
                    iMotorcycleServices.displayMotorcycle();
                    break;
                case 3:
                    iMotorcycleServices.deleteMotorcycle();
                    break;
                case 4:
                    return;
            }
        } while (true);

    }
}