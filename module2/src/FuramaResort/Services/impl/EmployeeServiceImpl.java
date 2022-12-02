package FuramaResort.Services.impl;

import FuramaResort.Models.Employee;
import FuramaResort.Services.IEmployeeService;
import FuramaResort.Utils.ReadFile;
import FuramaResort.Utils.WriteFile;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService {
    Scanner scanner = new Scanner(System.in);
    public static ArrayList<Employee> employeeArrayList = new ArrayList<>();
    final String PATH_EMPLOYEE = "src\\FuramaResort\\Data\\employee.csv";

    public void readFile() {
        ReadFile.readFileEmployee(PATH_EMPLOYEE);
    }

    public void writeFile() {
        WriteFile.writeFileEmployee(PATH_EMPLOYEE, employeeArrayList);
    }

    @Override
    public void displayEmployee() {
        for (Employee employee : employeeArrayList) {
            System.out.println(employee);
        }
    }

    @Override
    public void addEmployee() {
        readFile();
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
        employeeArrayList.add(employee);
        writeFile();
    }

    @Override
    public void deleteEmployee() {
        readFile();
        System.out.println("Nhập vào mã nhân viên muốn xóa");
        int id = Integer.parseInt(scanner.nextLine());
        for (Employee employee : employeeArrayList) {
            if (employee.getEmployeeCode() == id) {
                employeeArrayList.remove(employee);
                System.out.println("Đã xóa thành công:). ");
                writeFile();
                return;
            }
        }
        System.out.println("Không tìm thấy mã nhân viên.");
    }

    public int search(int e) {
        readFile();
        for (int i = 0; i < employeeArrayList.size(); i++) {
            if (employeeArrayList.get(i).getEmployeeCode() == e) {
                return i;
            }
        }
        return -1;
    }
}
