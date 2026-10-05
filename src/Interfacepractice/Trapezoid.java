package Interfacepractice;

interface Trapezoid1{
	void area();
}
class Trapezoid2 implements Trapezoid1{
	public void area() {
		System.out.println(0.5*(10+20)*30);
	}
}
public class Trapezoid {
	public static void main(String[] args) {
		Trapezoid2 t2 = new Trapezoid2();
		t2.area();
	}
}
