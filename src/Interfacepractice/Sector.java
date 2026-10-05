package Interfacepractice;

interface Sector1{
	void area();
}
class Sector2 implements Sector1{
	public void area() {
		System.out.println(0.5*10*10*30);
	}
}
public class Sector {
	public static void main(String[] args) {
		Sector2 s2 = new Sector2();
		s2.area();
	}
}
