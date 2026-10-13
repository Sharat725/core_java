package lamdaExpression;

interface Rectangle1{
	int area();
}
public class Rectangle {
	public static void main(String[] args) {
		Rectangle1 r1=()->{
			int l=10;
			int b=20;
			return l*b;
			
		};
		System.out.println(r1.area());
	}

}
