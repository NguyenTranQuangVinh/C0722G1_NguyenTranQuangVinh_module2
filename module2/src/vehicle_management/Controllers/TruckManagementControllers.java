package vehicle_management.Controllers;

import vehicle_management.Services.ITruckServices;
import vehicle_management.Services.Impl.TruckImpl;

import java.util.Scanner;

public class TruckManagementControllers {
    public void menuTruck() {
        ITruckServices iTruckServices = new TruckImpl();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Thêm mới phương tiện truck.\n" +
                    "2. Hiện thị phương tiện truck\n" +
                    "3. Xóa phương tiện truck\n" +
                    "4. Thoát.\n");
            System.out.println("Vui lòng chọn chức năng.");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iTruckServices.addTruck();
                    break;
                case 2:
                    iTruckServices.displayTruck();
                    break;
                case 3:
                    iTruckServices.deleteTruck();
                    break;
                case 4:
                    return;
            }
        } while (true);
    }
}
