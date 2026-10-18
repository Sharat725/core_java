package designPattern;

interface Car{
	void manufacture();
}

class Swift implements Car{
	public void manufacture(){
		System.out.println("Swift car");
	}
}

class Arena implements Car{
	public void manufacture() {
		System.out.println("Arena Car");
	}
}

class CarFactorye{
	public static Car carManufacture(String carName) {
		if(carName.equals("Swift")) {
			return new Swift();
		}
		if(carName.equals("Arena")) {
			return new Arena();
		}
		return null;
	}
}
public class Factory {
	public static void main(String[] args) {
		Car a1=CarFactorye.carManufacture("Swift");
		a1.manufacture();
		
		Car a2=CarFactorye.carManufacture("Arena");
		a2.manufacture();
		
		
	}

}
