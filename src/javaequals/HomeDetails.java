package javaequals;

public class HomeDetails {

    int home_cost;
    String home_color;
    String home_name;

    HomeDetails(int home_cost, String home_color, String home_name) {

        this.home_cost = home_cost;
        this.home_color = home_color;
        this.home_name = home_name;

    }

    public boolean equals(Object obj) {

        HomeDetails h2 = (HomeDetails)obj;

        return this.home_cost == h2.home_cost;
    }

    public static void main(String[] args) {

        HomeDetails h1 = new HomeDetails(12000000, "ROG", "Republic of gamers");

       

        HomeDetails h2 = new HomeDetails(15000000, "White", "Gaming House");

      

        if(h1.equals(h2)) {

            System.out.println("Same");

        } else {

            System.out.println("Diff");
        }

    }

}
