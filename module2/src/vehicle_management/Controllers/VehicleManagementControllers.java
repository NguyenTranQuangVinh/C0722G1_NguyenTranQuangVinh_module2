package vehicle_management.Controllers;

import java.util.Scanner;

public class VehicleManagementControllers {
    public void menuVehicle() {
        Scanner scanner = new Scanner(System.in);
        CarManagementControllers carManagementControllers = new CarManagementControllers();
        MotorcycleManagementControllers motorcycleManagementControllers = new MotorcycleManagementControllers();
        TruckManagementControllers truckManagementControllers = new TruckManagementControllers();
        int choice;
        do {
            System.out.println("1. Car Management.\n" +
                    "2. Motorcycle Management.\n" +
                    "3. Truck Management.\n" +
                    "4. Thoát\n");
            System.out.println("Mời bạn nhập chức năng: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    carManagementControllers.menuCar();
                    break;
                case 2:
                    motorcycleManagementControllers.menuMotocycle();
                    break;
                case 3:
                    truckManagementControllers.menuTruck();
                    break;
                case 4:
                    System.exit(0);
            }
        } while (true);
    }
}
