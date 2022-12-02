package vehicle_management.Models;

public class Truck extends Vehicle {
    private String Tonnage;

    public Truck() {
    }

    public Truck(int sea​OfControl, String manufacturerIsName, int yearOfManufacture, String owner, String tonnage) {
        super(sea​OfControl, manufacturerIsName, yearOfManufacture, owner);
        Tonnage = tonnage;
    }

    public String getTonnage() {
        return Tonnage;
    }

    public void setTonnage(String tonnage) {
        Tonnage = tonnage;
    }

    @Override
    public String toString() {
        return "Truck{" + super.toString() +
                "Tonnage='" + Tonnage + '\'' +
                '}';
    }

    public String convertLine() {
        String comma = ",";
        return super.convertLine() + comma + Tonnage;
    }
}
