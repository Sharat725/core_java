package javaequals;


public class CarDetails {

    String car_name;
    int car_cost;
    String car_type;

    CarDetails(String car_name, int car_cost, String car_type) {

        this.car_name = car_name;
        this.car_cost = car_cost;
        this.car_type = car_type;

    }

    public boolean equals(Object obj) {

        CarDetails c2 = (CarDetails)obj;

        return this.car_cost == c2.car_cost;
    }

    public static void main(String[] args) {

        CarDetails c1 = new CarDetails("Maruthi Suzuki", 500000, "Petrol");



        CarDetails c2 = new CarDetails("Hyundai", 800000, "Diesel");

   

        if(c1.equals(c2)) {

            System.out.println("Same");

        } else {

            System.out.println("Diff");
        }

    }

}
