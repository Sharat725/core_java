package Abstractpractice;

abstract class Square2 {
	abstract void area();
}
class Square1 extends Square2{
	void area() {
        int a = 10;
        double result = a*a; 
        System.out.println(result);
	}
}
class Square{
	public static void main(String[] args) {
		Square1 c1 = new Square1();
		c1.area();
	}
}
