package exceptionHandling;

public class Nullpointer {
	public static void main(String[] args) {
		System.out.println("Main Starts");
		Nullpointer n1=null;
		try {
			
			System.out.println(n1.hashCode());
		}
		catch(NullPointerException e) {
			System.out.println("Handled");
		}
		System.out.println("Main Ends");

}
}
