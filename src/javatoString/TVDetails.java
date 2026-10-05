package javatoString;

public class TVDetails {

    int tv_cost;
    String tv_brand;
    String tv_type;

    TVDetails(int tv_cost, String tv_brand, String tv_type) {
        this.tv_cost = tv_cost;
        this.tv_brand = tv_brand;
        this.tv_type = tv_type;
    }

    public String toString() {
        return this.tv_cost + " " + this.tv_brand + " " + this.tv_type;
    }

    public static void main(String[] args) {

        TVDetails t1 = new TVDetails(40000, "SAMSUNG", "LED");
        System.out.println(t1);

        TVDetails t2 = new TVDetails(60000, "LG", "OLED");
        System.out.println(t2);
    }
}
