package FuramaResort.Models;

public abstract class Facility {
    private String nameService;
    private Double area;
    private int costs;
    private int amount;
    private String rentalType;

    public Facility() {
    }

    protected Facility(String nameService, Double area, int costs, int amount, String rentalType) {
        this.nameService = nameService;
        this.area = area;
        this.costs = costs;
        this.amount = amount;
        this.rentalType = rentalType;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public double getCosts() {
        return costs;
    }

    public void setCosts(int costs) {
        this.costs = costs;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return
                "nameService='" + nameService + '\'' +
                ", area=" + area +
                ", costs=" + costs +
                ", amount=" + amount +
                ", rentalType='" + rentalType + '\'';
    }
}
