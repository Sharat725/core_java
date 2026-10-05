package javatoString;

public class BikeDetails {

    int bike_cost;
    String bike_brand;
    String bike_color;

    BikeDetails(int bike_cost, String bike_brand, String bike_color) {
        this.bike_cost = bike_cost;
        this.bike_brand = bike_brand;
        this.bike_color = bike_color;
    }

    public String toString() {
        return this.bike_cost + " " + this.bike_brand + " " + this.bike_color;
    }

    public static void main(String[] args) {

        BikeDetails b1 = new BikeDetails(120000, "BMW", "Black");
        System.out.println(b1);

        BikeDetails b2 = new BikeDetails(150000, "Yamaha", "Blue");
        System.out.println(b2);
    }
}

