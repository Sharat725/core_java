package collections1;

public class Sector {
	static Object[] arr= {1,5,9,3,4,1};
	static void area(int input) {
		final double pi=3.142;
		int r=input;
		int thetha=input;
		System.out.println(pi*r*thetha);
	}
	public static void main(String[] args) {
		for(int i=0;i<arr.length;i++) {
			area((int)arr[i]);
		}
	}

}
