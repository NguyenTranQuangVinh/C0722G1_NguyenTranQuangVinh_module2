package FuramaResort.Controllers;

import FuramaResort.Services.impl.CustomerServiceImpl;

import java.util.Scanner;

public class CustomerManagementController {
    Scanner scanner = new Scanner(System.in);
    int choice;
    CustomerServiceImpl iCustomerService = new CustomerServiceImpl();

    public void displayMenuCustomer() {
        do {
            System.out.println("1.\tDisplay list customers\n" +
                    "2.\tAdd new customer\n" +
                    "3.\tEdit customer\n" +
                    "4.\tReturn main menu\n");
            System.out.print("enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    iCustomerService.displayCustomer();
                    break;
                case 2:
                    iCustomerService.addCustomer();
                    break;
                case 3:
                    editCustomer();
                    break;
                case 4:
                    return;
            }
        }
        while (true);
    }
    public void editCustomer(){
        System.out.println("Nhập mã khách hàng cần sửa: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < CustomerServiceImpl.customerArrayList.size(); i++) {
            if (id == CustomerServiceImpl.customerArrayList.get(i).getCustomerCode()){
                int index;
                index = iCustomerService.search(id);
                if (index != 1){
                    do {
                        int choice;
                        System.out.println("1.sửa mã khách hàng +\n" +
                                " 2.Sửa ngày tháng năm sinh. +\n" +
                                "3.sửa giới tính. +\n" +
                                "4.sửa CMND +\n" +
                                "5.Sửa SDT khách hàng. +\n" +
                                "6.sửa email +\n" +
                                "7.Sửa tên +\n" +
                                "8.Sửa loại khách +\n" +
                                "9.Sửa địa chỉ. +\n" +
                                "10.Quay lại. ");
                        System.out.println("enter choice: ");
                        choice = Integer.parseInt(scanner.nextLine());
                        switch (choice){
                            case 1:
                                System.out.println("Nhập lại mã khách hàng mới: ");
                                CustomerServiceImpl.customerArrayList.get(i).setCustomerCode(Integer.parseInt(scanner.nextLine()));
                                System.out.println("Đã sửa mã khách hàng thành công.");
                                break;
                            case 2:
                                System.out.println("Nhập lại mã khách hàng mới: ");
                                CustomerServiceImpl.customerArrayList.get(i).setDateOfBirth((scanner.nextLine()));
                                System.out.println("Đã sửa mã khách hàng thành công.");
                                break;
                            case 3:
                                System.out.println("Nhập lại mã khách hàng mới: ");
                                CustomerServiceImpl.customerArrayList.get(i).setGender((scanner.nextLine()));
                                System.out.println("Đã sửa mã khách hàng thành công.");
                                break;
                            case 4:
                                System.out.println("Nhập lại mã khách hàng mới: ");
                                CustomerServiceImpl.customerArrayList.get(i).setIdentityCardNumber(Integer.parseInt(scanner.nextLine()));
                                System.out.println("Đã sửa mã khách hàng thành công.");
                                break;
                            case 5:
                                System.out.println("Nhập lại mã khách hàng mới: ");
                                CustomerServiceImpl.customerArrayList.get(i).setPhoneNumber(Integer.parseInt(scanner.nextLine()));
                                System.out.println("Đã sửa mã khách hàng thành công.");
                                break;
                            case 6:
                                System.out.println("Nhập lại mã khách hàng mới: ");
                                CustomerServiceImpl.customerArrayList.get(i).setEmail((scanner.nextLine()));
                                System.out.println("Đã sửa mã khách hàng thành công.");
                                break;
                            case 7:
                                System.out.println("Nhập lại mã khách hàng mới: ");
                                CustomerServiceImpl.customerArrayList.get(i).setFullName((scanner.nextLine()));
                                System.out.println("Đã sửa mã khách hàng thành công.");
                                break;
                            case 8:
                                System.out.println("Nhập lại mã khách hàng mới: ");
                                CustomerServiceImpl.customerArrayList.get(i).setTypeOfGuest((scanner.nextLine()));
                                System.out.println("Đã sửa mã khách hàng thành công.");
                                break;
                            case 9:
                                System.out.println("Nhập lại mã khách hàng mới: ");
                                CustomerServiceImpl.customerArrayList.get(i).setAddress((scanner.nextLine()));
                                System.out.println("Đã sửa mã khách hàng thành công.");
                                break;
                            case 10:
                                return;
                        }
                    }while (true);
                }
            }
            System.out.println("Không tìm thấy mã nhân viên!");
        }
    }
}
