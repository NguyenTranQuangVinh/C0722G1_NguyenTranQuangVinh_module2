package FuramaResort.Controllers;

import FuramaResort.Services.impl.FacilityServiceImpl;

import java.util.Scanner;

public class FacilityManagementController {
    Scanner scanner = new Scanner(System.in);
    int choice;
    FacilityServiceImpl iFacilityService = new FacilityServiceImpl();
    public void displayMenuFacility(){
        do {
            System.out.println("1\tDisplay list facility\n" +
                    "2\tAdd new facility\n" +
                    "3\tDisplay list facility maintenance\n" +
                    "4\tReturn main menu\n");
            System.out.println("enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    iFacilityService.displayFacility();
                    break;
                case 2:
                    add();
                case 3:
                  iFacilityService.displayMaintenance();
                  break;
                case 4:
                    return;
            }
        }while (true);
    }

    private void add() {
        System.out.println("1. Add Room."+
                "2. Add Villa."+
                "3.Exit"+
                "4.Return");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                iFacilityService.addRoom();
                break;
            case 2:
                iFacilityService.addVilla();
                break;
            case 3:
                System.exit(0);
                break;
            case 4:
                return;
        }
    }

}
