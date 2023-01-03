package FuramaResort.Controllers;

import FuramaResort.Services.IEmployeeService;
import FuramaResort.Services.impl.EmployeeServiceImpl;
import java.util.Scanner;

public class EmployeeManagementController {
    Scanner scanner = new Scanner(System.in);
    int choice;
    IEmployeeService iEmployeeService = new EmployeeServiceImpl();

    public void displaymenuEmployeement() {

        do {
            try {

            System.out.println("1\tDisplay list employees\n" +
                    "2\tAdd new employee\n" +
                    "3\tDelete employee\n" +
                    "4\tEdit employee\n" +
                    "5\tReturn main menu\n");
            System.out.print("enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    iEmployeeService.displayEmployee();
                    break;
                case 2:
                    iEmployeeService.addEmployee();
                    break;
                case 3:
                    iEmployeeService.deleteEmployee();
                    break;
                case 4:
                    iEmployeeService.editEmployee();
                    break;
                case 5:
                    return;
            }
        }catch (NumberFormatException e){
                System.err.println("Input Number");
            }
        }

        while (true);
    }
}
//    public static ArrayList<Employee> employeeArrayList = new ArrayList<>();
//    final String PATH_EMPLOYEE = "src\\FuramaResort\\Data\\employee.csv";
//
//    public void readFile() {
//        ReadFile.readFileEmployee(PATH_EMPLOYEE);
//    }
//
//    public void writeFile() {
//        WriteFile.writeFileEmployee(PATH_EMPLOYEE, employeeArrayList);
//    }
//
//    public void editEmployee() {
//
//        System.out.println("Nhập mã nhân viên cần sửa: ");
//        int id = Integer.parseInt(scanner.nextLine());
//        for (int i = 0; i < EmployeeServiceImpl.employeeArrayList.size(); i++) {
//            if (id == EmployeeServiceImpl.employeeArrayList.get(i).getEmployeeCode()) {
//                int index;
//                index = iEmployeeService.search(id);
//                if (index != 1) {
//                    do {
//                        readFile();
//                        int choice;
//                        System.out.println("1.sửa mã nhân viên +\n" +
//                                "2.Sửa ngày tháng năm sinh. +\n" +
//                                "3.sửa giới tính. +\n" +
//                                "4.sửa CMND +\n" +
//                                "5.Sửa SDT nhân viên. +\n" +
//                                "6.sửa email +\n" +
//                                "7.Sửa tên +\n" +
//                                "8.sửa trình độ +\n" +
//                                "9.Sửa vị trí. +\n" +
//                                "10.Sửa lương của nhân viên.+\n" +
//                                "11.Quay lại. ");
//                        System.out.println("enter choice: ");
//                        choice = Integer.parseInt(scanner.nextLine());
//                        switch (choice) {
//                            case 1:
//                                System.out.println("Nhập lại mã nhân viên mới:");
//                                EmployeeServiceImpl.employeeArrayList.get(i).setEmployeeCode(Integer.parseInt(scanner.nextLine()));
//                                System.out.println("Đã sửa mã nhân viên thành công.");
//                                break;
//                            case 2:
//                                System.out.println("Nhập lại ngày tháng năm sinh mới: ");
//                                EmployeeServiceImpl.employeeArrayList.get(i).setDateOfBirth(scanner.nextLine());
//                                System.out.println("Đã sửa ngày tháng năm sinh thành công.");
//                                break;
//                            case 3:
//                                System.out.println("Nhập lại giới tính mới: ");
//                                EmployeeServiceImpl.employeeArrayList.get(i).setGender(scanner.nextLine());
//                                System.out.println("Đã sửa giới tính thành công.");
//                                break;
//                            case 4:
//                                System.out.println("Nhập lại số CMND mới: ");
//                                EmployeeServiceImpl.employeeArrayList.get(i).setIdentityCardNumber(Integer.parseInt(scanner.nextLine()));
//                                System.out.println("Đã sửa số CMND thành công.");
//                                break;
//                            case 5:
//                                System.out.println("Nhập lại số điện thoại nhân viên mới: ");
//                                EmployeeServiceImpl.employeeArrayList.get(i).setPhoneNumber(Integer.parseInt(scanner.nextLine()));
//                                System.out.println("Đã sửa số điện thoại nhân viên thành công.");
//                                break;
//                            case 6:
//                                System.out.println("Nhập lại email mới: ");
//                                EmployeeServiceImpl.employeeArrayList.get(i).setEmail((scanner.nextLine()));
//                                System.out.println("Đã sửa email thành công.");
//                                break;
//                            case 7:
//                                System.out.println("Nhập lại tên mới: ");
//                                EmployeeServiceImpl.employeeArrayList.get(i).setFullName((scanner.nextLine()));
//                                System.out.println("Đã sửa tên thành công.");
//                                break;
//                            case 8:
//                                System.out.println("Nhập lại trình độ mới: ");
//                                EmployeeServiceImpl.employeeArrayList.get(i).setLevel((scanner.nextLine()));
//                                System.out.println("Đã sửa trình độ thành công.");
//                                break;
//                            case 9:
//                                System.out.println("Nhập lại vị trí mới: ");
//                                EmployeeServiceImpl.employeeArrayList.get(i).setPosition((scanner.nextLine()));
//                                System.out.println("Đã sửa vị trí thành công.");
//                                break;
//                            case 10:
//                                System.out.println("Nhập lại lương của nhân viên mới: ");
//                                EmployeeServiceImpl.employeeArrayList.get(i).setWage(Integer.parseInt(scanner.nextLine()));
//                                System.out.println("Đã sửa lương của nhân viên thành công.");
//                                break;
//                            case 11:
//                                return;
//                        }
//                        writeFile();
//                    } while (true);
//                }
//            }
//            System.out.println("Không tìm thấy mã nhân viên!");
//        }


