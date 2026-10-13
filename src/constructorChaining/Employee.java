package constructorChaining;

public class Employee {
	String name;
	String c_name;
	String dept;
	public Employee(String name) {
		this(name,"PU");
	}
	public Employee(String name,String c_name) {
		this(name,c_name,"IT");
		
	}
	public Employee(String name,String c_name,String dept) {
		this.name=name;
		this.c_name=c_name;
		this.dept=dept;
		
	}
	public static void main(String[] args) {
		Employee e1 = new Employee("Ramesh");
		System.out.println(e1.name+" "+e1.c_name+" "+e1.dept);
	}

}
