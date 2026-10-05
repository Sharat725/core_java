package Abstractpractice;

abstract class Rectangle2 {
	abstract void area();
}
class Rectangle1 extends Rectangle2{
	void area() {
        int w = 10;
        int h = 20;
        double result = w * h; 
        System.out.println(result);
	}
}
class Rectangle{
	public static void main(String[] args) {
		Rectangle1 c1 = new Rectangle1();
		c1.area();
	}
}
