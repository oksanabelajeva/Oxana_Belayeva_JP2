package lesson3;

public class Product {
    private String name;
    private double regularPrice;
    private double discount;

    public static double calculateActualPrice(double regularPrice, double discount){
        return regularPrice/100*(100-discount);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Product : name = " + name +
                ", regularPrice = " + regularPrice + " EUR" +
                ", discount = " + (int)discount + "%, actual price = "
                + calculateActualPrice(regularPrice, discount) + " EUR";
    }
}
