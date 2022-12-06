package FuramaResort.Services.impl;

import FuramaResort.Models.Employee;
import FuramaResort.Services.IEmployeeService;
import FuramaResort.Utils.ReadFile;
import FuramaResort.Utils.WriteFile;

import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService {
    Scanner scanner = new Scanner(System.in);
//    public static ArrayList<Employee> employeeArrayList = new ArrayList<>();
    final String PATH_EMPLOYEE = "src\\FuramaResort\\Data\\employee.csv";


    public void writeFile(List<Employee> employeeArrayList) {
        WriteFile.writeFileEmployee(PATH_EMPLOYEE, employeeArrayList);
    }

    @Override
    public void displayEmployee() {
        List<Employee> employees = ReadFile.readFileEmployee(PATH_EMPLOYEE);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    @Override
    public void addEmployee() {
        List<Employee> employees = ReadFile.readFileEmployee(PATH_EMPLOYEE);
        Employee employee = new Employee();
        System.out.println("Vui lòng điền thông tin sau: ");
        System.out.println("mã nhân viên");
        employee.setEmployeeCode(Integer.parseInt(scanner.nextLine()));
        System.out.println("Họ và tên: ");
        employee.setFullName(scanner.nextLine());
        System.out.println("Ngày sinh:");
        employee.setDateOfBirth((scanner.nextLine()));
        System.out.println("Giới Tính: ");
        employee.setGender(scanner.nextLine());
        System.out.println("số chứng minh nhân dân: ");
        employee.setIdentityCardNumber(Integer.parseInt(scanner.nextLine()));
        System.out.println("số điện thoại: ");
        employee.setPhoneNumber(Integer.parseInt(scanner.nextLine()));
        System.out.println("email: ");
        employee.setEmail(scanner.nextLine());
        System.out.println("Trình độ: ");
        employee.setLevel(scanner.nextLine());
        System.out.println("Vị trí: ");
        employee.setPosition(scanner.nextLine());
        System.out.println("Lương: ");
        employee.setWage(Integer.parseInt(scanner.nextLine()));
        employees.add(employee);
        writeFile(employees);

    }

    @Override
    public void deleteEmployee() {
        List<Employee> employees = ReadFile.readFileEmployee(PATH_EMPLOYEE);
        System.out.println("Nhập vào mã nhân viên muốn xóa");
        int id = Integer.parseInt(scanner.nextLine());
        Employee deletedEmployee = null;
        for (Employee employee : employees) {
            if (employee.getEmployeeCode() == id) {
                deletedEmployee = employee;
                break;
            }
        }

        if (deletedEmployee != null) {
            employees.remove(deletedEmployee);
            System.out.println("Đã xóa thành công:). ");
            writeFile(employees);
        }


        System.out.println("Không tìm thấy mã nhân viên.");
    }

    @Override
    public void editEmployee() {
        List<Employee> employees = ReadFile.readFileEmployee(PATH_EMPLOYEE);
        System.out.println("Nhập vào mã nhân viên muốn sửa:");
        int id = Integer.parseInt(scanner.nextLine());
        for (Employee employee : employees){
            if (employee.getEmployeeCode()==id){
                System.out.println("Nhập lại mã nhân viên mới:");
                employee.setEmployeeCode(Integer.parseInt(scanner.nextLine()));
                System.out.println("Nhập lại tên mới: ");
                employee.setFullName(scanner.nextLine());
                System.out.println("Nhập lại ngày tháng năm sinh mới: ");
                employee.setDateOfBirth(scanner.nextLine());
                System.out.println("Nhập lại giới tính mới: ");
                employee.setGender(scanner.nextLine());
                System.out.println("Nhập lại số CMND mới: ");
                employee.setIdentityCardNumber(Integer.parseInt(scanner.nextLine()));
                System.out.println("Nhập lại số điện thoại nhân viên mới: ");
                employee.setPhoneNumber(Integer.parseInt(scanner.nextLine()));
                System.out.println("Nhập lại email mới: ");
                employee.setEmail(scanner.nextLine());
                System.out.println("Nhập lại trình độ mới: ");
                employee.setLevel(scanner.nextLine());
                System.out.println("Nhập lại vị trí mới: ");
                employee.setPosition(scanner.nextLine());
                System.out.println("Nhập lại lương của nhân viên mới: ");
                employee.setWage(Integer.parseInt(scanner.nextLine()));
                writeFile(employees);
                return;
            }
        }
        System.out.println("Không tìm thấy mã nhân viên:");

    }

//    public int search(int e) {
//        List<Employee> employees = ReadFile.readFileEmployee(PATH_EMPLOYEE);
//        for (int i = 0; i < employees.size(); i++) {
//            if (employees.get(i).getEmployeeCode() == e) {
//                return i;
//            }
//        }
//        return -1;
//    }
}
