package Interfacepractice;

interface Ellipse1{
	void area();
}
class Ellipse2 implements Ellipse1{
	public void area() {
		System.out.println(3.142*10*20);
	}
}
public class Ellipse {
	public static void main(String[] args) {
		Ellipse2 e2 = new Ellipse2();
		e2.area();
	}
}
