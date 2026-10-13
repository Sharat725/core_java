package constructorChaining;

class Demo2{
	public Demo2() {
		System.out.println("Student details");
	}
}
public class StudentDemo extends Demo2 {
	String name;
	String college;
	String branch;
	public StudentDemo(String name) {
		this(name,"PU");
	}
	public StudentDemo(String name,String college) {
		this(name,college,"CSE");
	}
	public StudentDemo(String name,String college,String branch) {
		this.name=name;
		this.college=college;
		this.branch=branch;
		
	}
	public static void main(String[] args) {
		StudentDemo s1 = new StudentDemo("Sharat");
		System.out.println(s1.name+" "+s1.college+" "+s1.branch);
	}

}
