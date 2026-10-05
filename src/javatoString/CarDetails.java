package javatoString;

public class CarDetails {

    String car_name;
    int car_cost;
    String car_type;

    CarDetails(String car_name, int car_cost, String car_type) {
        this.car_name = car_name;
        this.car_cost = car_cost;
        this.car_type = car_type;
    }

    public String toString() {
        return this.car_name + " " + this.car_cost + " " + this.car_type;
    }

    public static void main(String[] args) {

        CarDetails c1 = new CarDetails("Maruthi Suzuki", 500000, "Petrol");
        System.out.println(c1);

        CarDetails c2 = new CarDetails("Hyundai", 800000, "Diesel");
        System.out.println(c2);
    }
}
