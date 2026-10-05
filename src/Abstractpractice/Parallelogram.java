package Abstractpractice;

abstract class Parallelogram2 {
	abstract void area();
}
class Parallelogram1 extends Parallelogram2{
	void area() {
        int b = 10;
        int h = 20;
        double result = b * h; 
        System.out.println(result);
	}
}
class Parallelogram{
	public static void main(String[] args) {
		Parallelogram1 c1 = new Parallelogram1();
		c1.area();
	}
}
