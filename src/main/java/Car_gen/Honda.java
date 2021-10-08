package Car_gen;

public class Honda extends Car {
    private boolean isTurboCharged;

    public Honda(boolean isTurboCharged, String color, int year, int maxSpeed) {
        super(color,year,maxSpeed);
        this.isTurboCharged = isTurboCharged;
    }

    public boolean isTurboCharged() {
        return isTurboCharged;
    }

    public void setTurboCharged(boolean turboCharged) {
        isTurboCharged = turboCharged;
    }
}
