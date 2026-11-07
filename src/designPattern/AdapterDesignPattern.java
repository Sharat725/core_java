package designPattern;

interface Iphone6s{
	void chargeWith30pin();
}

class Iphone6sAdapter implements Iphone6s{
	Iphone4s a1=new Iphone4s();
	public void chargeWith30pin() {
		a1.chargeWith30pin();
		
	}
}

class Iphone4s{
	public void chargeWith30pin() {
		System.out.println("Charging with 30 pins");
	}
}
public class AdapterDesignPattern {
	public static void main(String[] args) {
		Iphone6s a2=new Iphone6sAdapter();
		a2.chargeWith30pin();
	}
}
