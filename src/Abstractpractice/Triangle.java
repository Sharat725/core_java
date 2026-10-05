package Abstractpractice;

abstract class Triangle2 {
	abstract void area();
}
class Triangle1 extends Triangle2{
	void area() {
        int b = 10;
        int h = 20;
        double result = 0.5 * b * h; 
        System.out.println(result);
	}
}
class Triangle{
	public static void main(String[] args) {
		Triangle1 c1 = new Triangle1();
		c1.area();
	}
}
