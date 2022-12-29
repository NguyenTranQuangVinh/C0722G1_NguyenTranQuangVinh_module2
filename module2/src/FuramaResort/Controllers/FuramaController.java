package FuramaResort.Controllers;

import java.util.Scanner;

public class FuramaController {
    public void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        EmployeeManagementController employeeManagementController = new EmployeeManagementController();
        CustomerManagementController customerManagementController = new CustomerManagementController();
        FacilityManagementController facilityManagementController = new FacilityManagementController();
        BookingManagementController bookingManagementController = new BookingManagementController();
        int choice;
        do {
            System.out.println("1.\tEmployee Management\n" +
                    "2.\tCustomer Management\n" +
                    "3.\tFacility Management \n" +
                    "4.\tBooking Management\n" +
                    "5.\tPromotion Management\n" +
                    "6.\tExit\n" +
                    "\n");
            System.out.println("Mời bạn nhập chức năng của Menu: ");
            choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        employeeManagementController.displaymenuEmployeement();
                        break;
                    case 2:
                       customerManagementController.displayMenuCustomer();
                        break;
                    case 3:
                       facilityManagementController.displayMenuFacility();
                        break;
                    case 4:
                        bookingManagementController.displayMenuBooking();
                        break;
                    case 5:
                        System.out.println("1.\tDisplay list customers use service\n" +
                                "2.\tDisplay list customers get voucher\n" +
                                "3.\tReturn main menu\n");
                        break;
                    case 6:
                        System.exit(0);
                }
            }
        while (true);
        }


    }


