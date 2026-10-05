package Interfacepractice;

interface Parallelogram1{
	void area();
}
class Parallelogram2 implements Parallelogram1{
	public void area() {
		System.out.println(10*20);
	}
}
public class Parallelogram {
	public static void main(String[] args) {
		Parallelogram2 p2 = new Parallelogram2();
		p2.area();
	}
}
