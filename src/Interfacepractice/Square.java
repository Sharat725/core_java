package Interfacepractice;

interface Square1{
	void area();
}
class Square2 implements Square1{
	public void area() {
		System.out.println(10*10);
	}
}
public class Square {
	public static void main(String[] args) {
		Square2 s2 = new Square2();
		s2.area();
	}
}
