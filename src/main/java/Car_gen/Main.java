package Car_gen;

public class Main {
    public static void main(String[] args) {
        Honda civic= new Honda( true,"Black",2015, 4);
//        Lexus  rx350 = new Lexus(color: "Red", year 2019, maxSpeed 190, isTurboCharged true);
//        Toyota supra= new Toyota color: "Yellow", year 2019, maxSpeed 190, isTurboCharged true);
        civic.acceleratedSpeed();
        civic.decelerateSpeed();

        System.out.println( civic.isSpeed());
//        Lexus.accelerateSpeed(rx350);
//        Toyota.accelerateSpeed(supra);

        System.out.println(civic.getColor());
//        System.out.println(Lexus.getColor());
//        System.out.println(Honda.getColor());



     }
}
