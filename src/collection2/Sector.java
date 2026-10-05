package collection2;

public class Sector {
	static Object[] arr= {1,5,9,3,4,1};
	static void area(Object[] obj) {
		for(int i=0;i<arr.length;i++) {
		final double pi=3.142;
		int r=(int)obj[i];
		int thetha=(int)obj[i];
		System.out.println(pi*r*thetha);
	}
	}
	public static void main(String[] args) {
		
			area(arr);
		
	}

}
