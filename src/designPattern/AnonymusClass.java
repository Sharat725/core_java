package designPattern;

//interface Sample{
//	void a();
//	void b();
//}

//or

abstract class Sample{
	abstract void a();
	abstract void b();
}

public class AnonymusClass {
	public static void main(String[] args) {
		Sample s1 = new Sample() {
			
			@Override
			public void b() {
				System.out.println("Hello");
				
			}
			
			@Override
			public void a() {
				System.out.println("Hi");
				
			}
		};
		s1.a();
		s1.b();
	}

}
