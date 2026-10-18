package copyConstructor;

public class CopyConstructor {
	String n;
	int id;
	
	//Constructor
	public CopyConstructor(String n, int id) {
		this.n=n;
		this.id=id;
		
	}
	
	//Copy Constructor
	public CopyConstructor(CopyConstructor c) {
		this.n=c.n;
		this.id=c.id;
	}
	
	@Override
	public String toString() {
		
		return n+" "+id;
	}
	
public static void main(String[] args) {
	CopyConstructor c1 = new CopyConstructor("bob",12);
	System.out.println(c1);
	CopyConstructor c2 = new CopyConstructor(c1);
	System.out.println(c2);
}
}
