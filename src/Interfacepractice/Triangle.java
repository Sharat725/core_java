package Interfacepractice;

interface Triangle1{
	void area();
}
class Triangle2 implements Triangle1{
	public void area() {
		System.out.println(0.5*10*20);
	}
}
public class Triangle {
	public static void main(String[] args) {
		Triangle2 t2 = new Triangle2();
		t2.area();
	}
}
