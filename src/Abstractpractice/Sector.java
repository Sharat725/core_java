package Abstractpractice;

abstract class Sector2 {
	abstract void area();
}
class Sector1 extends Sector2{
	void area() {
        final float pi = 3.142f;
        int titha = 20;
        int r = 30;
        double result = pi * r * r * titha; 
        System.out.println(result);
	}
}
class Sector{
	public static void main(String[] args) {
		Sector1 c1 = new Sector1();
		c1.area();
	}
}
