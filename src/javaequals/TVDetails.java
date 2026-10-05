package javaequals;

public class TVDetails {

    int tv_cost;
    String tv_brand;
    String tv_type;

    TVDetails(int tv_cost, String tv_brand, String tv_type) {

        this.tv_cost = tv_cost;
        this.tv_brand = tv_brand;
        this.tv_type = tv_type;

    }

    public boolean equals(Object obj) {

        TVDetails t2 = (TVDetails)obj;

        return this.tv_cost == t2.tv_cost;
    }

    public static void main(String[] args) {

        TVDetails t1 = new TVDetails(40000, "SAMSUNG", "LED");


        TVDetails t2 = new TVDetails(60000, "LG", "OLED");

        if(t1.equals(t2)) {

            System.out.println("Same");

        } else {

            System.out.println("Diff");
        }

    }

}
