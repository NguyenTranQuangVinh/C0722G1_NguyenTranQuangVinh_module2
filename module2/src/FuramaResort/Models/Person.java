package FuramaResort.Models;

public abstract class Person {
    private String fullName;
    private String dateOfBirth;
    private String gender;
    private int identityCardNumber;
    private int phoneNumber;
    private String email;

    protected Person() {
    }

    protected Person(String fullName, String dateOfBirth, String gender, int identityCardNumber, int phoneNumber, String email) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.identityCardNumber = identityCardNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String isGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getIdentityCardNumber() {
        return identityCardNumber;
    }

    public void setIdentityCardNumber(int identityCardNumber) {
        this.identityCardNumber = identityCardNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return
                ",fullName='" + fullName + '\'' +
                        ", dateOfBirth=" + dateOfBirth +
                        ", gender=" + gender +
                        ", identityCardNumber=" + identityCardNumber +
                        ", phoneNumber=" + phoneNumber +
                        ", email='" + email + '\'';
    }

    public String convertLine() {
        String COMMA = ",";
        return this.fullName + COMMA + this.dateOfBirth + COMMA + this.gender + COMMA + this.identityCardNumber + COMMA + this.phoneNumber + COMMA + this.email;
    }
}
