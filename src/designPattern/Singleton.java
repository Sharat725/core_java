package designPattern;

class IcIcI_Bank_01{
	private int bal=5000;
	static IcIcI_Bank_01 a1;
	
	
	static public IcIcI_Bank_01 getInstance() {
		if(a1==null) {
			a1=new IcIcI_Bank_01();
		}
		return a1;
	}
	
	public int getBal() {
		return bal;
	}
}
public class Singleton {
	public static void main(String[] args) {
		IcIcI_Bank_01 banglore = IcIcI_Bank_01.getInstance();
		System.out.println(banglore.getBal());
		IcIcI_Bank_01 manglore = IcIcI_Bank_01.getInstance();
		System.out.println(manglore.getBal());
		
	}

}
