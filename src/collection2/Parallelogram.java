package collection2;

public class Parallelogram {
	static Object[] arr= {1,5,9,3,4,1};
	static void area(Object[] obj) {
		for(int i=0;i<arr.length;i++) {
		int w=(int)obj[i];
		int h=(int)obj[i];
		System.out.println(w*h);
	}
	}
	public static void main(String[] args) {
		
			area(arr);
		
	}

}
