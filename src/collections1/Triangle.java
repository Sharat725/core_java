package collections1;

public class Triangle {
	static Object[] arr= {1,5,9,3,4,1};
	static void area(int input) {
		int h=input;
		int b=input;
		System.out.println(0.5*h*b);
	}
	public static void main(String[] args) {
		for(int i=0;i<arr.length;i++) {
			area((int)arr[i]);
		}
	}

}
