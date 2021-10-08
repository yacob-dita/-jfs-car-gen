package Car_gen;

public class Car {
    private String color;
    private int year;
    private int speed = 0;
    private int maxSpeed;
    private boolean isElectric;

    public Car (String color, int year, int maxSpeed ){
        this.color = color;
        this.year= year;
        this.maxSpeed = maxSpeed;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int  isSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

     public int acceleratedSpeed(){
//        int speed = 50;
//         speed = speed+=5;

         if (speed+5 <= maxSpeed ){
             speed = speed+=5;

         } else{
             speed = maxSpeed;
//
             System.out.println(this.speed  + " is not allowed");
         }
         return speed;
}

    public int decelerateSpeed(){
//        int speed = 50;
//         speed = speed-=5;

        if (speed-5 <= maxSpeed ){
            speed = speed-=5;

        } else{
            speed = maxSpeed;
//
            System.out.println(this.speed  + " is not allowed");
        }
        return speed;
    }




}

