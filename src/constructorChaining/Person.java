package constructorChaining;

public class Person {
	String name;
	String c_code;
	String country;
	public Person(String name) {
		this(name,"+91");
	}
	public Person(String name,String c_code) {
		this(name,c_code,"India");
	}
	public Person(String name,String c_code,String country) {
		this.name=name;
		this.c_code=c_code;
		this.country=country;
	}
	
	public static void main(String[] args) {
		Person p1=new Person("Suresh");
		System.out.println(p1.name+" "+p1.c_code+" "+p1.country);
	}

}
