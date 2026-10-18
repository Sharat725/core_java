package copyConstructor;
class Address1{
	String ad;
	public Address1(String ad) {
		this.ad=ad;
	}
}
public class DeepCopying {
		String n;
		int id;
		Address1 a1;
		
		//Constructor
		public DeepCopying(String n,int id,Address1 a1) {
			this.n=n;
			this.id=id;
			this.a1=a1;
			
			
		}
		
		//Copy Constructor
		public DeepCopying(DeepCopying s1) {
			this.n=s1.n;
			this.id=s1.id;
			this.a1= new Address1(s1.a1.ad);
			
		}
		
		@Override
		public String toString() {
			return n+" "+id+" "+a1.ad;
		}
		public static void main(String[] args) {
			Address1 a=new Address1("Landon");
			DeepCopying n1=new DeepCopying("bob",12,a);
			System.out.println(n1);
			DeepCopying n2 = new DeepCopying(n1);
			System.out.println(n2);
			System.out.println("***************");
			n2.a1.ad="Bengaluru";
			System.out.println(n1);
			System.out.println(n2);
		}

	}

