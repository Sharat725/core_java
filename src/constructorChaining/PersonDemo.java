package constructorChaining;

class Demo1{
	public Demo1() {
		System.out.println("Person details");
	}
}
public class PersonDemo extends Demo1 {
	String name;
	String c_code;
	String country;
	public PersonDemo(String name) {
		this(name,"+91");
	}
	public PersonDemo(String name,String c_code) {
		this(name,c_code,"India");
	}
	public PersonDemo(String name,String c_code,String country) {
		this.name=name;
		this.c_code=c_code;
		this.country=country;
	}
	
	public static void main(String[] args) {
		PersonDemo p1=new PersonDemo("Suresh");
		System.out.println(p1.name+" "+p1.c_code+" "+p1.country);
	}

}
