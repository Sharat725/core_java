package designPattern;

interface Coffee{
	int cost();
}

class PlainCoffee implements Coffee{
	public int cost() {
		return 30;
	}
}

class Milk implements Coffee{
	Coffee c2;
	public Milk(Coffee c2) {
		this.c2=c2;
	}
	public int cost() {
		return c2.cost()+10;
	}
}

class Sugar implements Coffee{
	Coffee c3;
	public Sugar(Coffee c3) {
		this.c3=c3;
	}
	public int cost() {
		return c3.cost()+5;
	}
}
public class DecorativeDesignPattern {
	public static void main(String[] args) {
		Coffee c1=new PlainCoffee();
		c1=new Milk(c1);
		c1=new Sugar(c1);
		System.out.println(c1.cost());;
	}
}
