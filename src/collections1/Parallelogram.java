package collections1;

public class Parallelogram {
	static Object[] arr= {1,5,9,3,4,1};
	static void area(int input) {
		int w=input;
		int h=input;
		System.out.println(w*h);
	}
	public static void main(String[] args) {
		for(int i=0;i<arr.length;i++) {
			area((int)arr[i]);
		}
	}

}
