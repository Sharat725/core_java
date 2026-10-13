package lamdaExpression;

interface Square1{
	void area(int a);
}
public class Square {
	public static void main(String[] args) {
		Square1 s1=(int a)->{
			System.out.println(a*a);
		};
		s1.area(10);
	}

}
