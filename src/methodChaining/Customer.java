package methodChaining;

class Hotel{
	void food() {
		System.out.println("Hot hot fod");
	}
}

class DeliveryBoy{
	Hotel delivery() {
		Hotel h1 = new Hotel();
		return h1;
	}
}

class FoodApp{
	DeliveryBoy order() {
		DeliveryBoy d1 = new DeliveryBoy();
		return d1;
	}
}
public class Customer {
	public static void main(String[] args) {
//		FoodApp f1 = new FoodApp();
//		DeliveryBoy d2 = f1.order();
//		Hotel h2 = d2.delivery();
//		h2.food();
		
		new FoodApp().order().delivery().food();
		
	}

}
