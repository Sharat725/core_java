package copyConstructor;

class Address{
	String ad;
	public Address(String ad) {
		this.ad=ad;
	}
}
public class ShallowCopying {
	String n;
	int id;
	Address a1;
	
	//Constructor
	public ShallowCopying(String n,int id,Address a1) {
		this.n=n;
		this.id=id;
		this.a1=a1;
		
		
	}
	
	//Copy Constructor
	public ShallowCopying(ShallowCopying s1) {
		this.n=s1.n;
		this.id=s1.id;
		this.a1=s1.a1;
		
	}
	
	@Override
	public String toString() {
		return n+" "+id+" "+a1.ad;
	}
	public static void main(String[] args) {
		Address a=new Address("Landon");
		ShallowCopying n1=new ShallowCopying("bob",12,a);
		System.out.println(n1);
		ShallowCopying n2 = new ShallowCopying(n1);
		System.out.println(n2);
		System.out.println("***************");
		n2.a1.ad="Bengaluru";
		System.out.println(n1);
		System.out.println(n2);
	}

}
