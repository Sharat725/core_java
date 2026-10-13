package designPattern;


interface Payment{
	void payment();
}

class Upi implements Payment{
	public void payment() {
		System.out.println("Through upi");
	}
}
class Card implements Payment{
	public void payment() {
		System.out.println("Through card");
	}
}
class Cash implements Payment{
	public void payment() {
		System.out.println("Through cash");
	}
}

class Simulator {
	private static Payment p1;
	private Simulator() {
		System.out.println("payment success");
	}
	public static Payment getInstance(String method) {
		if(method.equalsIgnoreCase("upi")) {
			p1=new Upi();
		}else if(method.equalsIgnoreCase("card")) {
			p1=new Card();
		}else if(method.equalsIgnoreCase("cash")) {
			p1=new Cash();
		}
		return p1;
	}
}

public class Mainclass {
public static void main(String[] args) {
	Payment p1 = Simulator.getInstance("upi");
	p1.payment();
	Payment p2 = Simulator.getInstance("card");
	p2.payment();
	Payment p3 = Simulator.getInstance("cash");
	p3.payment();
	

	
}
}
