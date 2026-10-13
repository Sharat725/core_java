package constructorChaining;

class Demo{
	public Demo() {
		System.out.println("Employee details");
	}
}
public class EmployeeDemo extends Demo {
	String name;
	String c_name;
	String dept;
	public EmployeeDemo(String name) {
		this(name,"PU");
	}
	public EmployeeDemo(String name,String c_name) {
		this(name,c_name,"IT");
		
	}
	public EmployeeDemo(String name,String c_name,String dept) {
		super();
		this.name=name;
		this.c_name=c_name;
		this.dept=dept;
		
	}
	public static void main(String[] args) {
		EmployeeDemo e1 = new EmployeeDemo("Ramesh");
		System.out.println(e1.name+" "+e1.c_name+" "+e1.dept);
	}

}
