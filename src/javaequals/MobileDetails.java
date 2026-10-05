package javaequals;

public class MobileDetails {

    double mb_cost;
    String mb_name;
    String mb_color;

    MobileDetails(double mb_cost, String mb_name, String mb_color) {

        this.mb_cost = mb_cost;
        this.mb_name = mb_name;
        this.mb_color = mb_color;

    }

    public boolean equals(Object obj) {

        MobileDetails m2 = (MobileDetails)obj;

        return this.mb_cost == m2.mb_cost;
    }

    public static void main(String[] args) {

        MobileDetails m1 = new MobileDetails(50000, "iPhone", "Red");

        

        MobileDetails m2 = new MobileDetails(500000, "iPhone Pro max", "Blue");

        

        if(m1.equals(m2)) {

            System.out.println("Same");

        } else {

            System.out.println("Diff");
        }

    }

}