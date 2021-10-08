package Car_gen;

public class Toyota extends Car {
    private boolean greatGasMileage;

    public Toyota(boolean greatGasMileage,String color,int year,int maxSpeed) {
        super(color,year,maxSpeed);
        this.greatGasMileage = greatGasMileage;
    }

    public boolean isGreatGasMileage() {
        return greatGasMileage;
    }

    public void setGreatGasMileage(boolean greatGasMileage) {
        this.greatGasMileage = greatGasMileage;
    }
}
