package lamdaExpression;

interface Trapezoid1{
	void area();
}
public class Trapezoid {
	public static void main(String[] args) {
		Trapezoid1 t1=()->{
			int a=10;
			int b=20;
			int h=15;
			System.out.println(0.5*(a+b)*h);
		};
		t1.area();
	}
}
