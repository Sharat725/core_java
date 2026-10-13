package lamdaExpression;

interface Ellipse1{
	double area();
}
public class Ellipse {
	public static void main(String[] args) {
		Ellipse1 e1 = ()->{
			final double pi=3.142;
			int a=10;
			int b=20;
			return pi*a*b;
		};
		System.out.println(e1.area());
	}

}
