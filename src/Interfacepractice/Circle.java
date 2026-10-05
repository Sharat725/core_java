package Interfacepractice;

interface Circle1{
	abstract void area();
}
class Circle2 implements Circle1{
	public void area() {
		System.out.println(3.142*10*10);
	}
}
public class Circle {
public static void main(String[] args) {
	Circle2 c2 = new Circle2();
	c2.area();
}
}
