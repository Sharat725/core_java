package javaequals;

public class ClothDetails {

    int cloth_cost;
    String cloth_color;
    char cloth_size;

    ClothDetails(int cloth_cost, String cloth_color, char cloth_size) {

        this.cloth_cost = cloth_cost;
        this.cloth_color = cloth_color;
        this.cloth_size = cloth_size;

    }

    public boolean equals(Object obj) {

        ClothDetails cl2 = (ClothDetails)obj;

        return this.cloth_cost == cl2.cloth_cost;
    }

    public static void main(String[] args) {

        ClothDetails cl1 = new ClothDetails(7000, "Red & Black", 'L');

       

        ClothDetails cl2 = new ClothDetails(5000, "Blue & White", 'M');

        

        if(cl1.equals(cl2)) {

            System.out.println("Same");

        } else {

            System.out.println("Diff");
        }

    }

}