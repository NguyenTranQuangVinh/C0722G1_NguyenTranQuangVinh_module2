package FuramaResort.Models;

public class Employee extends Person {
    private int employeeCode;
    private String level;
    private String position;
    private Double wage;

    public Employee() {

    }
    public Employee(int employeeCode, String fullName, String dateOfBirth, String gender, int identityCardNumber, int phoneNumber, String email, String level, String position, Double wage) {
        super(fullName, dateOfBirth, gender, identityCardNumber, phoneNumber, email);
        this.employeeCode = employeeCode;
        this.level = level;
        this.position = position;
        this.wage = wage;
    }

    public int getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(int employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getWage() {
        return wage;
    }

    public void setWage(Double wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Employee{" + "employeeCode=" + employeeCode +
                super.toString() +
                ", level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", wage=" + wage +
                '}';
    }
    public String convertLine() {
        String COMMA = ",";
        return this.employeeCode  + COMMA + super.convertLine()+ COMMA + this.level + COMMA + position + COMMA + wage;
    }

}
