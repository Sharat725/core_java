package exceptionHandling;

public class NullPoint {
	public static void main(String[] args) {
		System.out.println("Main Starts");
		
		try {
			NullPoint n1 = null;
			System.out.println(n1.hashCode());
		}
		catch(NullPointerException e) {
			System.out.println("Handled");
		}
		System.out.println("Main Ends");
		
	}

}
