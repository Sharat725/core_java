package javaequals;


public class BikeDetails {

    int bike_cost;
    String bike_brand;
    String bike_color;

    BikeDetails(int bike_cost, String bike_brand, String bike_color) {
        this.bike_cost = bike_cost;
        this.bike_brand = bike_brand;
        this.bike_color = bike_color;
    }

    public boolean equals(Object obj) {
    		BikeDetails b2=(BikeDetails)obj;
        return this.bike_cost==b2.bike_cost ;
    }

    public static void main(String[] args) {

        BikeDetails b1 = new BikeDetails(120000, "BMW", "Black");
    

        BikeDetails b2 = new BikeDetails(150000, "Yamaha", "Blue");
      
        
        if(b1.equals(b2)) {
        	System.out.println("Same");
        }else {
        	System.out.println("Diff");
        }
    }
}