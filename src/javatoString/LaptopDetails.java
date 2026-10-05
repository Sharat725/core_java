package javatoString;

public class LaptopDetails {

    int laptop_cost;
    String laptop_brand;
    String laptop_name;

    LaptopDetails(int laptop_cost, String laptop_brand, String laptop_name) {
        this.laptop_cost = laptop_cost;
        this.laptop_brand = laptop_brand;
        this.laptop_name = laptop_name;
    }

    public String toString() {
        return this.laptop_cost + " " + this.laptop_brand + " " + this.laptop_name;
    }

    public static void main(String[] args) {

        LaptopDetails l1 = new LaptopDetails(70000, "ROG", "Republic of gamers");
        System.out.println(l1);

        LaptopDetails l2 = new LaptopDetails(90000, "ASUS", "Gaming Laptop");
        System.out.println(l2);
    }
}

