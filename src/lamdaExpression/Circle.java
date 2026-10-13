package lamdaExpression;

interface Circle1{
	void area();
}
public class Circle {
	public static void main(String[] args) {
		Circle1  c1=()->{
			final double pi =3.142;
			int r=10;
			System.out.println(pi*r*r);
		};
		c1.area();
	}

}
