package FuramaResort.Models;

public class Customer extends Person {
    private int customerCode;
    private String typeOfGuest;
    private String address;

    public Customer() {
    }

    public Customer(String fullName, String dateOfBirth, String gender, int identityCardNumber, int phoneNumber, String email, int customerCode, String typeOfGuest, String address) {
        super(fullName, dateOfBirth, gender, identityCardNumber, phoneNumber, email);
        this.customerCode = customerCode;
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }

    public int getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(int customerCode) {
        this.customerCode = customerCode;
    }

    public String getTypeOfGuest() {
        return typeOfGuest;
    }

    public void setTypeOfGuest(String typeOfGuest) {
        this.typeOfGuest = typeOfGuest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerCode=" + customerCode +
                super.toString() +
                ", typeOfGuest='" + typeOfGuest + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String convertLine() {
        String COMMA = ",";
        return this.customerCode + COMMA + super.convertLine() + COMMA + this.typeOfGuest + COMMA + this.address;
    }
}
