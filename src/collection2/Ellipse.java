package collection2;

public class Ellipse {
	static Object[] arr= {1,5,9,3,4,1};
	static void area(Object[] obj) {
		for(int i=0;i<arr.length;i++) {
		final double pi=3.142;
		int a=(int)obj[i];
		int b=(int)obj[i];
		System.out.println(pi*a*b);
	}
	}
	public static void main(String[] args) {
		
			area(arr);
		
	}

}
