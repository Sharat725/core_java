package polymorphismpractice;

class Amazon{
	void buy() {
		System.out.println(" items");
	}
}
class Shoes extends Amazon{
	void buy() {
		System.out.println("Shoe items");
	}
}
class Dress extends Amazon{
	void buy() {
		System.out.println("Dress items");
	}
}
class Mobile extends Amazon{
	void buy() {
		System.out.println("Mobiles items");
	}
}
class Stimulator{
	static void purchase(Amazon l1) {
		l1.buy();
	}
}

public class MainClass2 {
public static void main(String[] args) {
	Shoes s1 = new Shoes();
	Dress d1 = new Dress();
	Mobile m1= new Mobile();
	Stimulator.purchase(s1);
	Stimulator.purchase(d1);
	Stimulator.purchase(m1);
}
}
