package exceptionHandling;

public class AIOBE {
	public static void main(String[] args) {
		System.out.println("Main Starts");
		try {
			int[] arr= {10,20,30,40};
			System.out.println(arr[5]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Handled");
		}
		System.out.println("Main Ends");
	}

}
