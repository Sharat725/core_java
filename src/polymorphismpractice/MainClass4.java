package polymorphismpractice;

class Train{
	void travel() {
		System.out.println(" items");
	}
}
class Firstclass extends Train{
	void travel() {
		System.out.println("1st classs ");
	}
}
class Sleeper extends Train{
	void travel() {
		System.out.println("Sleeper ");
	}
}
class Secondclass extends Train{
	void travel() {
		System.out.println("Secondclasss ");
	}
}
class Stimulatore{
	static void using(Train l1) {
		l1.travel();
	}
}

public class MainClass4 {
public static void main(String[] args) {
	Firstclass s1 = new Firstclass();
	Sleeper d1 = new Sleeper();
	Secondclass m1= new Secondclass();
	Stimulatore.using(s1);
	Stimulatore.using(d1);
	Stimulatore.using(m1);
}
}
