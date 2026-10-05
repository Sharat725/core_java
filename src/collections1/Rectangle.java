package collections1;

public class Rectangle {
	static Object[] arr= {1,5,9,3,4,1};
	static void area(int input) {
		int l=input;
		int b=input;
		System.out.println(l*b);
	}
	public static void main(String[] args) {
		for(int i=0;i<arr.length;i++) {
			area((int)arr[i]);
		}
	}

}
