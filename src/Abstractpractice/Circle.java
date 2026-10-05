package Abstractpractice;

abstract class Circle2 {
	abstract void area();
}
class Circle1 extends Circle2{
	void area() {
		int r=10;
		double pi=3.142;
		double res=pi*r*r;
		System.out.println(res);
	}
}
class Circle{
	public static void main(String[] args) {
		Circle1 c1 = new Circle1();
		c1.area();
	}
}