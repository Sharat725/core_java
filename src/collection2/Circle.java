package collection2;

public class Circle {
	static Object[] arr= {1,5,9,3,4,1};
	static void area(Object[] obj) {
		final double pi=3.142;
		for(int i=0;i<arr.length;i++) {
		int r=(int)obj[i];
		System.out.println(pi*r*r);
	}
	}
	public static void main(String[] args) {
			area(arr);
	}

}
