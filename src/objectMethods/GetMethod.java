package objectMethods;

public class GetMethod {
	static Object[] arr= {10,20,30,40,50};
	
	static Object get(int index) {
		return arr[index];
	}
	
	public static void main(String[] args) {
		System.out.println(get(2));
	}

}
