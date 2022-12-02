package vehicle_management.Models;

public class Motorcycle extends Vehicle {
    private String wattage;

    public Motorcycle() {
    }

    public Motorcycle(int sea​OfControl, String manufacturerIsName, int yearOfManufacture, String owner, String wattage) {
        super(sea​OfControl, manufacturerIsName, yearOfManufacture, owner);
        this.wattage = wattage;
    }

    public String getWattage() {
        return wattage;
    }

    public void setWattage(String wattage) {
        this.wattage = wattage;
    }

    @Override
    public String toString() {
        return "Motorcycle{" + super.toString() +
                "wattage='" + wattage + '\'' +
                '}';
    }

    public String convertLine() {
        String comma = ",";
        return super.convertLine() + comma + wattage;
    }
}
