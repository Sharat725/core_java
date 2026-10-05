package collection2;

public class Triangle {

	static Object[] arr= {1,5,9,3,4,1};
	static void area(Object[] obj) {
		for(int i=0;i<arr.length;i++) {
		int h=(int)obj[i];
		int b=(int)obj[i];
		System.out.println(0.5*h*b);
	}
	}
	public static void main(String[] args) {
		
			area(arr);
		
	}
}
