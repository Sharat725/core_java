package javaequals;

public class LaptopDetails {

    int laptop_cost;
    String laptop_brand;
    String laptop_name;

    LaptopDetails(int laptop_cost, String laptop_brand, String laptop_name) {

        this.laptop_cost = laptop_cost;
        this.laptop_brand = laptop_brand;
        this.laptop_name = laptop_name;

    }

    public boolean equals(Object obj) {

        LaptopDetails l2 = (LaptopDetails)obj;

        return this.laptop_cost == l2.laptop_cost;
    }

    public static void main(String[] args) {

        LaptopDetails l1 = new LaptopDetails(70000, "ROG", "Republic of gamers");

        

        LaptopDetails l2 = new LaptopDetails(90000, "ASUS", "Gaming Laptop");

        

        if(l1.equals(l2)) {

            System.out.println("Same");

        } else {

            System.out.println("Diff");
        }

    }

}