package exceptionHandling;

public class Arithmetic {
	public static void main(String[] args) {
		System.out.println("Main Starts");
		try {
			int a=1/0;
			System.out.println(a);
		}
		catch(ArithmeticException e) {
			System.out.println("Handled");
		}
		System.out.println("Main Ends");
	}

}
