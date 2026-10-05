package javatoString;

public class Mobile {
    double mb_cost;
    String mb_name;
    String mb_color;
    Mobile(double mb_cost, String mb_name,String mb_color) {
	this.mb_cost = mb_cost;
	this.mb_name = mb_name;
	this.mb_color = mb_color;
	}
    public String toString() {
    return	this.mb_cost+" "+this.mb_name+" "+this.mb_color;
    }
public static void main(String[] args) {
	Mobile m1 = new Mobile(50000,"iPhone","Red");
	System.out.println(m1);
	Mobile m2 = new Mobile(500000,"iPhone Pro max","Blue");
	System.out.println(m2);
}
}
