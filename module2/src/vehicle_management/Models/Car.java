package vehicle_management.Models;


public class Car extends Vehicle {
    private int NumberOfSeats;
    private String vehicleType;

    public Car() {
    }

    public Car(int sea​OfControl, String manufacturerIsName, int yearOfManufacture, String owner, int numberOfSeats, String vehicleType) {
        super(sea​OfControl, manufacturerIsName, yearOfManufacture, owner);
        NumberOfSeats = numberOfSeats;
        this.vehicleType = vehicleType;
    }

    public int getNumberOfSeats() {
        return NumberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        NumberOfSeats = numberOfSeats;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getInfo() {
        return getSea​OfControl() + "," + getManufacturerIsName() + "," + getYearOfManufacture() + "," + getOwner() + "," + getNumberOfSeats() + "," + getVehicleType();
    }

    @Override
    public String toString() {
        return "Car{" + super.toString() +
                "NumberOfSeats=" + NumberOfSeats +
                ", vehicleType='" + vehicleType + '\'' +
                '}';
    }

    public String convertLine() {
        String comma = ",";
        return super.convertLine() + comma + NumberOfSeats + comma + vehicleType;
    }


}
