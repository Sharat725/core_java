package polymorphismpractice;

class Films{
	void features() {
		System.out.println(" items");
	}
}
class Comedy extends Films{
	void features() {
		System.out.println("Comedy");
	}
}
class Romanic extends Films{
	void features() {
		System.out.println("Romanic ");
	}
}
class Action extends Films{
	void features() {
		System.out.println("Actions");
	}
}
class Stimulatosr{
	static void watch(Films l1) {
		l1.features();
	}
}

public class MainClass5 {
public static void main(String[] args) {
	Comedy s1 = new Comedy();
	Romanic d1 = new Romanic();
	Action m1= new Action();
	Stimulatosr.watch(s1);
	Stimulatosr.watch(d1);
	Stimulatosr.watch(m1);
}
}
