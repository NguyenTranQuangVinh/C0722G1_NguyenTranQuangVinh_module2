package FuramaResort.Services.impl;

import FuramaResort.Models.Customer;
import FuramaResort.Services.ICustomerService;
import FuramaResort.Utils.ExceptionHandling;
import FuramaResort.Utils.ReadFile;
import FuramaResort.Utils.Regex;
import FuramaResort.Utils.WriteFile;

import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService {
    Scanner scanner = new Scanner(System.in);
    private ExceptionHandling exceptionHandling = new ExceptionHandling();
    private Regex regex = new Regex();
//    public static ArrayList<Customer> customerArrayList = new ArrayList<>();
    final String PATH_CUSTOMER = "src\\FuramaResort\\Data\\customer.csv";

    public void writeFile(List<Customer>customerArrayList) {
        WriteFile.writeFileCustomer(PATH_CUSTOMER, customerArrayList);
    }

    @Override
    public void displayCustomer() {
        List<Customer>customers = ReadFile.readFileCustomer(PATH_CUSTOMER);
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    @Override
    public void addCustomer() {
        List<Customer>customers = ReadFile.readFileCustomer(PATH_CUSTOMER);
        Customer customer = new Customer();
        System.out.println("Vui lòng điền thông tin sau:");
        System.out.println("Mã khách hàng:");
        customer.setCustomerCode(exceptionHandling.enterPositiveInteger());
        System.out.println("Họ và tên:");
        customer.setFullName(regex.enterWord());
        System.out.println("Ngày sinh:");
        customer.setDateOfBirth((scanner.nextLine()));
        System.out.println("Giới Tính: ");
        customer.setGender(regex.enterWord());
        System.out.println("số chứng minh nhân dân:");
        customer.setIdentityCardNumber(exceptionHandling.enterPositiveInteger());
        System.out.println("số điện thoại: ");
        customer.setPhoneNumber(exceptionHandling.enterPositiveInteger());
        System.out.println("email: ");
        customer.setEmail(regex.enterEmail());
        System.out.println("Loại khách: ");
        customer.setTypeOfGuest(scanner.nextLine());//thiếu regex
        System.out.println("Địa chỉ: ");
        customer.setAddress(regex.enterWord());
        customers.add(customer);
        writeFile(customers);
    }

    @Override
    public void editCustomer() {
        List<Customer>customers = ReadFile.readFileCustomer(PATH_CUSTOMER);
        System.out.println("Nhập vào mã khách hàng muốn sửa:");
        int id = Integer.parseInt(scanner.nextLine());
        for (Customer customer:customers) {
            if (customer.getCustomerCode()==id){
                System.out.println("Nhập lại mã khách hàng mới: ");
                customer.setCustomerCode(exceptionHandling.enterPositiveInteger());
                System.out.println("Nhập lại họ tên khách hàng mới: ");
                customer.setFullName(regex.enterWord());
                System.out.println("Nhập lại ngày tháng năm khách hàng mới: ");
                customer.setDateOfBirth(scanner.nextLine());
                System.out.println("Nhập lại giới tính khách hàng mới: ");
                customer.setGender(regex.enterWord());
                System.out.println("Nhập lại số CMND mới khách hàng mới: ");
                customer.setIdentityCardNumber(exceptionHandling.enterPositiveInteger());
                System.out.println("Nhập lại số điện thoại khách hàng mới: ");
                customer.setPhoneNumber(exceptionHandling.enterPositiveInteger());
                System.out.println("Nhập lại email khách hàng mới: ");
                customer.setEmail(regex.enterEmail());
                System.out.println("Nhập lại loại khách hàng mới: ");//thiếu regex
                customer.setTypeOfGuest(scanner.nextLine());
                System.out.println("Nhập lại địa chỉ khách hàng mới: ");
                customer.setAddress(regex.enterWord());
                writeFile(customers);
                return;
            }
        }
        System.out.println("Không tìm thấy mã khách hàng:");
    }

//    public int search(int e) {
//        readFile();
//        for (int i = 0; i < customerArrayList.size(); i++) {
//            if (customerArrayList.get(i).getCustomerCode() == e) {
//                return i;
//            }
//        }
//        return -1;
//    }
}
