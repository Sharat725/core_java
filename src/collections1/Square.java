package collections1;

public class Square {

	static Object[] arr= {1,5,9,3,4,1};
	static void area(int input) {
		int a=input;
	
		System.out.println(a*a);
	}
	public static void main(String[] args) {
		for(int i=0;i<arr.length;i++) {
			area((int)arr[i]);
		}
	}
}
