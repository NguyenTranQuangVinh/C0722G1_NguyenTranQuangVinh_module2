package FuramaResort.Models;

public abstract class Facility {
    private String idService;
    private String nameService;
    private double area;
    private double costs;
    private int amount;
    private String rentalType;

    protected Facility() {
    }

    protected Facility(String idService, String nameService, double area, double costs, int amount, String rentalType) {
        this.idService = idService;
        this.nameService = nameService;
        this.area = area;
        this.costs = costs;
        this.amount = amount;
        this.rentalType = rentalType;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
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

    public void setArea(double area) {
        this.area = area;
    }

    public double getCosts() {
        return costs;
    }

    public void setCosts(double costs) {
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
        return "Facility{" +
                "idService='" + idService + '\'' +
                ", nameService='" + nameService + '\'' +
                ", area=" + area +
                ", costs=" + costs +
                ", amount=" + amount +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }

    public String convertLine(){
        String COMMA=",";
        return this.idService+COMMA+ this.nameService+COMMA+this.area+COMMA+this.costs+COMMA+this.amount+COMMA+this.rentalType;
    }
}
