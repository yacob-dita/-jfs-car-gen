package Car_gen;

public class Lexus extends Car {
    private boolean hasLeatherSeats;

    public Lexus (boolean hasLeatherSeats,String color, int year, int maxSpeed){
        super(color,year,maxSpeed);
        this.hasLeatherSeats = hasLeatherSeats ;


  }

    public boolean isHasLeatherSeats() {
        return hasLeatherSeats;
    }

    public void setHasLeatherSeats(boolean hasLeatherSeats) {
        this.hasLeatherSeats = hasLeatherSeats;
    }
}
