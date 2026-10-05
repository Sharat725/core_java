package collections1;

public class Trapezoid {
	static Object[] arr= {1,5,9,3,4,1};
	static void area(int input) {
		final double pi=3.142;
		int a=input;
		int b=input;
		int h=input;
		System.out.println(pi*(a+b)*h);
	}
	public static void main(String[] args) {
		for(int i=0;i<arr.length;i++) {
			area((int)arr[i]);
		}
	}

}
