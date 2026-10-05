package polymorphismpractice;

class LG{
	void select() {
		System.out.println("items");
	}
}
class Mobiles extends LG{
	void select() {
		System.out.println("mobile items");
	}
}
class Refrigirators extends LG{
	void select() {
		System.out.println("Refrigirators items");
	}
}
class Televisions extends LG{
	void select() {
		System.out.println("Televisions items");
	}
}
class Stimulators{
	static void buy(LG l1) {
		l1.select();
	}
}

public class MainClass1 {
public static void main(String[] args) {
	Mobiles m1= new Mobiles();
	Refrigirators r1= new Refrigirators();
	Televisions t1= new Televisions();
	Stimulators.buy(m1);
	Stimulators.buy(r1);
	Stimulators.buy(t1);
}
}
