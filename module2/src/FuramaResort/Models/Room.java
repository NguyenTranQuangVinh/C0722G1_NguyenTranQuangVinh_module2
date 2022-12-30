package FuramaResort.Models;

public class Room extends Facility {
    private String freeServiceIncluded;

    public Room() {
    }

    public Room(String idService, String nameService, double area, double costs, int amount, String rentalType, String freeServiceIncluded) {
        super(idService, nameService, area, costs, amount, rentalType);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public String toString() {
        return "Room{" +super.toString()+
                "freeServiceIncluded='" + freeServiceIncluded + '\'' +
                '}';
    }
    public String convertLine(){
        String COMMA=",";
        return super.convertLine()+COMMA+this.freeServiceIncluded;
    }
}
