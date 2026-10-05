package javatoString;

public class HomeDetails {

    int home_cost;
    String home_color;
    String home_name;

    HomeDetails(int home_cost, String home_color, String home_name) {
        this.home_cost = home_cost;
        this.home_color = home_color;
        this.home_name = home_name;
    }

    public String toString() {
        return this.home_cost + " " + this.home_color + " " + this.home_name;
    }

    public static void main(String[] args) {

        HomeDetails h1 = new HomeDetails(12000000, "ROG", "Republic of gamers");
        System.out.println(h1);

        HomeDetails h2 = new HomeDetails(15000000, "White", "Gaming House");
        System.out.println(h2);
    }
}
