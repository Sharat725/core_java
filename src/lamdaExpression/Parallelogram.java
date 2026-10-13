package lamdaExpression;

interface Parallelogram1{
	void area(int l, int b);
}
public class Parallelogram {
	public static void main(String[] args) {
		Parallelogram1 p1=(int l,int b)->{
			System.out.println(l*b);
		};
		p1.area(10, 20);
	}
}
