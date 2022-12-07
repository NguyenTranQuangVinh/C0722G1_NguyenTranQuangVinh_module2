package FuramaResort.Models;

public class Room extends Facility {
    private String freeServiceIncluded;

    public Room() {
    }

    public Room(String nameService, Double area, int costs, int amount, String rentalType, String freeServiceIncluded) {
        super(nameService, area, costs, amount, rentalType);
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
        String comma=",";
        return super.convertLine()+comma+this.freeServiceIncluded;
    }
}
