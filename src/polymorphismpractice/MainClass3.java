package polymorphismpractice;

class Mobilez{
	void features() {
		System.out.println(" items");
	}
}
class Vivo extends Mobilez{
	void features() {
		System.out.println("Shoe items");
	}
}
class Oppo extends Mobilez{
	void features() {
		System.out.println("Oppo items");
	}
}
class Redmi extends Mobilez{
	void features() {
		System.out.println("Redmis items");
	}
}
class Stimulatorz{
	static void buy(Mobilez l1) {
		l1.features();
	}
}

public class MainClass3 {
public static void main(String[] args) {
	Vivo s1 = new Vivo();
	Oppo d1 = new Oppo();
	Redmi m1= new Redmi();
	Stimulatorz.buy(s1);
	Stimulatorz.buy(d1);
	Stimulatorz.buy(m1);
}
}
