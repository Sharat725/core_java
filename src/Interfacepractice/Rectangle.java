package Interfacepractice;

interface Rectangle1{
	void area();
}
class Rectangle2 implements Rectangle1{
	public void area() {
		System.out.println(10*20);
	}
}
public class Rectangle {
	public static void main(String[] args) {
		Rectangle2 r2 = new Rectangle2();
		r2.area();
	}
}
