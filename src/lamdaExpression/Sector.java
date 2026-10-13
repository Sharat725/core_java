package lamdaExpression;

interface Sector1{
	double area(int r,int thetha);
}
public class Sector {
	public static void main(String[] args) {
		Sector1 s1=(int r,int thetha)->{
			return 0.5*r*thetha;
		};
		System.out.println(s1.area(10, 30));
	}
}
