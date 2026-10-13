package lamdaExpression;

interface Triangle1{
	double area(int b,int h);
}
public class Triangle {
	public static void main(String[] args) {
		Triangle1 t1=(int b,int h)->{
			return 0.5*b*h;
		};
		System.out.println(t1.area(10, 20));
	}

}
