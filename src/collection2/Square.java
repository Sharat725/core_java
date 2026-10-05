package collection2;

public class Square {
	static Object[] arr= {1,5,9,3,4,1};
	static void area(Object[] obj) {
		for(int i=0;i<arr.length;i++) {
		int a=(int)obj[i];
	
		System.out.println(a*a);
	}
	}
	public static void main(String[] args) {
		
			area(arr);
		
	}


}
