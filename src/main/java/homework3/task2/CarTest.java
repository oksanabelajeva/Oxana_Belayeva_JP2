package homework3.task2;

public class CarTest {

    public static void main(String[] args) {
        Car carLexus = new Car();
        carLexus.setColor("Cherry");
        carLexus.setManufacturer("Lexus IS 200t");
        carLexus.setYear(2016);

        System.out.println("I would like to have " + carLexus.getManufacturer()
                + " which color is " + carLexus.getColor() +
                ". It was manufactured in " + carLexus.getYear() + ".");

    }
}
