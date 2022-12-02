package FuramaResort.Services.impl;

import FuramaResort.Models.Customer;
import FuramaResort.Services.ICustomerService;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService {
    Scanner scanner = new Scanner(System.in);
    public static ArrayList<Customer> customerArrayList = new ArrayList<>();

    @Override
    public void displayCustomer() {
        for (Customer customer : customerArrayList) {
            System.out.println(customer);
        }
    }

    @Override
    public void addCustomer() {
        Customer customer = new Customer();
        System.out.println("Vui lòng điền thông tin sau:");
        System.out.println("Mã khách hàng:");
        customer.setCustomerCode(Integer.parseInt(scanner.nextLine()));
        System.out.println("Họ và tên:");
        customer.setFullName(scanner.nextLine());
        System.out.println("Ngày sinh:");
        customer.setDateOfBirth((scanner.nextLine()));
        System.out.println("Giới Tính: ");
        customer.setGender(scanner.nextLine());
        System.out.println("số chứng minh nhân dân:");
        customer.setIdentityCardNumber(Integer.parseInt(scanner.nextLine()));
        System.out.println("số điện thoại: ");
        customer.setPhoneNumber(Integer.parseInt(scanner.nextLine()));
        System.out.println("email: ");
        customer.setEmail(scanner.nextLine());
        System.out.println("Loại khách: ");
        customer.setTypeOfGuest(scanner.nextLine());
        System.out.println("Địa chỉ: ");
        customer.setAddress(scanner.nextLine());
    }
public int search(int e){
    for (int i = 0; i <customerArrayList.size() ; i++) {
        if (customerArrayList.get(i).getCustomerCode() == e){
            return i;
        }
    }
    return -1;
}
}
