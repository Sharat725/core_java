package Abstractpractice;

abstract class Trapezoid2 {
	abstract void area();
}
class Trapezoid1 extends Trapezoid2{
	void area() {
        int a = 10;
        double result = a*a; 
        System.out.println(result);
	}
}
class Trapezoid{
	public static void main(String[] args) {
		Trapezoid1 c1 = new Trapezoid1();
		c1.area();
	}
}
