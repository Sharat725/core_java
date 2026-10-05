package Abstractpractice;

abstract class Ellipse2 {
	abstract void area();
}
class Ellipse1 extends Ellipse2{
	void area() {
        final float pi = 3.142f;
        int a = 20;
        int b = 30;
        double result = pi * a * b; 
        System.out.println(result);
	}
}
class Eclipse{
	public static void main(String[] args) {
		Ellipse1 c1 = new Ellipse1();
		c1.area();
	}
}
