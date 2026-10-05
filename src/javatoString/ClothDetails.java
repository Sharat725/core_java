package javatoString;

public class ClothDetails {

    int cloth_cost;
    String cloth_color;
    char cloth_size;

    ClothDetails(int cloth_cost, String cloth_color, char cloth_size) {
        this.cloth_cost = cloth_cost;
        this.cloth_color = cloth_color;
        this.cloth_size = cloth_size;
    }

    public String toString() {
        return this.cloth_cost + " " + this.cloth_color + " " + this.cloth_size;
    }

    public static void main(String[] args) {

        ClothDetails cl1 = new ClothDetails(7000, "Red & Black", 'L');
        System.out.println(cl1);

        ClothDetails cl2 = new ClothDetails(5000, "Blue & White", 'M');
        System.out.println(cl2);
    }
}
