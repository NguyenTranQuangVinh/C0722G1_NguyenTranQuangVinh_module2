package FuramaResort.Controllers;

import FuramaResort.Services.IBookingService;
import FuramaResort.Services.impl.BookingServiceImpl;

import java.util.Scanner;

public class BookingManagementController {
    IBookingService iBookingService = new BookingServiceImpl();
    Scanner scanner = new Scanner(System.in);
    int choice;
    public void displayMenuBooking(){
        do {
            System.out.println("1.\tAdd new booking\n" +
                    "2.\tDisplay list booking\n" +
                    "3.\tReturn main menu\n");
            System.out.println("Vui lòng chọn chức năng:");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    iBookingService.addBooking();
                    break;
                case 2:
                    iBookingService.display();
                    break;
                case 3:
                    return;
            }
        }while (true);
    }

}
