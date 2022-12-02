package vehicle_management.Models;

public abstract class Vehicle {
    private int sea​OfControl;
    private String manufacturerIsName;
    private int yearOfManufacture;
    private String Owner;

    public Vehicle() {
    }

    public Vehicle(int sea​OfControl, String manufacturerIsName, int yearOfManufacture, String owner) {
        this.sea​OfControl = sea​OfControl;
        this.manufacturerIsName = manufacturerIsName;
        this.yearOfManufacture = yearOfManufacture;
        Owner = owner;
    }

    public int getSea​OfControl() {
        return sea​OfControl;
    }

    public void setSea​OfControl(int sea​OfControl) {
        this.sea​OfControl = sea​OfControl;
    }

    public String getManufacturerIsName() {
        return manufacturerIsName;
    }

    public void setManufacturerIsName(String manufacturerIsName) {
        this.manufacturerIsName = manufacturerIsName;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String owner) {
        Owner = owner;
    }

    @Override
    public String toString() {
        return
                "sea​OfControl=" + sea​OfControl +
                        ", manufacturerIsName='" + manufacturerIsName + '\'' +
                        ", yearOfManufacture=" + yearOfManufacture +
                        ", Owner='" + Owner + '\'' +
                        '}';
    }

    public String convertLine() {
        String comma = ",";
        return sea​OfControl + comma + manufacturerIsName + comma + yearOfManufacture + comma + Owner;
    }
}
